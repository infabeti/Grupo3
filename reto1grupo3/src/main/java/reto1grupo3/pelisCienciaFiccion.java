package reto1grupo3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pelisCienciaFiccion extends JFrame {

	private JPanel contentPane;
	public static JComboBox recibpelisdr = new JComboBox();
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pelisCienciaFiccion(String peliscienfic) {
		
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel LabelTitulo = new JLabel("CIENCIA FICCIÓN");
		LabelTitulo.setForeground(SystemColor.text);
		LabelTitulo.setFont(new Font("Baskerville Old Face", Font.BOLD, 60));
		LabelTitulo.setBounds(29, 53, 547, 70);
		contentPane.add(LabelTitulo);
		recibpelisdr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(recibpelisdr.getSelectedItem().toString());

				
			}
		});
		
		recibpelisdr.setBounds(49, 190, 278, 53);
		contentPane.add(recibpelisdr);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(Color.BLACK);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				listageneros window = new listageneros();
    			window.listagen.setVisible(true);
    			dispose();
			}
		});
		btnVolver.setBounds(49, 308, 167, 44);
		contentPane.add(btnVolver);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnContinuar.setBackground(Color.BLACK);
		btnContinuar.setBounds(369, 307, 167, 44);
		contentPane.add(btnContinuar);
		
		
		
	
	}
}
