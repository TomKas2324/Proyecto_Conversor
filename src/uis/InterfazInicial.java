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

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new MatteBorder(5, 0, 3, 0, (Color) new Color(128, 255, 255)));
		contentPane.add(panel_1, "1, 2, 2, 1, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
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
		panel_1.add(tabPanel, "1, 3, 2, 1, fill, fill");

		
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(new Color(255, 255, 255));
				tabPanel.addTab("MONEDAS", null, panel_2, null);
				panel_2.setLayout(new FormLayout(new ColumnSpec[] {
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
						panel_2.add(lblNewLabel, "1, 2, center, center");
						
						OpcionConversionMonedas = new JComboBox<>();
						panel_2.add(OpcionConversionMonedas, "2, 2, 5, 1, left, center");
						
						botonConvertirMonedas = new JButton("CONVERTIR");
						botonConvertirMonedas.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							}
						});
						botonConvertirMonedas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						panel_2.add(botonConvertirMonedas, "3, 3, 4, 1, left, center");
						
						JLabel lblNewLabel_1 = new JLabel("CANTIDAD");
						lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
						panel_2.add(lblNewLabel_1, "1, 3, center, center");
						
						cuadroCantidadMonedas = new JTextField();
						panel_2.add(cuadroCantidadMonedas, "2, 3, left, default");
						cuadroCantidadMonedas.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("MEDIDAS", null, panel_4, null);
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
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
		panel_4.add(lblNewLabel_3, "1, 2, center, default");
		
		OpcionConversionMedidas = new JComboBox();
		panel_4.add(OpcionConversionMedidas, "2, 2, 5, 1, left, center");
		
		
		JLabel lblNewLabel_4 = new JLabel("CANTIDAD");
		lblNewLabel_4.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panel_4.add(lblNewLabel_4, "1, 3, center, default");
		
		cuadroCantidadMedidas = new JTextField();
		panel_4.add(cuadroCantidadMedidas, "2, 3, left, default");
		cuadroCantidadMedidas.setColumns(10);
		
		botonConvertirMedidas = new JButton("CONVERTIR");
		botonConvertirMedidas.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panel_4.add(botonConvertirMedidas, "3, 3, 4, 1, left, center");
		

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("TEMPERATURA", null, panel_3, null);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
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
		panel_3.add(lblNewLabel_5, "1, 2, center, default");
		
		JComboBox OpcionConversionTemperatura = new JComboBox();
		panel_3.add(OpcionConversionTemperatura, "2, 2, 5, 1, left, center");
		
		JLabel lblNewLabel_6 = new JLabel("CANTIDAD");
		lblNewLabel_6.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panel_3.add(lblNewLabel_6, "1, 3, center, default");
		
		cuadroCantidadTemperatura = new JTextField();
		panel_3.add(cuadroCantidadTemperatura, "2, 3, left, default");
		cuadroCantidadTemperatura.setColumns(10);
		
		botonConvertirTemperatura = new JButton("CONVERTIR");
		botonConvertirTemperatura.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		panel_3.add(botonConvertirTemperatura, "3, 3, 4, 1, left, center");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(null);
		contentPane.add(panel, "4, 2, center, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
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
		panel.add(btnNewButton, "1, 1, 1, 2, right, top");
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBorder(new MatteBorder(5, 0, 3, 0, (Color) new Color(128, 255, 255)));
		panel_5.setBackground(new Color(255, 255, 255));
		panel.add(panel_5, "1, 4, 1, 8, fill, fill");
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
		cuadroResultado.setColumns(10);
		panel_5.add(cuadroResultado, "1, 4, 2, 1, center, top");
	}
}
