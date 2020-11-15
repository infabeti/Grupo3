package reto1grupo3;

import java.util.ArrayList;

public class variablesPeliculas {

	   static double
	   horasabados=8,
	   horadomingos=6;

	  
	    public static void main(String[] args) {
	    	 
	    	ArrayList <listageneros> listapeliculas=new ArrayList<listageneros>();
	    	listapeliculas.add(new listageneros("Avatar", "Sci-fi", 2.22));
	    	listapeliculas.add(new listageneros("Star Trek", "Sci-fi", 1.15));
	    	listapeliculas.add(new listageneros("Push", "Sci-fi", 1.55));
	    	listapeliculas.add(new listageneros("Priest", "Sci-fi", 1.57));
	    	listapeliculas.add(new listageneros("Monster Inc", "comedia", 1.21));
	    	listapeliculas.add(new listageneros("30 Minutes Or Less", "comedia", 1.21));
	    	listapeliculas.add(new listageneros("Knocked Up", "comedia", 1.34)); 
	    	listapeliculas.add(new listageneros("Alvin y las ardillas", "comedia", 1.28)); 
	    	listapeliculas.add(new listageneros("Insidious", "terror", 1.49)); 
	    	listapeliculas.add(new listageneros("Destino Final 5", "terror", 2.26)); 
	    	listapeliculas.add(new listageneros("The Uninvited", "terror", 2.35)); 
	    	listapeliculas.add(new listageneros("Constantine", "terror", 1.50)); 
	    	listapeliculas.add(new listageneros("Black Swan", "drama", 1.56)); 
	    	listapeliculas.add(new listageneros("8 Mile", "drama", 3.17)); 
	    	listapeliculas.add(new listageneros("In Time", "drama", 2.22)); 
	    	listapeliculas.add(new listageneros("Inception", "drama", 2.13));  
 
	    	
	    	System.out.println("* Lista de todas las Películas ");
			
	    	//for (listageneros e: listapeliculas) {
	    		//System.out.println(e.dameDatos());  
	    		//}
	    	String pelisdrama = "";
	    	String pelisterror = "";
	    	String peliscomedia = "";
	    	String pelisficcion = "";
       
	        for(int i=0;i<listapeliculas.size();i++){
	        	
	             if(listapeliculas.get(i).genero=="drama"){
	            	 
	            	 pelisdrama += listapeliculas.get(i).dameGenero();
	            	 System.out.println(pelisdrama);
	            	 
				}else if(listapeliculas.get(i).genero=="terror"){
					
					pelisterror += listapeliculas.get(i).dameGenero();
	            	 System.out.println(pelisterror);
					
				}else if(listapeliculas.get(i).genero=="comedia"){
					
					peliscomedia += listapeliculas.get(i).dameGenero();
	            	 System.out.println(peliscomedia);
					
				}else if(listapeliculas.get(i).genero=="Sci-fi"){
					
					pelisficcion += listapeliculas.get(i).dameGenero();
	            	 System.out.println(pelisficcion);
					
				}else {
					
				}
	             
	             
			}
	        

	}
}