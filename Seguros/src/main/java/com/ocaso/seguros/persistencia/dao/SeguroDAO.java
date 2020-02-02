package com.ocaso.seguros.persistencia.dao;


import java.util.List;

import com.ocaso.seguros.modelo.Seguro;

	public interface SeguroDAO extends GenericDAO<Seguro,Integer> {
		
		public List<Seguro> Ex1_showallsecures();
		public void Ex2_showNIFandname();
		public void Ex3_showNIFfromName(String nombre, String apellido1, String apellido2);
		public long Ex8_ShowNumberOfSecures();
		public void Ex9_ShowNameNifAndAsistence();
		public List<String> Ex10_ReturnAlergiesFromSecure();
		public void Ex11_ShowAllIdAsistence();
		
		

	}
	
	
	

