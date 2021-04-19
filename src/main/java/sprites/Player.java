package sprites;

import java.awt.Graphics;
import java.awt.Rectangle;

import collisions.CollisionManager;
import game.GameKeyAdapter;
import graphics.Assets;


public class Player extends Sprite {
	
	
		
	public Player(GameKeyAdapter gameKeyAdapter, CollisionManager collisionManager) {
		
		super(1, 4, gameKeyAdapter, collisionManager);
		
	}

	@Override
		public void render(Graphics g) {
			g.drawImage(Assets.getPlayer(),60*x, 60*y, 50,50, null);
		}

	@Override
	public void tick() {
		moveX();
		moveY();
		}
	
	public Rectangle getLocation() {
		Rectangle loc = new Rectangle(60*x, 60*y, 35,35);
		return loc;
	}
	
	/**
	 * Checks for collision with solid tile.
	 * Moves sprite right or left
	 */
	public void moveX() {
		int tempX = this.x + gameKeyAdapter.getMoveX();
		int tempY = this.y + gameKeyAdapter.getMoveY();
		if (!this.collisionManager.isSolid(tempX, tempY)) {
		this.x = this.x + gameKeyAdapter.getMoveX();
		}
		else {
			return;
		}
	}
	
	/**
	 * Checks for collision with solid tile.
	 * Moves sprite up or down
	 */
	public void moveY() {
		int tempX = this.x + gameKeyAdapter.getMoveX();
		int tempY = this.y + gameKeyAdapter.getMoveY();
		if (!this.collisionManager.isSolid(tempX, tempY)) {
			this.y = this.y + gameKeyAdapter.getMoveY();
			}
			else {
				return;
			}
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
}


