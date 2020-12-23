package reto1grupo3;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



public class main {
	
	
	public static void main(String[]args) {
		Timer timer=new Timer();
		TimerTask tarea=new TimerTask() {
			
		
		
		@Override
		public void run() {
			
				try {
					login frame = new login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();

			
				}
		}
	

		
	};
	timer.schedule(tarea,3000);
	bienvenida frame = new bienvenida();
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	
	
	
	
	

}
}

	
