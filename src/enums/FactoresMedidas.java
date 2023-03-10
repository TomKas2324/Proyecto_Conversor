package enums;

public enum FactoresMedidas {
	
	DEKILOMETROSAMILLAS("Kilometros a millas"),
	DEMILLASAKILOMETROS("Millas a Kilometros");
	
	
	private String NombreDeOpcion;
	
	private FactoresMedidas(String NombreDeOpcion) {
		this.NombreDeOpcion = NombreDeOpcion;
	}
	
}
