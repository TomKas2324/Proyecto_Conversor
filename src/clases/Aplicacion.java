package clases;

import uis.InterfazInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import enums.FactoresMonedas;

public class Aplicacion extends Metodos{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InterfazInicial Interfaz = new InterfazInicial();
	Operaciones operaciones = new Operaciones();
	
	public Aplicacion() {
		añadirOpciones(Interfaz);
		validarCantidad();
		DeterminarConversion();
		iniciarInterfaz();
	}
	
	public void iniciarInterfaz() {
		Interfaz.setVisible(true);
	}
	
	public void DeterminarConversion() {
		String eleccion;
		if(Interfaz.tabPanel.getSelectedIndex() == 0) {
			eleccion = (String) Interfaz.OpcionConversionMonedas.getSelectedItem();
			for(String var : ListaDeNombresDeOpcionesMonedas) {
				if(var == eleccion) {
					accionConvertirMonedas();
				}
			}
		}
		if(Interfaz.tabPanel.getSelectedIndex() == 0) {
			eleccion = (String) Interfaz.OpcionConversionTemperatura.getSelectedItem();
			for(String var : ListaDeNombresDeOpcionesTemperatura) {
				if(var == eleccion) {
					accionConvertirTemperatura();
				}
			}
		}

		
		
		
	}
	
	public void accionConvertirMonedas() {
		Interfaz.botonConvertirMonedas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String accion = e.getActionCommand();
					if(accion.equals("CONVERTIR")) {
						
						String eleccion = (String) Interfaz.OpcionConversionMonedas.getSelectedItem();
						Double factor = obtenerFactorMonedas(eleccion);
						Double cantidad = (double) Integer.parseInt(Interfaz.cuadroCantidadMonedas.getText());
						Interfaz.cuadroResultado.setText(operaciones.OperacionMonedas(factor, cantidad));
						}
				} catch(NumberFormatException exp) {
					Interfaz.cuadroResultado.setText("Fallo");
				}
				}
			});
		}
	
	

	public void accionConvertirTemperatura() {
		Interfaz.botonConvertirTemperatura.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String accion = e.getActionCommand();
					if(accion.equals("CONVERTIR")) {
						
						String eleccion = (String) Interfaz.OpcionConversionTemperatura.getSelectedItem();
						Double factor = obtenerFactorTemperatura(eleccion);
						Double constanteASumar = obtenerConstanteTemperatura(eleccion);
						Double cantidad = (double) Integer.parseInt(Interfaz.cuadroCantidadTemperatura.getText());
						
						Interfaz.cuadroResultado.setText(operaciones.OperacionTemperatura(factor,cantidad,constanteASumar));
						}
				} catch(NumberFormatException exp) {
					Interfaz.cuadroResultado.setText("Fallo");
				}
			}
		});
	}
	public void validarCantidad() {
		AbstractDocument doc = (AbstractDocument) Interfaz.cuadroCantidadMonedas.getDocument();
		doc.setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(FilterBypass fb, int offset, int length, 
					String text, javax.swing.text.AttributeSet attrs) {
					String contenido = text.replaceAll("[^0-9]", "");
					try {
						super.replace(fb, offset, length, contenido, attrs);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
			}
		});
	}
	
	
	
}