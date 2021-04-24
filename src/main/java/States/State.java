package states;
import java.awt.Graphics;

import game.GameKeyAdapter;

public abstract class State {
	
	protected GameKeyAdapter gameKeyAdapter;
	
	public State(GameKeyAdapter gameKeyAdapter) {
		this.gameKeyAdapter = gameKeyAdapter;
	}
	
	/**
	 * Updates variables for game objects in this state.
	 */
	public abstract void tick(); 
	
	/**
	 * Draws images for game objects in this state.
	 * @param g graphics object to draw to.
	 */
	public abstract void render(Graphics g); 
	
	public abstract void changeState(StateManager stateManager);
	
}
