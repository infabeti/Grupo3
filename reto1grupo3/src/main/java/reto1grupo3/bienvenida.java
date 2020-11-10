package reto1grupo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class bienvenida extends JFrame {

	private JPanel contentPane;


	public bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelTitulo_2 = new JLabel("to the");
		LabelTitulo_2.setForeground(SystemColor.text);
		LabelTitulo_2.setFont(new Font("Algerian", Font.BOLD, 60));
		LabelTitulo_2.setBounds(160, 128, 209, 66);
		contentPane.add(LabelTitulo_2);
		
		JLabel LabelTitulo_1 = new JLabel("WELCOME");
		LabelTitulo_1.setForeground(SystemColor.text);
		LabelTitulo_1.setBackground(SystemColor.text);
		LabelTitulo_1.setFont(new Font("Algerian", Font.BOLD, 60));
		LabelTitulo_1.setBounds(99, 30, 332, 103);
		contentPane.add(LabelTitulo_1);
		
		JLabel LabelTitulo_3 = new JLabel("CINEMA");
		LabelTitulo_3.setForeground(SystemColor.text);
		LabelTitulo_3.setFont(new Font("Algerian", Font.BOLD, 60));
		LabelTitulo_3.setBounds(150, 169, 254, 132);
		contentPane.add(LabelTitulo_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (16).png"));
		lblNewLabel.setBounds(-129, -1, 314, 574);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (9).png"));
		lblNewLabel_1.setBounds(203, 27, 400, 519);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 27, 193, 520);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (17).png"));
		lblNewLabel_4.setBounds(118, 263, 260, 283);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (12).png"));
		lblNewLabel_3.setBounds(10, 0, 474, 547);
		contentPane.add(lblNewLabel_3);
		
		JLabel LabelFondo = new JLabel("");
		LabelFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
		LabelFondo.setBounds(0, -21, 500, 600);
		contentPane.add(LabelFondo);
	}
}