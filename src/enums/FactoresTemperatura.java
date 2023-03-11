package enums;

public enum FactoresTemperatura {
	
	DECELSIUSAFAHRENHEIT("Grados Celsius a Fahrenheit",1.8,32,"Degrees Celsius to Fahrenheit"),
	DEFAHRENHEITACELSIUS("Grados Fahrenheit a Celsius",0.5556,-17.77,"Degrees Fahrenheit to Celsius"),
	DECELSIUSAKELVIN("Grados Celsius a Kelvin",1,273.15,"Degrees Celsius to Kelvin"),
	DEKELVINACELSIUS("Grados Kelvin a Celsius",1,-273.15,"Degrees Kelvin to Celsius"),
	DEFAHRENHEITAKELVIN("Fahrenheit a Kelvin",0.5556,255.372,"Degrees Fahrenheit to Kelvin"),
	DEKELVINAFAHRENHEIT("Kelvin a Fahrenheit",1.8,-459.67,"Degrees Kelvin to Fahrenheit");
	
	private String NombreDeOpcion;
	private double Factor;
	private double ConstanteASumar;
	private String NombreDeOpcionIngles;
	
	private FactoresTemperatura(String NombreDeOpcion, double Factor, double ConstanteASumar, String nombreDeOpcionIngles) {
		
		this.NombreDeOpcion = NombreDeOpcion;
		this.Factor = Factor;
		this.ConstanteASumar = ConstanteASumar;
		this.NombreDeOpcionIngles = nombreDeOpcionIngles;
	}


	public String getNombreDeOpcion() {return NombreDeOpcion;}


	public double getFactorConversion() {return Factor;}


	public double getConstanteASumar() {return ConstanteASumar;}
	
	public String getNombreDeOpcionIngles() {return NombreDeOpcionIngles;}
	
	
}
