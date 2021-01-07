package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GameKeyAdapter extends KeyAdapter {
	
	private int moveX, moveY; //space to move sprite
	
	@Override
	public void keyPressed(KeyEvent e) {
	     int key = e.getKeyCode();
	     
	     	
	     
	     	//takes input from the keyboard arrow keys
	     	
	        if (key == KeyEvent.VK_LEFT) {
	            moveX = -1;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            moveX = 1;
	        }

	        if (key == KeyEvent.VK_UP) {
	            moveY = -1;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            moveY = 1;
	        }
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            moveX = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            moveX = 0;
        }

        if (key == KeyEvent.VK_UP) {
            moveY = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            moveY = 0;
        }
		
	}
	
	public int getMoveX() {
		return moveX;
		}
	public int getMoveY() {
		return moveY;
		}
}
