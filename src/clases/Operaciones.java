package clases;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operaciones {

	
	// Funcion de conversion de valores para las monedas
	
	public String OperacionMonedas(double FactorConversion, double CantidadInsertada) {
		
		double resultado = FactorConversion * CantidadInsertada;
		String resultadoString = Double.toString(resultado);
		String[] decimalesResultado = resultadoString.split("\\.");
		String resultadoFinal = Double.toString(resultado);
		
		if(decimalesResultado[1].length() >= 3) {
			BigDecimal resultadoDecimal = new BigDecimal(resultado).setScale(3, RoundingMode.CEILING);
			resultadoFinal = resultadoDecimal.toString();
		}
		return resultadoFinal;
		
		
		
	}
	
	// Funcion de conversion de valores para las temperaturas
	
	public String OperacionTemperatura(Double FactorConversion, double CantidadInsertada,double ConstanteASumar) {
		double resultado = FactorConversion * CantidadInsertada + ConstanteASumar;
		BigDecimal resultadoDecimal = new BigDecimal(resultado).setScale(2, RoundingMode.CEILING);
		String resultadoFinal = resultadoDecimal.toString();
		return resultadoFinal;
	}
	
	public String OperacionMedidas() {
		
		return "";
	}
}
