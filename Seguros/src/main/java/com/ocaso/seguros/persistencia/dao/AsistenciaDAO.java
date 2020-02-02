package com.ocaso.seguros.persistencia.dao;

import java.util.List;

import com.ocaso.seguros.modelo.Asistencia;

public interface AsistenciaDAO extends GenericDAO<Asistencia,Integer>  {
	
	public List<Asistencia> Ex4_ShowExpensiveAssistence();
	public List<Asistencia> Ex5_RecoverAssistenceID(int num1,int num2);
	public double Ex6_AllImportCalculate();
	public double Ex7_CalculateMediumImport();
	
	
}
