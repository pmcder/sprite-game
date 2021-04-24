package movement;

import sprites.Player;
import sprites.Sprite;


/**
 * A basic movement strategy for enemy sprites. 
 * Will move sprite randomly at a moderate speed. 
 * 
 * @author patrickmcdermott
 *
 */
public class BasicEnemyMovementStrategy implements MovementStrategy{

	@Override
	public void move(Sprite sprite)  {
		
		int tempX = (int) (sprite.getX()+(Math.random()*(1+2)-1));
		int tempY = (int) (sprite.getY()+(Math.random()*(1+2)-1));
		if (!sprite.getCollisionManager().isSolid(tempX, tempY)) {
			sprite.setX(tempX);
			sprite.setY(tempY);
			}
		
	}

}
