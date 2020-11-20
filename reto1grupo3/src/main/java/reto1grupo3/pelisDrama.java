package reto1grupo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class pelisDrama extends JFrame {

	private JPanel contentPane;
	static JTextField txtCodigo;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//pelisDrama frame = new pelisDrama();
					//frame.setVisible(true);
					//frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pelisDrama(String resultado) {
		
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel LabelTitulo = new JLabel("DRAMA");
		LabelTitulo.setForeground(SystemColor.text);
		LabelTitulo.setFont(new Font("Baskerville Old Face", Font.BOLD, 60));
		LabelTitulo.setBounds(395, 11, 290, 70);
		contentPane.add(LabelTitulo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(43, 124, 412, 359);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		txtCodigo.setText(resultado);
		
	
	}
}
