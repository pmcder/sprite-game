package collisions;

import game.Game;
import rooms.Room;



public class CollisionManager  {
	
	private Game game;
	
	public CollisionManager(Game game) {
		this.game = game;
	}
		
	/**
	 * Checks if player has reached a door and is so calls that door's
	 * DoorBeahvior method.
	 */
	public void checkDoors() {
			if (game.getPlayer().getLocation().intersects(Room.northDoor)) {
					game.getCurrentRoom().NorthDoorBehavior(game.getPlayer(), game);
				}
			if (game.getPlayer().getLocation().intersects(Room.southDoor)) {
				game.getCurrentRoom().SouthDoorBehavior(game.getPlayer(), game);
			}
	}
	
	/**
	 * Checks player and enemy's position by calling intersect on 
	 * their respective locations.
	 * @return true if there is a collision. returns false if not.
	 */
	public boolean checkEnemies() {
		//return game.getFishman().getLocation().intersects(this.game.getPlayer().getLocation());
		return game.getFishemen().parallelStream().anyMatch(p->(p.getLocation().intersects(this.game.getPlayer().getLocation())==true));
		}
		
	
	/**
	 * Checks for collision with wall.
	 * @param x sprite coordinate
	 * @param y sprite coordinate
	 * @return true if object is solid.
	 */
	public boolean isSolid(int x, int y) {
		if (isOffScreen(x, y)) {
			return true;
		}
		else if ((game.getCurrentRoom().getTileFactory().getTile(x, y, game.getCurrentRoom().getRoomArr()[x][y]).isSolid())){
			return true;
		}
		return false;
	}
	
	/**
	 * checks player not off edge of screen
	 * @param x sprite coordinate
	 * @param y sprite coordinate
	 * @return true if player goes off screen
	 */
	public boolean isOffScreen(int x, int y) {
		if (x >= Room.size || y >= Room.size) {
			return true;
		}
		else if (x <= -1 || y <= -1) {
			return true;
		}
		return false;
	}
}
	
	
	


