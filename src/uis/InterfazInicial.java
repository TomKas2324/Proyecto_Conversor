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

public class InterfazInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public JComboBox OpcionConversionMonedas;
	public JComboBox OpcionConversionMedidas;
	public JComboBox OpcionConversionTemperatura;
	
	public JButton botonConvertirMonedas;
	public JButton botonConvertirMedidas;
	public JButton botonConvertirTemperatura;
					
	public JTextField cuadroCantidadMonedas;
	public JTabbedPane tabPanel;
	public JTextField cuadroCantidadMedidas;
	public JTextField cuadroCantidadTemperatura;
	public JTextField cuadroResultado;
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
				
						JLabel lblNewLabel = new JLabel("OPCIONES");
						lblNewLabel.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
						panelMonedas.add(lblNewLabel, "1, 2, center, center");
						
						OpcionConversionMonedas = new JComboBox<>();
						panelMonedas.add(OpcionConversionMonedas, "2, 2, 5, 1, left, center");
						
						botonConvertirMonedas = new JButton("CONVERTIR");
						botonConvertirMonedas.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							}
						});
						botonConvertirMonedas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						panelMonedas.add(botonConvertirMonedas, "3, 3, 4, 1, left, center");
						
						JLabel lblNewLabel_1 = new JLabel("CANTIDAD");
						lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						panelMonedas.add(lblNewLabel_1, "1, 3, center, center");
						
						cuadroCantidadMonedas = new JTextField();
						panelMonedas.add(cuadroCantidadMonedas, "2, 3, left, default");
						cuadroCantidadMonedas.setColumns(10);

		JPanel panelMedidas = new JPanel();
		panelMedidas.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("MEDIDAS", null, panelMedidas, null);
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
		
		JLabel lblNewLabel_3 = new JLabel("OPCIONES");
		lblNewLabel_3.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelMedidas.add(lblNewLabel_3, "1, 2, center, default");
		
		OpcionConversionMedidas = new JComboBox<>();
		panelMedidas.add(OpcionConversionMedidas, "2, 2, 5, 1, left, center");
		
		
		JLabel lblNewLabel_4 = new JLabel("CANTIDAD");
		lblNewLabel_4.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelMedidas.add(lblNewLabel_4, "1, 3, center, default");
		
		cuadroCantidadMedidas = new JTextField();
		panelMedidas.add(cuadroCantidadMedidas, "2, 3, left, default");
		cuadroCantidadMedidas.setColumns(10);
		
		botonConvertirMedidas = new JButton("CONVERTIR");
		botonConvertirMedidas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelMedidas.add(botonConvertirMedidas, "3, 3, 4, 1, left, center");
		

		JPanel panelTemperatura = new JPanel();
		panelTemperatura.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("TEMPERATURA", null, panelTemperatura, null);
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
		
		JLabel lblNewLabel_5 = new JLabel("OPCIONES");
		lblNewLabel_5.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelTemperatura.add(lblNewLabel_5, "1, 2, center, default");
		
		OpcionConversionTemperatura = new JComboBox<>();
		panelTemperatura.add(OpcionConversionTemperatura, "2, 2, 5, 1, left, center");
		
		JLabel lblNewLabel_6 = new JLabel("CANTIDAD");
		lblNewLabel_6.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panelTemperatura.add(lblNewLabel_6, "1, 3, center, default");
		
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

		JButton btnNewButton = new JButton("ES");
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		panelSecundario.add(btnNewButton, "1, 1, 1, 2, right, top");
		
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
		
		JLabel lblNewLabel_2 = new JLabel("RESULTADO");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 13));
		panel_5.add(lblNewLabel_2, "1, 2, 2, 1, center, top");
		
		cuadroResultado = new JTextField();
		cuadroResultado.setEditable(false);
		cuadroResultado.setColumns(10);
		panel_5.add(cuadroResultado, "1, 4, 2, 1, fill, top");
	}
}
