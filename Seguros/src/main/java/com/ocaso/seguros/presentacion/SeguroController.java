package com.ocaso.seguros.presentacion;
import com.ocaso.seguros.modelo.Seguro;
import com.ocaso.seguros.persistencia.dao.impl.SeguroDAOimpljpa;
import com.ocaso.seguros.persistencia.dao.SeguroDAO;

public class SeguroController {
	
	SeguroDAO SeguroDAO;
	
	public SeguroController() {
		
		SeguroDAO = new SeguroDAOimpljpa();
		
	}
	
	public void guardar(Seguro seg) {
        SeguroDAO.persist(seg);
    }

	public void Ejercicio1() {
		
		for (Seguro seg : SeguroDAO.Ex1_showallsecures()) {
			
			System.out.println(seg.toString());
		
	}
	}
		
	public void Ejercicio2() {
		
	System.out.println("Mostrando Nif y Nombres de los seguros de la base de datos" + "\n");
	SeguroDAO.Ex2_showNIFandname();
		
	}
	
	public void Ejercicio3() {
		
	SeguroDAO.Ex3_showNIFfromName("Maria","Garcia", "Lozano");
		
	}
	
	public void Ejercicio8() {
		
	System.out.println("El numero de seguros es: " + SeguroDAO.Ex8_ShowNumberOfSecures());	
		
	}
	
	public void Ejercicio9() {
		
	System.out.println("Mostrando el nombre, nif y numero de asistencias de todos los seguros" + "\n");
	SeguroDAO.Ex9_ShowNameNifAndAsistence();
		
	}
	
	public void Ejercicio10() {
		
		
		System.out.println("Mostrando el nombre de la alergia correspondiente a cada seguro" + "\n");
		for(String str : SeguroDAO.Ex10_ReturnAlergiesFromSecure()) {
			
			System.out.println(str);
			
		}
		
	}
	
	public void Ejercicio11() {
		
		System.out.println("Mostrando los ID de cada asistencia correspondiente a cada seguro: " + "\n");
		SeguroDAO.Ex11_ShowAllIdAsistence();
		
		
	}
	
}
