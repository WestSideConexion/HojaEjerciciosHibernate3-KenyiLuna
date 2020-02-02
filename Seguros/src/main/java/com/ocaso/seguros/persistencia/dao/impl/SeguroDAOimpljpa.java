package com.ocaso.seguros.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ocaso.seguros.modelo.Asistencia;
import com.ocaso.seguros.modelo.Seguro;
import com.ocaso.seguros.persistencia.jpa.Utilidades;

import com.ocaso.seguros.persistencia.dao.SeguroDAO;
import com.ocaso.seguros.persistencia.dao.impl.GenericDAOimpljpa;

public class SeguroDAOimpljpa extends GenericDAOimpljpa<Seguro,Integer> implements  SeguroDAO{

	public List<Seguro> Ex1_showallsecures() {
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Seguro> q  = em.createQuery(
				"select s " +
				"from seguro s ", Seguro.class);
		
		List<Seguro> seguros = q.getResultList();
		return seguros;
	}
	
	public void Ex2_showNIFandname() {
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Seguro> q  = em.createQuery(
				"select s " +
				"from Seguro s ", Seguro.class);
		
		List<Seguro> seguros = q.getResultList();
		for (Seguro seg : seguros) {
			
			System.out.println("Nif : " + seg.getNif() + " - " + "Nombre: " + seg.getNombre());
			
		}
			
	}
	
	public void Ex3_showNIFfromName(String nombre, String apellido1, String apellido2) {
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Seguro> q =  em.createQuery(
				"select s " +
				"from seguro s " +
				"where s.nombre = :nombre AND ape1 = :apellido1 AND ape2 = :apellido2", Seguro.class);
		q.setParameter("nombre", nombre).setParameter("apellido1", apellido1).setParameter("apellido2", apellido2);
		Seguro seg1 = (Seguro)q.getSingleResult();		
		System.out.println("El nif correspondiente al usuario indicado es :" + seg1.getNif());
		
		
		
	}
	
	public long Ex8_ShowNumberOfSecures() {
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Long> q = em.createQuery(
				"select count(*) " +
				"from seguro c ", Long.class);
		
		Long count = q.getSingleResult();
		
		return count;
		
			
	}
	
	
	
	public void Ex9_ShowNameNifAndAsistence() {
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Object[]> q = em.createQuery(
				"SELECT nombre, nif , count(a.seguroId) " +
				"FROM seguro s, asistencia a " +
				"where s.id = a.seguroId ", Object[].class);
		List<Object[]> results = q.getResultList();
		for (Object[] result: results) {
			System.out.println("Seguro a nombre de : " + result[0] + " Nif: " + result[1] + "Número de asistencias: " + result[2]);
		
	}
	}
	
	public List<String> Ex10_ReturnAlergiesFromSecure(){
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<String> q = em.createQuery(
				"SELECT e.nombreAlergia" +
				"FROM seguro s, enfermedad e" +
				"where s.enfermedadId = e.id ", String.class);
		List<String> results = q.getResultList();
		
		
		return results;
		
	}
	
	public void Ex11_ShowAllIdAsistence(){
		
		
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Seguro> q  = em.createQuery(
				"select s " +
				"from seguro s ", Seguro.class);
		
		List<Seguro> seguros = q.getResultList();
		
		for(Seguro seg : seguros) {
			
				System.out.println("Seguro a nombre de: " + seg.getNombre() + "\n");
			
			for(Asistencia as : seg.getAsistencias()) {
				
				System.out.println("Asistencia id: " + as.getId());
				
			}
			
			
		}
		
		
		
		
	}
	
	
}
