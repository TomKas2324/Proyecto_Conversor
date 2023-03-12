package enums;

public enum FactoresMedidas {
	
	DEKILOMETROSAMILLAS("Kilometros a Millas",0.621,"Kilometers to Miles"),
	DEMILLASAKILOMETROS("Millas a Kilometros",1.609,"Miles to Kilometers"),
	DEKILOMETROSAYARDAS("Kilometros a Yardas",1093.61,"Kilometers to Yards"),
	DEYARDASAKILOMETROS("Yardas a Kilometros",0.0009,"Yards to Kilometers"),
	DEMETROSAYARDAS("Metros a Yardas",1.094,"Meters to Yards"),
	DEYARDASAMETROS("Yardas a Metros",0.914,"Yards to Meters"),
	DEMETROSAPIES("Metros a Pies",3.28,"Meters to Foots"),
	DEPIESAMETROS("Pies a Metros",0.304,"Foot to Meters"),
	DECENTIMETROSAPULGADAS("Centimetros a Pulgadas",0.393,"Centimeters to Inches"),
	DEPULGADASACENTIMETROS("Pulgadas a Centimetros",2.54,"Inches to Centimeters");
	
	
	
	private String NombreDeOpcion;
	private Double FactorConversion;
	private String NombreDeOpcionIngles;
	
	private FactoresMedidas(String NombreDeOpcion, Double factorConversion, String NombreOpcionIngles) {
		this.NombreDeOpcion = NombreDeOpcion;
		this.FactorConversion = factorConversion;
		this.NombreDeOpcionIngles = NombreOpcionIngles;
	}
	
	public String getNombreDeOpcion() {
		return NombreDeOpcion;
	}

	public Double getFactorConversion() {
		return FactorConversion;
	}

	public String getNombreDeOpcionIngles() {
		return NombreDeOpcionIngles;
	}

}
