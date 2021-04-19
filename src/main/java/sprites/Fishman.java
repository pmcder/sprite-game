package sprites;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.lang.Math;

import collisions.CollisionManager;
import graphics.Assets;

public class Fishman extends Sprite {
	
	/**
	 * Constructor will spawn fishman in the hallway on the right of the screen.
	 * @param collisionManager
	 */
	public Fishman(CollisionManager collisionManager) {
		
		super(((int) (Math.random()*(10-9))+9),((int) (Math.random()*(10-2))+2),collisionManager);
	}
	
	@Override
	public void tick() {
		
		int tempX = (int) (x+(Math.random()*(1+2)-1));
		int tempY = (int) (y+(Math.random()*(1+2)-1));
		if (!this.collisionManager.isSolid(tempX, tempY)) {
			this.x = tempX;
			this.y = tempY;
			}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.getFishman(),60*x, 60*y, 50,50, null);
	}
	
	public Rectangle getLocation() {
		Rectangle loc = new Rectangle(60*x, 60*y, 35,35);
		return loc;
	}
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

}
