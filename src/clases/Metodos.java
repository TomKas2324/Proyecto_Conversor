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
	public List<String> ListaDeNombresDeOpcionesInglesMonedas = new ArrayList<>();

	//Listas de Temperatura
	
	public List<String> ListaDeNombresDeOpcionesTemperatura = new ArrayList<>();
	public List<Double> ListaDeFactoresDeConversionesTemperatura = new ArrayList<>();
	public List<Double> ListaDeConstantesASumarTemperatura = new ArrayList<>();
	public List<String> ListaDeNombresDeOpcionesInglesTemperatura = new ArrayList<>();
	
	//Listas de Medidas
	
	
	public void añadirOpciones(InterfazInicial interfaz) {
		for(FactoresMonedas var : FactoresMonedas.values()) {
			ListaDeNombresDeOpcionesMonedas.add(var.getNombreDeOpcion());
			ListaDeFactoresDeConversionesMonedas.add(var.getFactorConversion());
			ListaDeNombresDeOpcionesInglesMonedas.add(var.getOpcionConversionIngles());
		}
		for(FactoresTemperatura var : FactoresTemperatura.values()) {
			ListaDeNombresDeOpcionesTemperatura.add(var.getNombreDeOpcion());
			ListaDeFactoresDeConversionesTemperatura.add(var.getFactorConversion());
			ListaDeConstantesASumarTemperatura.add(var.getConstanteASumar());
			ListaDeNombresDeOpcionesInglesTemperatura.add(var.getNombreDeOpcionIngles());	
			}
		añadirAComboBox(interfaz);
		}
	
	public Double obtenerFactorMonedas(String eleccion) {
		int i = 0;
		int l = 0;
		Double rslt = 0.0;
		for(String var : ListaDeNombresDeOpcionesMonedas) {
			if(var == eleccion) {rslt = ListaDeFactoresDeConversionesMonedas.get(i);}
			i++;
		}
		for(String var : ListaDeNombresDeOpcionesInglesMonedas) {
			if(var == eleccion) {rslt = ListaDeFactoresDeConversionesMonedas.get(l);}
			l++;
		}
		return rslt;
	}
	
	public Double obtenerFactorTemperatura(String eleccion) {
		int i = 0;
		int l = 0;
		Double rslt = 0.0;
		for(String var : ListaDeNombresDeOpcionesTemperatura) {
			if(var == eleccion) {rslt = ListaDeFactoresDeConversionesTemperatura.get(i);}
			i++;
		}
		for(String var : ListaDeNombresDeOpcionesInglesTemperatura) {
			if(var == eleccion) {rslt = ListaDeFactoresDeConversionesTemperatura.get(l);}
			l++;
		}
		return rslt;
	}
	
	public Double obtenerConstanteTemperatura(String eleccion) {
		int i = 0;
		int l = 0;
		Double rslt = 0.0;
		
		for(String var : ListaDeNombresDeOpcionesTemperatura) {
			if(var == eleccion) {rslt = ListaDeConstantesASumarTemperatura.get(i);}
			i++;
		}
		for(String var : ListaDeNombresDeOpcionesInglesTemperatura) {
			if(var == eleccion) {rslt = ListaDeConstantesASumarTemperatura.get(l);}
			l++;
		}
		return rslt;
	}

	public void añadirAComboBox(InterfazInicial interfaz) {
		for(Object var : ListaDeNombresDeOpcionesMonedas) {interfaz.OpcionConversionMonedas.addItem(var);}
		for(Object var : ListaDeNombresDeOpcionesTemperatura) {interfaz.OpcionConversionTemperatura.addItem(var);}
	}
	
	public void añadirAComboBoxIngles(InterfazInicial interfaz) {
		for(Object var : ListaDeNombresDeOpcionesInglesMonedas) {interfaz.OpcionConversionMonedas.addItem(var);}
		for(Object var : ListaDeNombresDeOpcionesInglesTemperatura) {interfaz.OpcionConversionTemperatura.addItem(var);}
	}
	
	public void cambiarLabelOpciones(InterfazInicial interfaz,String texto) {
		interfaz.labelOpcionesMedidas.setText(texto);
		interfaz.labelOpcionesMonedas.setText(texto);
		interfaz.labelOpcionesTemperatura.setText(texto);
	}
	
	public void cambiarLabelCantidad(InterfazInicial interfaz,String texto) {
		interfaz.labelCantidadMedidas.setText(texto);
		interfaz.labelCantidadMonedas.setText(texto);
		interfaz.labelCantidadTemperatura.setText(texto);
	}
	
	public void cambiarTitulosTabs(InterfazInicial interfaz,Map<Integer, String> lista) {
		interfaz.tabPanel.setTitleAt(0, lista.get(0));
		interfaz.tabPanel.setTitleAt(1, lista.get(1));
		interfaz.tabPanel.setTitleAt(2, lista.get(2));
	}
	
	public void cambiarTextoBotones(InterfazInicial interfaz,String texto) {
		interfaz.botonConvertirMedidas.setText(texto);
		interfaz.botonConvertirMonedas.setText(texto);
		interfaz.botonConvertirTemperatura.setText(texto);
	}
	
	public void limpiarComboBox(InterfazInicial interfaz) {
		interfaz.OpcionConversionMedidas.removeAllItems();
		interfaz.OpcionConversionMonedas.removeAllItems();
		interfaz.OpcionConversionTemperatura.removeAllItems();
	}
	
	public void reemplazarComboBox(InterfazInicial interfaz, int codigo) {
		
		if (codigo == 0) {
			limpiarComboBox(interfaz);
			añadirAComboBox(interfaz);
		} else if (codigo == 1) {
			limpiarComboBox(interfaz);
			añadirAComboBoxIngles(interfaz);
		}
	}
	
}
	

