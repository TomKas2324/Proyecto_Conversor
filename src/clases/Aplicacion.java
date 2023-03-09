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

	InterfazInicial Interfaz = new InterfazInicial();
	Operaciones operaciones = new Operaciones();
	
	public Aplicacion() {
		añadirOpcionesMonedas();
		añadirAComboBox();
		validarCantidad();
		DeterminarConversion();
		iniciarInterfaz();
	}
	
	public void iniciarInterfaz() {
		Interfaz.setVisible(true);
	}
	
	public void añadirAComboBox() {
		for(Object var : ListaDeNombresDeOpciones) {
			Interfaz.OpcionConversionMonedas.addItem(var);
			//TODO Añadir otro for con los otros enums?
			
		}
	}
	
	public void DeterminarConversion() {
		String eleccion;
		if(Interfaz.tabPanel.getSelectedIndex() == 0) {
			eleccion = (String) Interfaz.OpcionConversionMonedas.getSelectedItem();
			for(String var : ListaDeNombresDeOpciones) {
				if(var == eleccion) {
					accionConvertirMonedas();
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