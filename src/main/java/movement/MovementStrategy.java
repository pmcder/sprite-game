package movement;

import sprites.Sprite;

/**
 * Can be implemented to define the movement
 * of computer controlled Sprites.
 * @author patrickmcdermott
 *
 */
public interface MovementStrategy {
	
	/**
	 * Updates x and y of sprite passed to move its position. 
	 * @param sprite to move.
	 * @throws InvalidSpriteTypeException if Sprite type invalid for this MovementStrategy
	 */
	public void move(Sprite sprite);

}
