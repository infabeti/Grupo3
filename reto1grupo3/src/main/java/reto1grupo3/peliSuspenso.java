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

public class peliSuspenso extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					peliSuspenso frame = new peliSuspenso();
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
	public peliSuspenso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (19).png"));
		btnNewButton_2.setBounds(562, 138, 170, 240);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (22).png"));
		btnNewButton_1.setBounds(307, 138, 170, 240);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (21).png"));
		btnNewButton_3.setBounds(807, 138, 170, 240);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (18).png"));
		btnNewButton.setBounds(47, 138, 170, 240);
		contentPane.add(btnNewButton);
		
		JLabel LabelTituloPelicula3 = new JLabel("Cadena");
		LabelTituloPelicula3.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		LabelTituloPelicula3.setForeground(SystemColor.text);
		LabelTituloPelicula3.setBounds(574, 91, 144, 36);
		contentPane.add(LabelTituloPelicula3);
		
		JLabel LabelTituloPelicula4 = new JLabel("Million Dolar");
		LabelTituloPelicula4.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		LabelTituloPelicula4.setForeground(SystemColor.text);
		LabelTituloPelicula4.setBounds(772, 91, 234, 36);
		contentPane.add(LabelTituloPelicula4);
		
		JLabel LabelTituloPelicula2 = new JLabel("Schinfler");
		LabelTituloPelicula2.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		LabelTituloPelicula2.setForeground(SystemColor.text);
		LabelTituloPelicula2.setBounds(313, 92, 164, 36);
		contentPane.add(LabelTituloPelicula2);
		
		JLabel LabelTituloPelicula1 = new JLabel("Handia");
		LabelTituloPelicula1.setForeground(SystemColor.text);
		LabelTituloPelicula1.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		LabelTituloPelicula1.setBounds(76, 91, 158, 36);
		contentPane.add(LabelTituloPelicula1);
		
		JLabel LabelTiempo4 = new JLabel("");
		LabelTiempo4.setBounds(796, 399, 181, 56);
		contentPane.add(LabelTiempo4);
		
		
		JLabel LabelTiempo2 = new JLabel("");
		LabelTiempo2.setBounds(280, 399, 181, 56);
		contentPane.add(LabelTiempo2);
		
		JLabel LabelTiempo3 = new JLabel("");
		LabelTiempo3.setBounds(525, 399, 193, 63);
		contentPane.add(LabelTiempo3);
		
		JLabel LabelTiempo1 = new JLabel("");
		LabelTiempo1.setBounds(28, 399, 206, 56);
		contentPane.add(LabelTiempo1);
		
		JLabel LabelTitulo = new JLabel("COMEDIA");
		LabelTitulo.setForeground(SystemColor.text);
		LabelTitulo.setFont(new Font("Baskerville Old Face", Font.BOLD, 60));
		LabelTitulo.setBounds(341, 10, 318, 70);
		contentPane.add(LabelTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 70));
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
		lblNewLabel.setBounds(0, 0, 1034, 573);
		contentPane.add(lblNewLabel);
	}
}
