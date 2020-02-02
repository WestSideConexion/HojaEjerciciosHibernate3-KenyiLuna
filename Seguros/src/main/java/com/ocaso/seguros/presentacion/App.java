package com.ocaso.seguros.presentacion;

import javax.persistence.EntityManager;

import com.ocaso.seguros.persistencia.jpa.Utilidades;

public class App {

	public static void main(String[] args) {
		
		EntityManager em = null; 
		
		try {
			em = Utilidades.getEntityManagerFactory().createEntityManager();			

			SeguroController sc = new SeguroController();
			AsistenciaController ac = new AsistenciaController();
			
			sc.Ejercicio1();
			sc.Ejercicio2();
			sc.Ejercicio3();
			ac.Ejercicio4();
			ac.Ejercicio5();
			ac.Ejercicio6();
			ac.Ejercicio7();
			sc.Ejercicio8();
			sc.Ejercicio9();
			sc.Ejercicio10();
			sc.Ejercicio11();
			
			
			
		} catch (Exception e ) {
			if (em != null) {
				e.printStackTrace();
				System.out.println("Se va a hacer rollback de la transacción");
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		Utilidades.closeEntityManagerFactory();
    }


	

}
