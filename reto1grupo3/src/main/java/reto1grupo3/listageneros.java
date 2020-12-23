package reto1grupo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class listageneros  {
	
	   static class Peliculas {

	        public String nombre, genero;
	        public double hora;
	        // Constructor de la clase
	        public Peliculas(String nombre, String genero, double hora) {
	            this.nombre = nombre;
	            this.genero = genero;
	            this.hora = hora;
	        }
	    }
	   
	   
	    // Método para imprimir el array de Peliculas
	    static String imprimeArrayPeliculas(Peliculas[] array) {
	    	
	    	 
	    	String pelisdrama = "";
	        for (int i = 0; i < array.length; i++) {
	    		if (array[i].genero == "drama") {
	    			// System.out.println((i+1) + ". " + array[i].nombre + " - Genero: " + array[i].genero + " - Duración: " + array[i].hora);
					//pelisdrama += array[i].nombre + " - Duración: " + array[i].hora + "\n";
	    	        String saberhora = array[i].hora + "";
	    	        String horadrama = saberhora.substring(0, saberhora.indexOf("."));
	    	        String mindrama = saberhora.substring(saberhora.indexOf(".")).substring(1);

					pelisDrama.recibpelisdr.addItem(array[i].nombre + " - Duración: " + horadrama+" h "+ mindrama +" minutos" + "\n");
	    		}	
	        }
	        return pelisdrama;
	    }
	        
	      static String imprimeArrayPeliculas1(Peliculas[] array) {
	    	String peliscomedia = "";
	        for (int i = 0; i < array.length; i++) {
	    		if (array[i].genero == "comedia") {
	    			
	    	        String saberhora = array[i].hora + "";
	    	        String horadrama = saberhora.substring(0, saberhora.indexOf("."));
	    	        String mindrama = saberhora.substring(saberhora.indexOf(".")).substring(1);

					pelisComedia.recibpelisdr.addItem(array[i].nombre + " - Duración: " + horadrama+" h "+ mindrama +" minutos" + "\n");
	    		}	
	        }
	        return peliscomedia;
	    }
	    
	      static String imprimeArrayPeliculas2(Peliculas[] array) {
	    	String peliscienfic = "";
	        for (int i = 0; i < array.length; i++) {
	    		if (array[i].genero == "Sci-fi") {
	    	        String saberhora = array[i].hora + "";
	    	        String horadrama = saberhora.substring(0, saberhora.indexOf("."));
	    	        String mindrama = saberhora.substring(saberhora.indexOf(".")).substring(1);

	    	        pelisCienciaFiccion.recibpelisdr.addItem(array[i].nombre + " - Duración: " + horadrama+" h "+ mindrama +" minutos" + "\n");
	    		}	
	        }
	        return peliscienfic;
	    }
	      
	      static String imprimeArrayPeliculas3(Peliculas[] array) {
	    	String pelisterror = "";
	        for (int i = 0; i < array.length; i++) {
	    		if (array[i].genero == "terror") {
	    	        String saberhora = array[i].hora + "";
	    	        String horadrama = saberhora.substring(0, saberhora.indexOf("."));
	    	        String mindrama = saberhora.substring(saberhora.indexOf(".")).substring(1);

	    	        pelisTerror.recibpelisdr.addItem(array[i].nombre + " - Duración: " + horadrama+" h "+ mindrama +" minutos" + "\n");
	    		}	
	        }
	        return pelisterror;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	
	    	EventQueue.invokeLater(new Runnable() {
	    		public void run() {
	    			try {
	    			listageneros window = new listageneros();
	    			window.listagen.setVisible(true);
	    			} catch (Exception e) {
	    			e.printStackTrace();
	    			}
	    		}
	    	});
   
	    }

	   


	public JButton btnNewButton_1, btnCienciaFiccion, btnNewButton_2, btnNewButton_3, btn_inicio, btn_continuar,btnNewButton_4;


	public  JFrame listagen;
	public  JTextField tiemposabado;
	public JTextField tiempodomingo;
	

	
	/**
	* Create the application.
	*/
	public listageneros() {
	initialize();
	}
	
	/**
	* Initialize the contents of the frame.
	*/
public void initialize() {
	Peliculas arrayObjetospelis[]=new Peliculas[16];

    arrayObjetospelis[0]=new Peliculas("Avatar", "Sci-fi", 2.22);
    arrayObjetospelis[1]=new Peliculas("Star Trek", "Sci-fi", 1.15);
    arrayObjetospelis[2]=new Peliculas("Push", "Sci-fi", 1.55);
    arrayObjetospelis[3]=new Peliculas("Priest", "Sci-fi", 1.57);
    arrayObjetospelis[4]=new Peliculas("Monster Inc", "comedia", 1.21);
    arrayObjetospelis[5]=new Peliculas("30 Minutes Or Less", "comedia", 1.21);
    arrayObjetospelis[6]=new Peliculas("Knocked Up", "comedia", 1.34); 
    arrayObjetospelis[7]=new Peliculas("Alvin y las ardillas", "comedia", 1.28); 
    arrayObjetospelis[8]=new Peliculas("Insidious", "terror", 1.49); 
    arrayObjetospelis[9]=new Peliculas("Destino Final 5", "terror", 2.26); 
    arrayObjetospelis[10]=new Peliculas("The Uninvited", "terror", 2.35); 
    arrayObjetospelis[11]=new Peliculas("Constantine", "terror", 1.50); 
    arrayObjetospelis[12]=new Peliculas("Black Swan", "drama", 1.56); 
    arrayObjetospelis[13]=new Peliculas("8 Mile", "drama", 3.17); 
    arrayObjetospelis[14]=new Peliculas("In Time", "drama", 2.22); 
    arrayObjetospelis[15]=new Peliculas("Inception", "drama", 2.13);
    
    
    //PANEL
	listagen = new JFrame();
	listagen.getContentPane().setBackground(Color.WHITE);
	listagen.setBackground(Color.WHITE);
	listagen.setBounds(100, 100, 1033, 611);
	listagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	listagen.getContentPane().setLayout(null);
	listagen.setLocationRelativeTo(null);
	
	
	
	
	
	


	
	
	// BOTONES

	JButton btnNewButton_1 = new JButton("DRAMA");
	btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
		
		String pelisdrama = imprimeArrayPeliculas(arrayObjetospelis);
	
		pelisDrama frame = new pelisDrama(pelisdrama);
		frame.setVisible(true);
		listagen.dispose();
		
		
	
	}
	});
	
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Bell MT", Font.BOLD, 25));
		btnNewButton_1.setBounds(46, 180, 192, 111);
		listagen.getContentPane().add(btnNewButton_1);

	JButton btnCienciaFiccion = new JButton("SCI-FI");
	btnCienciaFiccion.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
		String peliscienfic = imprimeArrayPeliculas2(arrayObjetospelis);
		pelisCienciaFiccion frame = new pelisCienciaFiccion(peliscienfic);
		frame.setVisible(true);
		listagen.dispose();
	}
	});
		btnCienciaFiccion.setBackground(Color.BLACK);
		btnCienciaFiccion.setForeground(SystemColor.text);
		btnCienciaFiccion.setFont(new Font("Bell MT", Font.BOLD, 25));
		btnCienciaFiccion.setBounds(300, 180, 179, 111);
		listagen.getContentPane().add(btnCienciaFiccion);

	JButton btnNewButton_2 = new JButton("COMEDIA");
	btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
		
		String peliscomedia = imprimeArrayPeliculas1(arrayObjetospelis);
		pelisComedia frame = new pelisComedia(peliscomedia);
		frame.setVisible(true);
		listagen.dispose();
	}
	});
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(SystemColor.text);
		btnNewButton_2.setFont(new Font("Bell MT", Font.BOLD, 25));
		btnNewButton_2.setBounds(543, 180, 179, 111);
		listagen.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("TERROR");
		btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
			
		String pelisterror = imprimeArrayPeliculas3(arrayObjetospelis);
		pelisTerror frame = new pelisTerror(pelisterror);
		frame.setVisible(true);
		listagen.dispose();
	}
	});
		
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(SystemColor.text);
		btnNewButton_3.setFont(new Font("Bell MT", Font.BOLD, 25));
		btnNewButton_3.setBounds(793, 180, 179, 111);
		listagen.getContentPane().add(btnNewButton_3);
	
	
	 JButton btnNewButton_4 = new JButton("Salir");
     btnNewButton_4.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent arg0) {
     		
     		System.exit(0);
     	}
     });
     	btnNewButton_4.setForeground(SystemColor.text);
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		btnNewButton_4.setBounds(464, 523, 105, 38);
		listagen.getContentPane().add(btnNewButton_4);

	
        
        //JLABEL TEXTOS
    	
        JLabel lblNewLabel_8 = new JLabel("Domingo:");
		lblNewLabel_8.setForeground(SystemColor.text);
		lblNewLabel_8.setFont(new Font("Bell MT", Font.BOLD, 30));
		lblNewLabel_8.setBounds(658, 419, 146, 65);
		listagen.getContentPane().add(lblNewLabel_8);
        
        
        JLabel lblNewLabel_7 = new JLabel("Sabado:");
		lblNewLabel_7.setForeground(SystemColor.text);
		lblNewLabel_7.setFont(new Font("Bell MT", Font.BOLD, 30));
		lblNewLabel_7.setBounds(346, 419, 126, 65);
		listagen.getContentPane().add(lblNewLabel_7);
        
        
     
        JLabel lblNewLabel_6 = new JLabel("Tiempo restante");
		lblNewLabel_6.setForeground(SystemColor.text);
		lblNewLabel_6.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_6.setBounds(20, 423, 334, 49);
		listagen.getContentPane().add(lblNewLabel_6);
        
        
        JLabel lblNewLabel_5 = new JLabel("Selecciona Un Genero");
		lblNewLabel_5.setForeground(SystemColor.text);
		lblNewLabel_5.setFont(new Font("Bell MT", Font.BOLD, 50));
		lblNewLabel_5.setBounds(259, 31, 499, 79);
		listagen.getContentPane().add(lblNewLabel_5);
        
        
        //TIEMPO JTextField
		
		
		double totalSabado = variablesPeliculas.horasabados - 1 ;
        String restsabado = totalSabado + "";
        String horarestsab = restsabado.substring(0, restsabado.indexOf("."));
        String minrestsab = restsabado.substring(0, restsabado.indexOf("."));
       
        tiemposabado = new JTextField();
        tiemposabado.setFont(new Font("Bell MT", Font.BOLD, 20));
        tiemposabado.setBounds(454, 434, 162, 38);
        listagen.getContentPane().add(tiemposabado);
        tiemposabado.setColumns(10);
        tiemposabado.setText(horarestsab+" h "+ minrestsab +" minutos");
       
		
    	
        double totalDomingo = variablesPeliculas.horadomingos - 1;
        String restDomingo = totalDomingo + "";
        String horarestdom = restDomingo.substring(0, restDomingo.indexOf("."));
        String minrestdom = restDomingo.substring(0, restDomingo.indexOf("."));
        
        tiempodomingo = new JTextField();
        tiempodomingo.setFont(new Font("Bell MT", Font.BOLD, 20));
        tiempodomingo.setBounds(793, 434, 162, 38);
        listagen.getContentPane().add(tiempodomingo);
        tiempodomingo.setColumns(10);
        tiempodomingo.setText(horarestdom+" h "+ minrestdom +" minutos");

       
        
       
        
        
     
        
       
       

     //JLABEL IMAGENES
		
        JLabel lblNewLabel_2 = new JLabel("New label");
    	lblNewLabel_2.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngegg (6).png"));
    	lblNewLabel_2.setBounds(263, 150, 256, 203);
    	listagen.getContentPane().add(lblNewLabel_2);
    	
    	JLabel lblNewLabel_3 = new JLabel("New label");
    	lblNewLabel_3.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngegg (6).png"));
    	lblNewLabel_3.setBounds(508, 150, 250, 203);
    	listagen.getContentPane().add(lblNewLabel_3);
    	
    	JLabel lblNewLabel_4 = new JLabel("New label");
    	lblNewLabel_4.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngegg (6).png"));
    	lblNewLabel_4.setBounds(757, 150, 250, 203);
    	listagen.getContentPane().add(lblNewLabel_4);
    	
    	JLabel lblNewLabel_9 = new JLabel("");
    	lblNewLabel_9.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngegg (6).png"));
    	lblNewLabel_9.setBounds(20, 150, 250, 203);
    	listagen.getContentPane().add(lblNewLabel_9);
    	
    	JLabel lblNewLabel_10 = new JLabel("");
    	lblNewLabel_10.setForeground(UIManager.getColor("Button.highlight"));
    	lblNewLabel_10.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
    	lblNewLabel_10.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\FondoAzul.png"));
    	lblNewLabel_10.setBounds(0, 0, 1024, 572);
    	listagen.getContentPane().add(lblNewLabel_10);

    	
    	
    	
    	
}




public void actionPerformed(ActionEvent e, Peliculas[] arrayObjetospelis){

        if(e.getSource()==btn_inicio){


        }


        if(e.getSource()==btn_continuar){


        }

   
     }


}

