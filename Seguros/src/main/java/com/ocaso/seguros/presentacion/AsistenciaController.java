package com.ocaso.seguros.presentacion;
import com.ocaso.seguros.modelo.Asistencia;
import com.ocaso.seguros.persistencia.dao.impl.AsistenciaDAOimpljpa;
import com.ocaso.seguros.persistencia.dao.AsistenciaDAO;

public class AsistenciaController {

	AsistenciaDAO AsistenciaDAO;
	
	public AsistenciaController() {
		
		AsistenciaDAO = new AsistenciaDAOimpljpa();
		
	}
	
	public void Ejercicio4() {
		
		System.out.println("Mostrando seguros con un importe mayor a 10000:" + "\n");
		for(Asistencia as : AsistenciaDAO.Ex4_ShowExpensiveAssistence()) {
			
			System.out.println(as.toString());
			
			
		}
		
	}
	
	public void Ejercicio5() {
		
		System.out.println("Mostrando seguros con un importe entre a 8000 y 15000:" + "\n");
		for(Asistencia as : AsistenciaDAO.Ex5_RecoverAssistenceID(8000, 15000)) {
			
			System.out.println(as.toString());
			
			
		}
		
	}
		
	public void Ejercicio6() {
		
		System.out.println("La suma total de todos los importes de las asistencias medicas es " + AsistenciaDAO.Ex6_AllImportCalculate());		
		
	}
		
	public void Ejercicio7() {
		
		System.out.println("La media de todos los importes de las asistencias medicas es " + AsistenciaDAO.Ex7_CalculateMediumImport());
		
	}
	
	
	
}
