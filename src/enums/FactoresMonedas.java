package enums;

public enum FactoresMonedas {
	
	DEDOLARAPESO("Dolar Estadounidense a Peso Argentino",200.34),
	DEPESOADOLAR("Peso Argentino a Dolar Estadounidense",0.0051),
	DEPESOAEURO("Peso Argentino a Euro",0.0047),
	DEEUROAPESO("Euro a Peso Argentino",210.0),
	DEPESOAYEN("Peso Argentino a Yen Japones",0.69),
	DEYENAPESO("Yen Japones a Peso Argentino",1.46),
	DEPESOALIBRA("Peso Argentino a Libra Esterlina",0.0042),
	DELIBRAAPESO("Libra Esterlina a Peso Argentino",238.26),
	DEPESOAWON("Peso Argentino a Won Coreano",6.59);
	
	private String opcionConversion;
	private double factorConversion;

	
	private FactoresMonedas(String opcionConversion, double factorConversion) {
		this.opcionConversion = opcionConversion;
		this.factorConversion = factorConversion;
	}

	public String getNombreDeOpcion() {
		return opcionConversion;
	}

	public double getFactorConversion() {
		return factorConversion;
	}

	
	
	
	
}
