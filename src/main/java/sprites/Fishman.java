package sprites;

import java.awt.Graphics;
import java.awt.Rectangle;

import graphics.Assets;

import java.lang.Math;

import collisions.CollisionManager;

public class Fishman extends Sprite {
	
	int x; 
	
	int y;
	
	CollisionManager collisionManager;
	

	public Fishman(CollisionManager collisionManager) {
		//fishmen always spawn in hallway on right of screen
		this.x = (int) (Math.random()*(10-9))+9;
		this.y = (int) (Math.random()*(10-2))+2;
		this.collisionManager = collisionManager;
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
