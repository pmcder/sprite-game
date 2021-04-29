package sprites;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.lang.Math;

import collisions.CollisionManager;
import graphics.Assets;
import movement.BasicEnemyMovementStrategy;
import movement.InvalidSpriteTypeException;
import movement.MovementStrategy;

public class Fishman extends Sprite {
	
	MovementStrategy movementStrategy;
	
	/**
	 * Constructor will spawn fishman in the hallway on the right of the screen.
	 * @param collisionManager
	 */
	public Fishman(CollisionManager collisionManager) {
		
		super(((int) (Math.random()*(10-9))+9),((int) (Math.random()*(10-2))+2),collisionManager);
		this.movementStrategy = new BasicEnemyMovementStrategy();
	}
	
	@Override
	public void tick() {
			this.movementStrategy.move(this);	
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.getFishman(),60*x, 60*y, 50,50, null);
	}
	
	public Rectangle getLocation() {
		Rectangle loc = new Rectangle(60*x, 60*y, 35,35);
		return loc;
	}
	


}
