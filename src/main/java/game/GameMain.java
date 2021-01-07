package game;


public class GameMain {
 
	
	public static void main(String[] args) {
		
		//GUI objects 
		Window gw = new Window ("Innsmouth Escape"); 
		Thread gameThread = new Thread(gw) ;
		gameThread.start();	
	}
}



