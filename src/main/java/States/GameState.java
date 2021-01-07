package States;


import java.awt.Graphics;
import game.Game;
import game.GameKeyAdapter;

public class GameState extends State {
	
	Game game;
			
	/*
	 * This state passes Graphics object to game's render 
	 * method so that game board is rendered to game window.
	 * Sends gameKeyAdapter commands to control the player sprite.
	 */
	public GameState(GameKeyAdapter gameKeyAdapter) {
		super(gameKeyAdapter);
		this.game = new Game(gameKeyAdapter);
	}
		
	@Override
	public void tick() { 
		this.game.tick();
		if (this.game.getCollisionManager().checkEnemies()) {
				StateManager.setCurrentState(new GameOverState(game.getGameKeyAdapter()));
		}
	}

	@Override
	public void render(Graphics g) {
		this.game.render(g);
	}

	@Override
	public void changeState(StateManager stateManager) {
		StateManager.setCurrentState(stateManager.getMenuState());
	}	
	
}
