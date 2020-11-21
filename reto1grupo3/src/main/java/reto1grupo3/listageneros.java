package reto1grupo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

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

	   


	public JButton btnDrama, btnNSci, btnComedia, btnTerror, btn_inicio, btn_continuar;


	public  JFrame listagen;
	public  JTextField tiemposabado;
	private JTextField tiempodomingo;
	

	
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
    
	listagen = new JFrame();
	listagen.getContentPane().setBackground(Color.WHITE);
	listagen.setBackground(Color.WHITE);
	listagen.setBounds(100, 100, 819, 697);
	listagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	listagen.getContentPane().setLayout(null);

	JButton btnDrama = new JButton("Drama");
	btnDrama.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
		
		String pelisdrama = imprimeArrayPeliculas(arrayObjetospelis);
	
		pelisDrama frame = new pelisDrama(pelisdrama);
		frame.setVisible(true);
		listagen.dispose();
		
	
	}
	});
	
	btnDrama.setForeground(Color.WHITE);
	btnDrama.setBackground(Color.BLACK);
	btnDrama.setBounds(28, 85, 139, 37);
	listagen.getContentPane().add(btnDrama);

	JButton btnNSci = new JButton("Sci-Fi");
	btnNSci.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
		String peliscienfic = imprimeArrayPeliculas2(arrayObjetospelis);
		pelisCienciaFiccion frame = new pelisCienciaFiccion(peliscienfic);
		frame.setVisible(true);
		listagen.dispose();
	}
	});
	btnNSci.setForeground(Color.WHITE);
	btnNSci.setBackground(Color.BLACK);
	btnNSci.setBounds(194, 85, 139, 37);
	listagen.getContentPane().add(btnNSci);

	JButton btnComedia = new JButton("Comedia");
	btnComedia.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
		
		String peliscomedia = imprimeArrayPeliculas1(arrayObjetospelis);
		pelisComedia frame = new pelisComedia(peliscomedia);
		frame.setVisible(true);
		listagen.dispose();
	}
	});
	btnComedia.setForeground(Color.WHITE);
	btnComedia.setBackground(Color.BLACK);
	btnComedia.setBounds(362, 85, 139, 37);
	listagen.getContentPane().add(btnComedia);

	JButton btnTerror = new JButton("Terror");
	btnTerror.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg1) {
			
		String pelisterror = imprimeArrayPeliculas3(arrayObjetospelis);
		pelisTerror frame = new pelisTerror(pelisterror);
		frame.setVisible(true);
		listagen.dispose();
	}
	});
		
	btnTerror.setForeground(Color.WHITE);
	btnTerror.setBackground(Color.BLACK);
	btnTerror.setBounds(536, 85, 139, 37);
	listagen.getContentPane().add(btnTerror);

	JLabel lblSeleccion = new JLabel("PELÍCULAS YA SELECCIONADAS");
	lblSeleccion.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
	lblSeleccion.setBounds(28, 156, 245, 20);
	listagen.getContentPane().add(lblSeleccion);

       
        JLabel lblNewLabel = new JLabel("TIEMPO RESTANTE:");
        lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
        lblNewLabel.setBounds(612, 159, 145, 14);
        listagen.getContentPane().add(lblNewLabel);
       
        JLabel lblNewLabel_1 = new JLabel("S\u00C1BADO:");
        lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(612, 215, 117, 28);
        listagen.getContentPane().add(lblNewLabel_1);
       

        double totalSabado = variablesPeliculas.horasabados - 1 ;
        String restsabado = totalSabado + "";
        String horarestsab = restsabado.substring(0, restsabado.indexOf("."));
        String minrestsab = restsabado.substring(0, restsabado.indexOf("."));
       
        tiemposabado = new JTextField();
        tiemposabado.setHorizontalAlignment(SwingConstants.CENTER);
        tiemposabado.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tiemposabado.setBounds(612, 254, 145, 28);
        listagen.getContentPane().add(tiemposabado);
        tiemposabado.setColumns(10);
        tiemposabado.setText(horarestsab+" h "+ minrestsab +" minutos");
       
        JLabel lblNewLabel_1_1 = new JLabel("DOMINGO:");
        lblNewLabel_1_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(612, 310, 117, 28);
        listagen.getContentPane().add(lblNewLabel_1_1);
       
        double totalDomingo = variablesPeliculas.horadomingos - 1;
        String restDomingo = totalDomingo + "";
        String horarestdom = restDomingo.substring(0, restDomingo.indexOf("."));
        String minrestdom = restDomingo.substring(0, restDomingo.indexOf("."));
        tiempodomingo = new JTextField();
        tiempodomingo.setHorizontalAlignment(SwingConstants.CENTER);
        tiempodomingo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tiempodomingo.setBounds(612, 349, 145, 28);
        listagen.getContentPane().add(tiempodomingo);
        tiempodomingo.setColumns(10);
        tiempodomingo.setText(horarestdom+" h "+ minrestdom +" minutos");
        
        JButton btnNewButton = new JButton("SALIR");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		System.exit(0);
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(331, 537, 139, 37);
        listagen.getContentPane().add(btnNewButton);
       

     


}


public void actionPerformed(ActionEvent e, Peliculas[] arrayObjetospelis){

        if(e.getSource()==btn_inicio){


        }


        if(e.getSource()==btn_continuar){


        }

   
     }


}


