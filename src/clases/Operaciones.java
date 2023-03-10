package clases;

public class Operaciones {

	
	// Funcion de conversion de valores para las monedas
	public String OperacionMonedas(double FactorConversion, double CantidadInsertada) {
		
		double resultado = FactorConversion * CantidadInsertada;
		String resultadoFinal = Double.toString(resultado);
		return resultadoFinal;
	}
	// Funcion de conversion de valores para las temperaturas
	public String OperacionTemperatura(Double FactorConversion, double CantidadInsertada,double ConstanteASumar) {
		double resultado = FactorConversion * CantidadInsertada + ConstanteASumar;
		String resultadoFinal = Double.toString(Math.round(resultado*10)/10); 
		return resultadoFinal;
	}
	
	public String OperacionMedidas() {
		
		return "";
	}
}
