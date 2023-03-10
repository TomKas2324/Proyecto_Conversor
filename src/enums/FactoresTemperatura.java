package enums;

public enum FactoresTemperatura {
	
	DECELSIUSAFAHRENHEIT("Grados Celsius a Fahrenheit",1.8,32),
	DEFAHRENHEITACELSIUS("Grados Fahrenheit a Celsius",0.5556,-17.77),
	DECELSIUSAKELVIN("Grados Celsius a Kelvin",1,273.15),
	DEKELVINACELSIUS("Grados Kelvin a Celsius",1,-273.15),
	DEFAHRENHEITAKELVIN("Fahrenheit a Kelvin",0.5556,255.372),
	DEKELVINAFAHRENHEIT("Kelvin a Fahrenheit",1.8,-459.67);
	
	private String NombreDeOpcion;
	private double Factor;
	private double ConstanteASumar;
	
	
	private FactoresTemperatura(String NombreDeOpcion, double Factor, double ConstanteASumar) {
		
		this.NombreDeOpcion = NombreDeOpcion;
		this.Factor = Factor;
		this.ConstanteASumar = ConstanteASumar;
	}


	public String getNombreDeOpcion() {return NombreDeOpcion;}


	public double getFactorConversion() {return Factor;}


	public double getConstanteASumar() {return ConstanteASumar;}
	
	
	
}
