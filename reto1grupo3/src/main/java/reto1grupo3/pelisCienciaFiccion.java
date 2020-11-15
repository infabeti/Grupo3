package reto1grupo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pelisCienciaFiccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pelisCienciaFiccion frame = new pelisCienciaFiccion();
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
	public pelisCienciaFiccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("STAR TREK");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel_3.setBounds(298, 121, 181, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PUSH");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel_4.setBounds(579, 121, 170, 36);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PRIEST");
		lblNewLabel_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel_5.setForeground(SystemColor.text);
		lblNewLabel_5.setBounds(790, 123, 181, 36);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("AVATAR");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel_2.setBounds(45, 121, 163, 40);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (27).png"));
		btnNewButton.setBounds(34, 172, 181, 222);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (35).png"));
		btnNewButton_1.setBounds(298, 172, 181, 222);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (38).png"));
		btnNewButton_2.setBounds(534, 168, 181, 222);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (39).png"));
		btnNewButton_3.setBounds(769, 168, 181, 222);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("CIENCIA FICCION");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 60));
		lblNewLabel_1.setBounds(251, 11, 557, 73);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
		lblNewLabel.setBounds(0, -20, 1024, 622);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(45, 172, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(34, 405, 46, 14);
		contentPane.add(label_1);
	}
}
