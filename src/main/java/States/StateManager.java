package states;

import game.GameKeyAdapter;

public class StateManager {

	private static State currentState;
	
	private State gameState;
	
	private State menuState;
	
	private State GameOverState;
	
	/**
	 * State manager instantiates all game states and can change between them
	 * and return the current state to a caller.
	 * @param gameKeyAdapter will be passed into all states 
	 */
	public StateManager(GameKeyAdapter gameKeyAdapter) {
		this.gameState = new GameState(gameKeyAdapter);
		this.setMenuState(new MenuState(gameKeyAdapter));
		currentState = this.menuState; //starts application in menu state
	}
	public State getCurrentState() {
		return currentState;
	}
	
	public static void setCurrentState(State state) {
		currentState = state;
	}
	public State getMenuState() {
		return menuState;
	}
	public void setMenuState(State menuState) {
		this.menuState = menuState;
	}
	public State getGameState() {
		return gameState;
	}
	public void setGameState(State gameState) {
		this.gameState = gameState;
	}
	public State getGameOverState() {
		return GameOverState;
	}
	public void setGameOverState(State gameOverState) {
		GameOverState = gameOverState;
	}
}
