package clases;

import java.util.*;
import enums.FactoresMonedas;
import uis.InterfazInicial;

public class Metodos extends InterfazInicial {

	public List<String> ListaDeNombresDeOpciones = new ArrayList<>();
	public List<Double> ListaDeFactoresDeConversiones = new ArrayList<>();
	
	
	
	public void añadirOpcionesMonedas() {
		for(FactoresMonedas var : FactoresMonedas.values()) {
			ListaDeNombresDeOpciones.add(var.getOpcionConversion());
			ListaDeFactoresDeConversiones.add(var.getFactorConversion());
		}
	}
	public Double obtenerFactorMonedas(String eleccion) {
		int i = 0;
		Double rslt = 0.0;
		for(String var : ListaDeNombresDeOpciones) {
			
			if(var == eleccion) {
				rslt = ListaDeFactoresDeConversiones.get(i);
			}
			i++;
		}return rslt;

	
		
		
	}
}
	

