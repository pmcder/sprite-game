package movement;

import sprites.Sprite;

/**
 * Can be implemented to define the movement
 * of computer controlled Sprites.
 * @author patrickmcdermott
 *
 */
public interface MovementStrategy {
	
	public void move(Sprite sprite);

}
