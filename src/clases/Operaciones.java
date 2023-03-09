package clases;

import enums.FactoresMonedas;

public class Operaciones {

	
	// Funcion de conversion de valores para las monedas
	public String OperacionMonedas(double FactorConversion, double CantidadInsertada) {
		
		double resultado = FactorConversion * CantidadInsertada;
		
		String resultadoFinal = Double.toString(resultado);
		return resultadoFinal;
		
	}
	
	
}
