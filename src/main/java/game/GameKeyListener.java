package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener{
	
	Window window;
	
	public GameKeyListener(Window window) {
		this.window = window;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			window.getStateManager().getCurrentState().changeState(window.getStateManager());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
