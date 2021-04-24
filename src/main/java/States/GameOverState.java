package states;

import java.awt.Graphics;

import game.GameKeyAdapter;
import graphics.Assets;

public class GameOverState extends State {

	public GameOverState(GameKeyAdapter gameKeyAdapter) {
		super(gameKeyAdapter);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.getGameOver(),0, 0, 600,600, null);
		
	}

	@Override
	public void changeState(StateManager stateManager) {
		//StateManager.setCurrentState(stateManager.getMenuState());
	}
}
