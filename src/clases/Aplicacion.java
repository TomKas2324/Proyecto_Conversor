package clases;

import uis.InterfazInicial;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
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
		cambiarIdioma();
		Conversion();
		iniciarInterfaz();
	}
	
	public void iniciarInterfaz() {
		Interfaz.setVisible(true);
	}
	
	public void Conversion() {
		accionConvertirMonedas();
		accionConvertirTemperatura();
		accionConvertirMedidas();
	}
	
	public void accionConvertirMonedas() {
		Interfaz.botonConvertirMonedas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String accion = e.getActionCommand();
					if(accion.equals("CONVERTIR") || accion.equals("CONVERT")) {
						String eleccion = (String) Interfaz.OpcionConversionMonedas.getSelectedItem();
						Double factor = obtenerFactorMonedas(eleccion);
						Double cantidad = (double) Double.parseDouble(Interfaz.cuadroCantidadMonedas.getText());
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
					if(accion.equals("CONVERTIR") || accion.equals("CONVERT")) {
						
						String eleccion = (String) Interfaz.OpcionConversionTemperatura.getSelectedItem();
						Double factor = obtenerFactorTemperatura(eleccion);
						Double constanteASumar = obtenerConstanteTemperatura(eleccion);
						Double cantidad = (double) Double.parseDouble(Interfaz.cuadroCantidadTemperatura.getText());
						Interfaz.cuadroResultado.setText(operaciones.OperacionTemperatura(factor,cantidad,constanteASumar));
						}
				} catch(NumberFormatException exp) {
					Interfaz.cuadroResultado.setText("Fallo");
				}
			}
		});
	}
	
	public void accionConvertirMedidas() {
		Interfaz.botonConvertirMedidas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String accion = e.getActionCommand();
					if(accion.equals("CONVERTIR") || accion.equals("CONVERT")) {
						
						String eleccion = (String) Interfaz.OpcionConversionMedidas.getSelectedItem();
						Double factor = obtenerFactorMedidas(eleccion);
						Double cantidad = (double) Double.parseDouble(Interfaz.cuadroCantidadMedidas.getText());
						Interfaz.cuadroResultado.setText(operaciones.OperacionMedidas(factor,cantidad));
						}
				} catch(NumberFormatException exp) {
					Interfaz.cuadroResultado.setText("Fallo");
				}
			}
			
		});
	}
	
	public void validarCantidad() {
		AbstractDocument monedas = (AbstractDocument) Interfaz.cuadroCantidadMonedas.getDocument();
		monedas.setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(FilterBypass fb, int offset, int length, 
					String text, javax.swing.text.AttributeSet attrs) {
					String contenido = text.replaceAll("[^\\d.]", "");
					try {
						super.replace(fb, offset, length, contenido, attrs);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
			}
		});
		AbstractDocument temp = (AbstractDocument) Interfaz.cuadroCantidadTemperatura.getDocument();
		temp.setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(FilterBypass fb, int offset, int length, 
					String text, javax.swing.text.AttributeSet attrs) {
					String contenido = text.replaceAll("[^\\d.]", "");
					try {
						super.replace(fb, offset, length, contenido, attrs);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
			}
		});
		AbstractDocument medidas = (AbstractDocument) Interfaz.cuadroCantidadMedidas.getDocument();
		medidas.setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(FilterBypass fb, int offset, int length, 
					String text, javax.swing.text.AttributeSet attrs) {
					String contenido = text.replaceAll("[^\\d.]", "");
					try {
						super.replace(fb, offset, length, contenido, attrs);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
			}
		});
		
	}
	
	public void cambiarIdioma() {
		Interfaz.botonIdioma.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Interfaz.opcionesIdiomas.show(Interfaz.botonIdioma,(Interfaz.botonIdioma.getWidth()*-1)-2, 0);
				Interfaz.opcionIdiomaEspañol.addActionListener(new ActionListener() {
					//Cambio de Idioma a Español
					@Override
					public void actionPerformed(ActionEvent e) {
						Map<Integer,String> titulosEspañol= new HashMap<>() {{
							put(0,"MONEDAS");
							put(1,"DISTANCIA");
							put(2,"TEMPERATURA");
						}};
						Interfaz.setTitle("CONVERSOR DE UNIDADES");
						cambiarLabelCantidad(Interfaz, "CANTIDAD");
						cambiarLabelOpciones(Interfaz, "OPCIONES");
						cambiarTitulosTabs(Interfaz, titulosEspañol);
						Interfaz.labelResultado.setText("RESULTADO");
						cambiarTextoBotones(Interfaz, "CONVERTIR");
						reemplazarComboBox(Interfaz, 0);
					}
				});
				
				Interfaz.opcionIdiomaIngles.addActionListener(new ActionListener() {
					//Cambio de idioma a Ingles
					@Override
					public void actionPerformed(ActionEvent e) {
						Map<Integer,String> titulosIngles = new HashMap<>() {{
							put(0,"CURRENCY");
							put(1,"DISTANCE");
							put(2,"TEMPERATURE");
						}};
						Interfaz.setTitle("UNIT CONVERTER");
						cambiarLabelCantidad(Interfaz, "AMOUNT");
						cambiarLabelOpciones(Interfaz, "OPTIONS");
						cambiarTitulosTabs(Interfaz, titulosIngles);
						Interfaz.labelResultado.setText("RESULT");
						cambiarTextoBotones(Interfaz, "CONVERT");
						reemplazarComboBox(Interfaz, 1);
						
						
					}
					
				});
				

			}
			
		});
		
		
	}
	
	
	
}