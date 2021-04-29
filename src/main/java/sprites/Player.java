package sprites;

import java.awt.Graphics;
import java.awt.Rectangle;


import graphics.Assets;


public class Player extends Sprite {
	
	
		
	public Player() {
		
		super(1, 4);
		
	}

	@Override
		public void render(Graphics g) {
			g.drawImage(Assets.getPlayer(),60*x, 60*y, 50,50, null);
		}

	@Override
	public void tick() {
		
		}
	
	public Rectangle getLocation() {
		Rectangle loc = new Rectangle(60*x, 60*y, 35,35);
		return loc;
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


