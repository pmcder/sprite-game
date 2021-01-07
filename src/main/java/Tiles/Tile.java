package Tiles;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Tile {

	private int x;

	private int y;

	private Rectangle loc;

	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
		loc = new Rectangle(60 * this.x, 60 * this.y, 50, 50);
	}

	public abstract void render(Graphics g, int x, int y);

	public abstract boolean isSolid();

	/**
	 * Tile x and y coordinates
	 * @return a Rectangle object 
	 */
	public Rectangle getLocation() {
		return this.loc;
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