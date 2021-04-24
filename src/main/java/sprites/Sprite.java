package sprites;

import java.awt.Graphics;

import collisions.CollisionManager;
import game.GameKeyAdapter;

public abstract class Sprite {

	int x;

	int y;

	protected GameKeyAdapter gameKeyAdapter;

	protected CollisionManager collisionManager;

	/**
	 * Constructor for sprites that will be user controlled. The x and y coordinates
	 * passed to this constructor will be the initial spawn coordinates of the
	 * sprite.
	 * 
	 * @param x coordinate to spawn sprite at as int.
	 * @param y coordinate to spawn sprite at as int.
	 */
	public Sprite(int x, int y, GameKeyAdapter gameKeyAdapter, CollisionManager collisionManager) {

		this.x = x;

		this.y = y;

		this.gameKeyAdapter = gameKeyAdapter;

		this.collisionManager = collisionManager;
	}

	/**
	 * Constructor for sprites that are non-user controlled.
	 * 
	 * @param x
	 * @param y
	 * @param collisionManager
	 */
	public Sprite(int x, int y, CollisionManager collisionManager) {

		this.x = x;

		this.y = y;

		this.collisionManager = collisionManager;
	}
	
	

	public abstract void tick();

	public abstract void render(Graphics g);

	public CollisionManager getCollisionManager() {
		return collisionManager;
	}

	public void setCollisionManager(CollisionManager collisionManager) {
		this.collisionManager = collisionManager;
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
