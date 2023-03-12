package uis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;

public class InterfazInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	// ComboBoxes de opciones
	
	public JComboBox OpcionConversionMonedas;
	public JComboBox OpcionConversionMedidas;
	public JComboBox OpcionConversionTemperatura;
	
	// Botones
	
	public JButton botonConvertirMonedas;
	public JButton botonConvertirMedidas;
	public JButton botonConvertirTemperatura;
	public JButton botonIdioma;
	
	// Cuadros de texto
	
	public JTextField cuadroCantidadMonedas;
	public JTextField cuadroCantidadMedidas;
	public JTextField cuadroCantidadTemperatura;
	public JTextField cuadroResultado;
	
	//Panel de opciones
	
	public JTabbedPane tabPanel;
	public JPopupMenu opcionesIdiomas;
	
	//Opciones de idiomas
	
	public JMenuItem opcionIdiomaEspañol;
	public JMenuItem opcionIdiomaIngles;
	
	//Labels
	
	public JLabel labelCantidadMonedas;
	public JLabel labelOpcionesMonedas;
	public JLabel labelCantidadTemperatura;
	public JLabel labelOpcionesTemperatura;
	public JLabel labelCantidadMedidas;
	public JLabel labelOpcionesMedidas;
	public JLabel labelResultado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazInicial frame = new InterfazInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazInicial() {
		setForeground(new Color(0, 255, 255));
		setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		setTitle("CONVERSOR DE UNIDADES");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("377px:grow"),
				ColumnSpec.decode("max(13dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("166px:grow"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("129px:grow"),}));

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(255, 255, 255));
		panelPrincipal.setBorder(new MatteBorder(5, 0, 3, 0, (Color) new Color(128, 255, 255)));
		contentPane.add(panelPrincipal, "1, 2, 2, 1, fill, fill");
		panelPrincipal.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("186px"),
				ColumnSpec.decode("204px"),},
			new RowSpec[] {
				RowSpec.decode("max(2dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("128px"),}));

		tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		tabPanel.setForeground(new Color(0, 0, 0));
		tabPanel.setBackground(new Color(255, 255, 255));
		tabPanel.setBorder(null);
		tabPanel.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		panelPrincipal.add(tabPanel, "1, 3, 2, 1, fill, fill");

		
				JPanel panelMonedas = new JPanel();
				panelMonedas.setBackground(new Color(255, 255, 255));
				tabPanel.addTab("MONEDAS", null, panelMonedas, null);
				tabPanel.setBackgroundAt(0, new Color(185, 255, 253));
				panelMonedas.setLayout(new FormLayout(new ColumnSpec[] {
						ColumnSpec.decode("78px"),
						ColumnSpec.decode("max(74dlu;default):grow"),
						FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(30dlu;default)"),
						FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("171px"),},
					new RowSpec[] {
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("46px"),
						RowSpec.decode("max(29dlu;default):grow"),
						RowSpec.decode("max(6dlu;default)"),}));
				
						labelOpcionesMonedas= new JLabel("OPCIONES");
						labelOpcionesMonedas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						labelOpcionesMonedas.setHorizontalAlignment(SwingConstants.CENTER);
						panelMonedas.add(labelOpcionesMonedas, "1, 2, center, center");
						
						OpcionConversionMonedas = new JComboBox<>();
						OpcionConversionMonedas.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
						panelMonedas.add(OpcionConversionMonedas, "2, 2, 5, 1, left, center");
						
						botonConvertirMonedas = new JButton("CONVERTIR");
						botonConvertirMonedas.setForeground(new Color(0, 255, 255));
						botonConvertirMonedas.setBackground(new Color(255, 255, 255));
						botonConvertirMonedas.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							}
						});
						botonConvertirMonedas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						panelMonedas.add(botonConvertirMonedas, "3, 3, 4, 1, left, center");
						
						labelCantidadMonedas = new JLabel("CANTIDAD");
						labelCantidadMonedas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						panelMonedas.add(labelCantidadMonedas, "1, 3, center, center");
						
						cuadroCantidadMonedas = new JTextField();
						panelMonedas.add(cuadroCantidadMonedas, "2, 3, left, default");
						cuadroCantidadMonedas.setColumns(10);

		JPanel panelMedidas = new JPanel();
		panelMedidas.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("DISTANCIA", null, panelMedidas, null);
		tabPanel.setBackgroundAt(1, new Color(185, 255, 253));
		panelMedidas.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("78px"),
				ColumnSpec.decode("max(74dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(30dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("171px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("46px"),
				RowSpec.decode("max(29dlu;default):grow"),
				RowSpec.decode("max(6dlu;default)"),}));
		
		labelOpcionesMedidas = new JLabel("OPCIONES");
		labelOpcionesMedidas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelMedidas.add(labelOpcionesMedidas, "1, 2, center, default");
		
		OpcionConversionMedidas = new JComboBox<>();
		OpcionConversionMedidas.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		panelMedidas.add(OpcionConversionMedidas, "2, 2, 5, 1, left, center");
		
		
		labelCantidadMedidas = new JLabel("CANTIDAD");
		labelCantidadMedidas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelMedidas.add(labelCantidadMedidas, "1, 3, center, default");
		
		cuadroCantidadMedidas = new JTextField();
		panelMedidas.add(cuadroCantidadMedidas, "2, 3, left, default");
		cuadroCantidadMedidas.setColumns(10);
		
		botonConvertirMedidas = new JButton("CONVERTIR");
		botonConvertirMedidas.setForeground(new Color(0, 255, 255));
		botonConvertirMedidas.setBackground(new Color(255, 255, 255));
		botonConvertirMedidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonConvertirMedidas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelMedidas.add(botonConvertirMedidas, "3, 3, 4, 1, left, center");
		

		JPanel panelTemperatura = new JPanel();
		panelTemperatura.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("TEMPERATURA", null, panelTemperatura, null);
		tabPanel.setBackgroundAt(2, new Color(185, 255, 253));
		panelTemperatura.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("78px"),
				ColumnSpec.decode("max(74dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(30dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("171px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("46px"),
				RowSpec.decode("max(29dlu;default):grow"),
				RowSpec.decode("max(6dlu;default)"),}));
		
		labelOpcionesTemperatura = new JLabel("OPCIONES");
		labelOpcionesTemperatura.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelTemperatura.add(labelOpcionesTemperatura, "1, 2, center, default");
		
		OpcionConversionTemperatura = new JComboBox<>();
		OpcionConversionTemperatura.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		panelTemperatura.add(OpcionConversionTemperatura, "2, 2, 5, 1, left, center");
		
		labelCantidadTemperatura = new JLabel("CANTIDAD");
		labelCantidadTemperatura.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelTemperatura.add(labelCantidadTemperatura, "1, 3, center, default");
		
		cuadroCantidadTemperatura = new JTextField();
		panelTemperatura.add(cuadroCantidadTemperatura, "2, 3, left, default");
		cuadroCantidadTemperatura.setColumns(10);
		
		botonConvertirTemperatura = new JButton("CONVERTIR");
		botonConvertirTemperatura.setBackground(new Color(255, 255, 255));
		botonConvertirTemperatura.setForeground(new Color(0, 255, 255));
		botonConvertirTemperatura.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelTemperatura.add(botonConvertirTemperatura, "3, 3, 4, 1, left, center");
		
		JPanel panelSecundario = new JPanel();
		panelSecundario.setBackground(new Color(255, 255, 255));
		panelSecundario.setBorder(null);
		contentPane.add(panelSecundario, "4, 2, center, fill");
		panelSecundario.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("135px:grow"),},
			new RowSpec[] {
				RowSpec.decode("max(0dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("32px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));

		botonIdioma = new JButton("LANG");
		botonIdioma.setForeground(new Color(0, 255, 255));
		botonIdioma.setBackground(new Color(255, 255, 255));
		botonIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonIdioma.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		panelSecundario.add(botonIdioma, "1, 1, 1, 2, right, top");
		
		opcionesIdiomas = new JPopupMenu();
		addPopup(botonIdioma, opcionesIdiomas);
		
		opcionIdiomaEspañol = new JMenuItem("Español");
		opcionesIdiomas.add(opcionIdiomaEspañol);
		
		opcionIdiomaIngles = new JMenuItem("English");
		opcionesIdiomas.add(opcionIdiomaIngles);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBorder(new MatteBorder(5, 0, 3, 0, (Color) new Color(128, 255, 255)));
		panel_5.setBackground(new Color(255, 255, 255));
		panelSecundario.add(panel_5, "1, 4, 1, 8, fill, fill");
		panel_5.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("24px"),
				ColumnSpec.decode("106px"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("15px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		labelResultado= new JLabel("RESULTADO");
		labelResultado.setFont(new Font("Bell MT", Font.PLAIN, 13));
		panel_5.add(labelResultado, "1, 2, 2, 1, center, top");
		
		cuadroResultado = new JTextField();
		cuadroResultado.setEditable(false);
		cuadroResultado.setColumns(10);
		panel_5.add(cuadroResultado, "1, 4, 2, 1, fill, top");
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
