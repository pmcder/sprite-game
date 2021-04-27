package collisions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import game.Game;
import game.GameKeyAdapter;


class CollisionManagerTest {
	GameKeyAdapter gameKeyAdapter = new GameKeyAdapter();
	Game game = new Game(gameKeyAdapter);
	CollisionManager collisionManager = new CollisionManager(game);
	int fishmanX;
	int fishmanY;
	int playerX;
	int playerY;
	

	@Test
	void testIsOffScreen() {
		//get initial position of the player
		playerX = game.getPlayer().getX();
		playerY = game.getPlayer().getY();
		//System.out.println(playerX);
		//System.out.println(playerY);
		
		//test if the player's within the screen at initial position
		assertFalse(collisionManager.isOffScreen(playerX, playerY));
		
		//re-assign position of the player to a new position 
		//outside the screen
		playerX = game.getCurrentRoom().size + 1;
		playerY = game.getCurrentRoom().size + 1;
		//System.out.println(playerX);
		//System.out.println(playerY);
		
		//test if the player's within the screen after re-assignment
		assertTrue(collisionManager.isOffScreen(playerX, playerY));	
	}
}
