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

public class pelisDrama extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pelisDrama frame = new pelisDrama();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pelisDrama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("8 MILE");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel_2.setBounds(328, 129, 168, 26);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (25).png"));
		btnNewButton_2.setBounds(559, 166, 181, 222);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (37).png"));
		btnNewButton_1.setBounds(301, 166, 181, 222);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (23).png"));
		btnNewButton_3.setBounds(796, 166, 181, 222);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (26).png"));
		btnNewButton.setBounds(53, 166, 181, 222);
		contentPane.add(btnNewButton);
		
		JLabel LabelTituloPelicula3 = new JLabel("IN TIME");
		LabelTituloPelicula3.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		LabelTituloPelicula3.setForeground(SystemColor.text);
		LabelTituloPelicula3.setBounds(584, 119, 144, 36);
		contentPane.add(LabelTituloPelicula3);
		
		JLabel LabelTituloPelicula4 = new JLabel("INCEPTION");
		LabelTituloPelicula4.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		LabelTituloPelicula4.setForeground(SystemColor.text);
		LabelTituloPelicula4.setBounds(796, 114, 181, 36);
		contentPane.add(LabelTituloPelicula4);
		
		JLabel LabelTituloPelicula1 = new JLabel("BLACK SWAN");
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
		
		JLabel LabelTitulo = new JLabel("DRAMA");
		LabelTitulo.setForeground(SystemColor.text);
		LabelTitulo.setFont(new Font("Baskerville Old Face", Font.BOLD, 60));
		LabelTitulo.setBounds(395, 11, 290, 70);
		contentPane.add(LabelTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 70));
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
		lblNewLabel.setBounds(0, 0, 1034, 573);
		contentPane.add(lblNewLabel);
	}
}
