package game;

import java.awt.Graphics;
import collisions.CollisionManager;
import rooms.MiddleRoom;
import rooms.NorthRoom;
import rooms.Room;
import rooms.SouthRoom;
import sprites.Fishman;
import sprites.Player;

public class Game {
	
	private Room currentRoom; //room displayed and where player is located
	
	private Player player; //player 
	
	private Fishman fishman;
	
	private GameKeyAdapter gameKeyAdapter;
	
	private CollisionManager collisionManager;
	
    private Room southRoom = new SouthRoom();
	
	private Room middleRoom = new MiddleRoom();
	
	private Room northRoom = new NorthRoom();
	
	public Game(GameKeyAdapter gameKeyAdapter) {
		
		this.setGameKeyAdapter(gameKeyAdapter);
		
		setCurrentRoom(southRoom);
		
		collisionManager = new CollisionManager(this);
		
		player = new Player(gameKeyAdapter, collisionManager);
		
		fishman = new Fishman(collisionManager);
		
	}
	
	public void tick() {
		collisionManager.checkDoors();
		this.player.tick();
		this.fishman.tick();
	}
	
	public void render(Graphics g) {
		this.currentRoom.render(g);
		this.player.render(g);
		this.fishman.render(g);
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Room getSouthRoom() {
		return southRoom;
	}

	public void setSouthRoom(Room southRoom) {
		this.southRoom = southRoom;
	}

	public Room getMiddleRoom() {
		return middleRoom;
	}

	public void setMiddleRoom(Room middleRoom) {
		this.middleRoom = middleRoom;
	}

	public Room getNorthRoom() {
		return northRoom;
	}

	public void setNorthRoom(Room northRoom) {
		this.northRoom = northRoom;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public GameKeyAdapter getGameKeyAdapter() {
		return gameKeyAdapter;
	}

	public void setGameKeyAdapter(GameKeyAdapter gameKeyAdapter) {
		this.gameKeyAdapter = gameKeyAdapter;
	}

	public Fishman getFishman() {
		return fishman;
	}

	public void setFishman(Fishman fishman) {
		this.fishman = fishman;
	}

	public CollisionManager getCollisionManager() {
		return collisionManager;
	}

	public void setCollisionManager(CollisionManager collisionManager) {
		this.collisionManager = collisionManager;
	}
	
	

}
