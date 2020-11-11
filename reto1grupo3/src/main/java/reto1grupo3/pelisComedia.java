package reto1grupo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class pelisComedia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pelisComedia frame = new pelisComedia();
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
	public pelisComedia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("30 MINUTES");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel_2.setBounds(301, 129, 195, 26);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (42).png"));
		btnNewButton_2.setBounds(559, 166, 181, 222);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (24).png"));
		btnNewButton_1.setBounds(301, 166, 181, 222);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (41).png"));
		btnNewButton_3.setBounds(796, 166, 181, 222);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (40).png"));
		btnNewButton.setBounds(53, 166, 181, 222);
		contentPane.add(btnNewButton);
		
		JLabel LabelTituloPelicula3 = new JLabel("KNOCKED UP");
		LabelTituloPelicula3.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		LabelTituloPelicula3.setForeground(SystemColor.text);
		LabelTituloPelicula3.setBounds(535, 119, 226, 36);
		contentPane.add(LabelTituloPelicula3);
		
		JLabel LabelTituloPelicula4 = new JLabel("ALVIN");
		LabelTituloPelicula4.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		LabelTituloPelicula4.setForeground(SystemColor.text);
		LabelTituloPelicula4.setBounds(825, 119, 181, 36);
		contentPane.add(LabelTituloPelicula4);
		
		JLabel LabelTituloPelicula1 = new JLabel("MONSTERS");
		LabelTituloPelicula1.setForeground(SystemColor.text);
		LabelTituloPelicula1.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		LabelTituloPelicula1.setBounds(36, 109, 226, 56);
		contentPane.add(LabelTituloPelicula1);
		
		JLabel LabelTiempo4 = new JLabel("");
		LabelTiempo4.setBounds(796, 399, 181, 56);
		contentPane.add(LabelTiempo4);
		
		
		JLabel LabelTiempo2 = new JLabel("");
		LabelTiempo2.setBounds(280, 399, 181, 56);
		contentPane.add(LabelTiempo2);
		
		JLabel LabelTiempo3 = new JLabel("");
		LabelTiempo3.setBounds(535, 392, 193, 63);
		contentPane.add(LabelTiempo3);
		
		JLabel LabelTiempo1 = new JLabel("");
		LabelTiempo1.setBounds(28, 399, 206, 56);
		contentPane.add(LabelTiempo1);
		
		JLabel LabelTitulo = new JLabel("COMEDIA");
		LabelTitulo.setForeground(SystemColor.text);
		LabelTitulo.setFont(new Font("Baskerville Old Face", Font.BOLD, 60));
		LabelTitulo.setBounds(357, 11, 344, 70);
		contentPane.add(LabelTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 70));
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
		lblNewLabel.setBounds(0, 0, 1034, 573);
		contentPane.add(lblNewLabel);
	}

}
