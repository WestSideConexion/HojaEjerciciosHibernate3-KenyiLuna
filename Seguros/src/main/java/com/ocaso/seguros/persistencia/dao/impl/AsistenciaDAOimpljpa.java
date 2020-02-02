package com.ocaso.seguros.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;

import com.ocaso.seguros.modelo.Asistencia;
import com.ocaso.seguros.persistencia.jpa.Utilidades;
import com.ocaso.seguros.persistencia.dao.AsistenciaDAO;
import com.ocaso.seguros.persistencia.dao.impl.GenericDAOimpljpa;

public class AsistenciaDAOimpljpa extends GenericDAOimpljpa<Asistencia,Integer> implements  AsistenciaDAO{
	
	
	public List<Asistencia> Ex4_ShowExpensiveAssistence(){
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Asistencia> asis = em.createQuery(
				"select a " +
				"from asistencia a " + "where importe >= 10000",Asistencia.class);
		List<Asistencia> asis2 = asis.getResultList();
		return asis2;
		
	}
	
	public List<Asistencia> Ex5_RecoverAssistenceID(int num1,int num2) {
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Asistencia> asis = em.createQuery(
				"select a " +
				"from asistencia a " + "where a.importe > :imp1 AND a.importe < :imp2",Asistencia.class);
				asis.setParameter("imp1", num1).setParameter("imp2", num2);
		
		List<Asistencia> asis2 = asis.getResultList();
		return asis2;	
		
	}
	
	public double Ex6_AllImportCalculate() {
		
		double sum=0;
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Asistencia> asis = em.createQuery(
				"select a " +
				"from asistencia a ",Asistencia.class);
		List<Asistencia> asis2 = asis.getResultList();
		
		for (Asistencia asi : asis2) {
			
			sum = sum + asi.getImporte().doubleValue();
			
		}
		
		return sum;
		
	}
	
	public double Ex7_CalculateMediumImport() {
		
		double med=0;
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Asistencia> asis = em.createQuery(
				"select a " +
				"from asistencia a ",Asistencia.class);
		List<Asistencia> asis2 = asis.getResultList();
		
		for (Asistencia asi : asis2) {
			
			med = med + asi.getImporte().doubleValue();
			
		}
		
		return med/asis2.size();
		
		
		
	}
	
	
	
}
