package reto1grupo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Color;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class listageneros {

public static JButton btnDrama, btnNSci, btnComedia, btnTerror, btn_inicio, btn_continuar;


public  JFrame frame;
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
frame = new JFrame();
frame.getContentPane().setBackground(Color.WHITE);
frame.setBackground(Color.WHITE);
frame.setBounds(100, 100, 819, 697);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JButton btnDrama = new JButton("Drama");
btnDrama.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg1) {
pelisDrama frame = new pelisDrama();
frame.setVisible(true);
}
});
btnDrama.setForeground(Color.WHITE);
btnDrama.setBackground(Color.BLACK);
btnDrama.setBounds(28, 85, 139, 37);
frame.getContentPane().add(btnDrama);

JButton btnNSci = new JButton("Sci-Fi");
btnNSci.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg1) {
pelisCienciaFiccion frame = new pelisCienciaFiccion();
frame.setVisible(true);

}
});
btnNSci.setForeground(Color.WHITE);
btnNSci.setBackground(Color.BLACK);
btnNSci.setBounds(194, 85, 139, 37);
frame.getContentPane().add(btnNSci);

JButton btnComedia = new JButton("Comedia");
btnComedia.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg1) {
pelisComedia frame = new pelisComedia();
frame.setVisible(true);
}
});
btnComedia.setForeground(Color.WHITE);
btnComedia.setBackground(Color.BLACK);
btnComedia.setBounds(362, 85, 139, 37);
frame.getContentPane().add(btnComedia);

JButton btnTerror = new JButton("Terror");
btnTerror.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg1) {
pelisTerror frame = new pelisTerror();
frame.setVisible(true);
}
});
btnTerror.setForeground(Color.WHITE);
btnTerror.setBackground(Color.BLACK);
btnTerror.setBounds(536, 85, 139, 37);
frame.getContentPane().add(btnTerror);

JLabel lblSeleccion = new JLabel("PELÍCULAS YA SELECCIONADAS");
lblSeleccion.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
lblSeleccion.setBounds(28, 156, 245, 20);
frame.getContentPane().add(lblSeleccion);

JButton btnPsicosis = new JButton(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (26).png"));
btnPsicosis.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
btnPsicosis.setBounds(28, 215, 213, 266);
frame.getContentPane().add(btnPsicosis);

String cad1 = variablesPeliculas.BlackSwan + "";
String hora = cad1.substring(0, cad1.indexOf("."));
String minutos = cad1.substring(cad1.indexOf(".") + 1);


JLabel p_Psicosis=new JLabel(hora+" h "+ minutos +" minutos "+variablesPeliculas.nombreBlackSwan);
p_Psicosis.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        p_Psicosis.setBounds(38,492,192,50);
        frame.getContentPane().add(p_Psicosis);
       
        JButton btnCisnenegro = new JButton("");
        btnCisnenegro.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo3\\reto1grupo3\\src\\imagenes\\pngwing.com (34).png"));
        btnCisnenegro.setBounds(251, 215, 213, 266);
        frame.getContentPane().add(btnCisnenegro);
       
String cad2 = variablesPeliculas.Constantine + "";
String hora2 = cad2.substring(0, cad2.indexOf("."));
String minutos2 = cad2.substring(cad2.indexOf(".") + 1);
       

       
        JLabel p_cisneNegro = new JLabel(hora2+" h "+ minutos2 +" minutos "+variablesPeliculas.nombreConstantine);
        p_cisneNegro.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        p_cisneNegro.setBounds(270, 510, 185, 14);
        frame.getContentPane().add(p_cisneNegro);
       
        JLabel lblNewLabel = new JLabel("TIEMPO RESTANTE:");
        lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
        lblNewLabel.setBounds(612, 159, 145, 14);
        frame.getContentPane().add(lblNewLabel);
       
        JLabel lblNewLabel_1 = new JLabel("S\u00C1BADO:");
        lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(612, 215, 117, 28);
        frame.getContentPane().add(lblNewLabel_1);
       
       
       
       
        double totalSabado = variablesPeliculas.horasabados - variablesPeliculas.BlackSwan ;
        String restsabado = totalSabado + "";
        String horarestsab = restsabado.substring(0, restsabado.indexOf("."));
        String minrestsab = restsabado.substring(0, restsabado.indexOf("."));
       
        tiemposabado = new JTextField();
        tiemposabado.setHorizontalAlignment(SwingConstants.CENTER);
        tiemposabado.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tiemposabado.setBounds(612, 254, 145, 28);
        frame.getContentPane().add(tiemposabado);
        tiemposabado.setColumns(10);
        tiemposabado.setText(horarestsab+" h "+ minrestsab +" minutos");
       
        JLabel lblNewLabel_1_1 = new JLabel("DOMINGO:");
        lblNewLabel_1_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(612, 310, 117, 28);
        frame.getContentPane().add(lblNewLabel_1_1);
       
        double totalDomingo = variablesPeliculas.horadomingos - variablesPeliculas.Constantine;
        String restDomingo = totalDomingo + "";
        String horarestdom = restDomingo.substring(0, restDomingo.indexOf("."));
        String minrestdom = restDomingo.substring(0, restDomingo.indexOf("."));
        tiempodomingo = new JTextField();
        tiempodomingo.setHorizontalAlignment(SwingConstants.CENTER);
        tiempodomingo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tiempodomingo.setBounds(612, 349, 145, 28);
        frame.getContentPane().add(tiempodomingo);
        tiempodomingo.setColumns(10);
        tiempodomingo.setText(horarestdom+" h "+ minrestdom +" minutos");
       

     


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


