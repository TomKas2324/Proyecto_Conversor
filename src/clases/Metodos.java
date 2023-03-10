package clases;

import java.util.*;
import enums.FactoresMonedas;
import enums.FactoresTemperatura;
import uis.InterfazInicial;

public class Metodos extends InterfazInicial {

	//Listas de Monedas
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<String> ListaDeNombresDeOpcionesMonedas = new ArrayList<>();
	public List<Double> ListaDeFactoresDeConversionesMonedas = new ArrayList<>();
	
	//Listas de Temperatura
	
	public List<String> ListaDeNombresDeOpcionesTemperatura = new ArrayList<>();
	public List<Double> ListaDeFactoresDeConversionesTemperatura = new ArrayList<>();
	public List<Double> ListaDeConstantesASumarTemperatura = new ArrayList<>();
	
	//Listas de Medidas
	
	
	public void añadirOpciones(InterfazInicial interfaz) {
		for(FactoresMonedas var : FactoresMonedas.values()) {
			ListaDeNombresDeOpcionesMonedas.add(var.getNombreDeOpcion());
			ListaDeFactoresDeConversionesMonedas.add(var.getFactorConversion());
		}
		for(FactoresTemperatura var : FactoresTemperatura.values()) {
			ListaDeNombresDeOpcionesTemperatura.add(var.getNombreDeOpcion());
			ListaDeFactoresDeConversionesTemperatura.add(var.getFactorConversion());
			ListaDeConstantesASumarTemperatura.add(var.getConstanteASumar());
				
			}
		añadirAComboBox(interfaz);
		}
	
	public Double obtenerFactorMonedas(String eleccion) {
		int i = 0;
		Double rslt = 0.0;
		
		for(String var : ListaDeNombresDeOpcionesMonedas) {
			if(var == eleccion) {rslt = ListaDeFactoresDeConversionesMonedas.get(i);}
			i++;
		}
		return rslt;
	}
	
	public Double obtenerFactorTemperatura(String eleccion) {
		int i = 0;
		Double rslt = 0.0;
		
		for(String var : ListaDeNombresDeOpcionesTemperatura) {
			if(var == eleccion) {rslt = ListaDeFactoresDeConversionesTemperatura.get(i);}
			i++;
		}
		return rslt;
	}
	
	public Double obtenerConstanteTemperatura(String eleccion) {
		int i = 0;
		Double rslt = 0.0;
		
		for(String var : ListaDeNombresDeOpcionesTemperatura) {
			if(var == eleccion) {rslt = ListaDeConstantesASumarTemperatura.get(i);}
			i++;
		}
		return rslt;
	}

	public void añadirAComboBox(InterfazInicial interfaz) {
		for(Object var : ListaDeNombresDeOpcionesMonedas) {interfaz.OpcionConversionMonedas.addItem(var);}
		for(Object var : ListaDeNombresDeOpcionesTemperatura) {interfaz.OpcionConversionTemperatura.addItem(var);}
	}
}
	

