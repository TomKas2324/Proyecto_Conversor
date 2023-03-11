package enums;

public enum FactoresMonedas {
	
	DEDOLARAPESO("Dolar Estadounidense a Peso Argentino",200.34,"American Dolar to Argentine Peso"),
	DEPESOADOLAR("Peso Argentino a Dolar Estadounidense",0.0051,"Argentine Peso to American Dolar"),
	DEPESOAEURO("Peso Argentino a Euro",0.0047,"Argentine Peso to Euro"),
	DEEUROAPESO("Euro a Peso Argentino",210.0,"Euro to Argentine Peso"),
	DEPESOAYEN("Peso Argentino a Yen Japones",0.69,"Argentine Peso to Japanese Yen"),
	DEYENAPESO("Yen Japones a Peso Argentino",1.46,"Japanese Yen to Argentine Peso"),
	DEPESOALIBRA("Peso Argentino a Libra Esterlina",0.0042,"Argentine Peso to Pound Sterling"),
	DELIBRAAPESO("Libra Esterlina a Peso Argentino",238.26,"Pound Sterling to Argentine Peso"),
	DEPESOAWON("Peso Argentino a Won Surcoreano",6.59,"Argentine Peso to SouthKorean Won"),
	DEWONAPESO("Won Surcoreano a Peso Argentino",0.15,"SouthKorean Won to Argentine Peso");
	
	private String opcionConversion;
	private double factorConversion;
	private String opcionConversionIngles;

	
	private FactoresMonedas(String opcionConversion, double factorConversion, String opcionConversionIngles) {
		this.opcionConversion = opcionConversion;
		this.factorConversion = factorConversion;
		this.opcionConversionIngles = opcionConversionIngles;
	}

	public String getNombreDeOpcion() {
		return opcionConversion;
	}

	public double getFactorConversion() {
		return factorConversion;
	}

	public String getOpcionConversionIngles() {
		return opcionConversionIngles;
	}
	
	
	
}
