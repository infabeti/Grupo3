package reto1grupo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Color;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

public class listageneros {
	
	 public static JButton btnDrama, btnNSci, btnComedia, btnTerror, btn_inicio, btn_continuar;


	JFrame frame;


	/**
	 * Create the application.
	 */
	public listageneros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 819, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDrama = new JButton("Drama");
		btnDrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(null, "Ha seleccionado Drama");
			}
		});
		btnDrama.setForeground(Color.WHITE);
		btnDrama.setBackground(Color.BLACK);
		btnDrama.setBounds(28, 85, 89, 23);
		frame.getContentPane().add(btnDrama);
		
		JButton btnNSci = new JButton("Sci-Fi");
		btnNSci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(null, "Ha seleccionado Sci-Fi");
			}
		});
		btnNSci.setForeground(Color.WHITE);
		btnNSci.setBackground(Color.BLACK);
		btnNSci.setBounds(164, 85, 89, 23);
		frame.getContentPane().add(btnNSci);
		
		JButton btnComedia = new JButton("Comedia");
		btnComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(null, "Ha seleccionado Comedia");
			}
		});
		btnComedia.setForeground(Color.WHITE);
		btnComedia.setBackground(Color.BLACK);
		btnComedia.setBounds(297, 85, 89, 23);
		frame.getContentPane().add(btnComedia);
		
		JButton btnTerror = new JButton("Terror");
		btnTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(null, "Ha seleccionado Terror");
			}
		});
		btnTerror.setForeground(Color.WHITE);
		btnTerror.setBackground(Color.BLACK);
		btnTerror.setBounds(430, 85, 89, 23);
		frame.getContentPane().add(btnTerror);
		
		JLabel lblSeleccion = new JLabel("PELÍCULAS YA SELECCIONADAS");
		lblSeleccion.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblSeleccion.setBounds(28, 156, 245, 20);
		frame.getContentPane().add(lblSeleccion);
		
		JButton btnPsicosis = new JButton(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\main\\java\\imagenes\\resized\\Psicosis.jpg"));
		btnPsicosis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPsicosis.setBounds(28, 215, 213, 266);
		frame.getContentPane().add(btnPsicosis);
		
		JLabel p_Psicosis=new JLabel(variablesPeliculas.psicosis+"  "+variablesPeliculas.nombrepsicosis);
		p_Psicosis.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        p_Psicosis.setBounds(92,492,98,50);
        frame.getContentPane().add(p_Psicosis);
        
        JButton btnCisnenegro = new JButton("");
        btnCisnenegro.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\main\\java\\imagenes\\resized\\cisnenegro.jpg"));
        btnCisnenegro.setBounds(251, 215, 213, 266);
        frame.getContentPane().add(btnCisnenegro);
        

        
        JLabel p_cisneNegro = new JLabel(variablesPeliculas.cisnenegro+"  "+variablesPeliculas.nombrecisnenegro);
        p_cisneNegro.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        p_cisneNegro.setBounds(297, 511, 119, 14);
        frame.getContentPane().add(p_cisneNegro);
      
		

	}
	
	
public void actionPerformed(ActionEvent e){


        
           //btn_frutossecos
        if (e.getSource() == btnDrama ){
            


     
        }
        

        if(e.getSource()==btn_inicio){


        }


        if(e.getSource()==btn_continuar){


        }

    
     }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listageneros window = new listageneros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
