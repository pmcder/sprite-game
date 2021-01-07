package States;

import java.awt.Graphics;

import game.GameKeyAdapter;
import graphics.Assets;

public class MenuState extends State {

	public MenuState(GameKeyAdapter gameKeyAdapter) {
		super(gameKeyAdapter);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.getMenu(),0, 0, 600,600, null);
	}

	@Override
	public void changeState(StateManager stateManager) {
		StateManager.setCurrentState(stateManager.getGameState());	
	}
	

}
