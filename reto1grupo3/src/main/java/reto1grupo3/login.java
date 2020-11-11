package reto1grupo3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField UsuarioText;
	private JPasswordField contraseñaText;
	
	
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotonEntrar = new JButton("Entrar");
		BotonEntrar.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		BotonEntrar.setBackground(SystemColor.text);
		BotonEntrar.setBounds(195, 517, 98, 39);
		BotonEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Usuario,Contraseña;
				
				 Usuario=UsuarioText.getText();
				 Contraseña= contraseñaText.getText();
				
				
				
				if (Usuario.equals("admin")&& Contraseña.equals("123")) {
					
					listageneros window = new listageneros();
					
				
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
					
				}
				
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Iniciar Sesi\u00F3n");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 50));
		lblNewLabel_1.setBounds(101, 11, 311, 61);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\iconfinder_administrator_43645.png"));
		lblNewLabel_2.setBounds(111, 69, 256, 247);
		contentPane.add(lblNewLabel_2);
		contentPane.add(BotonEntrar);
		
		JLabel LabelContraseña = new JLabel("Contrase\u00F1a:");
		LabelContraseña.setForeground(SystemColor.text);
		LabelContraseña.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		LabelContraseña.setBounds(126, 416, 249, 34);
		contentPane.add(LabelContraseña);
		
		contraseñaText = new JPasswordField();
		contraseñaText.setForeground(SystemColor.text);
		contraseñaText.setBackground(new Color(0, 51, 102));
		contraseñaText.setBounds(128, 449, 272, 47);
		contentPane.add(contraseñaText);
		
		UsuarioText = new JTextField();
		UsuarioText.setForeground(SystemColor.text);
		UsuarioText.setBackground(new Color(0, 51, 102));
		UsuarioText.setBounds(128, 364, 272, 47);
		contentPane.add(UsuarioText);
		UsuarioText.setColumns(10);
		
		JLabel Labelicono_1 = new JLabel("");
		Labelicono_1.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\msn_user_23243.png"));
		Labelicono_1.setBounds(63, 339, 64, 72);
		contentPane.add(Labelicono_1);
		
		JLabel LabelUsuario = new JLabel("Usuario:");
		LabelUsuario.setForeground(SystemColor.text);
		LabelUsuario.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		LabelUsuario.setBounds(126, 327, 153, 34);
		contentPane.add(LabelUsuario);
		
		JLabel Labelicono_2 = new JLabel("");
		Labelicono_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\passwordlock_contrase\u00F1_9979.png"));
		Labelicono_2.setBounds(63, 432, 64, 64);
		contentPane.add(Labelicono_2);
		
		JLabel LabelFondo = new JLabel("New label");
		LabelFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
		LabelFondo.setBounds(0, -13, 500, 600);
		contentPane.add(LabelFondo);
	}
}
