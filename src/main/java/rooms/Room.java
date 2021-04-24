package rooms;

import java.awt.Graphics;
import java.awt.Rectangle;

import game.Game;
import sprites.Player;
import tiles.TileFactory;

public abstract class Room {
		
	public static final int size = 10;
		
	public static final Rectangle northDoor = new Rectangle(4*60,0,25,25);
	
	public static final Rectangle southDoor = new Rectangle(4*60,9*60,25,25);
	
	protected static int[] northDoorSpawn = new int[] {4,8};
	
	protected static int[] southDoorSpawn = new int[] {4,1};
	
	private int[][] RoomArr = new int[size][size];
	
	private TileFactory tileFactory = new TileFactory();
	
	public Room() {
		loadRoom();
	}

	/**
	 * Iterates through RoomArr and uses values to generate a tile.
	 * 
	 * @param g graphics object to render to.
	 */
	public void render(Graphics g) {
		try {
			for (int i = 0; i < size; i++)
				for (int j = 0; j < size; j++) {
					int t = this.RoomArr[i][j];
					tileFactory.getTile(i, j, t).render(g, i * 60, j * 60);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Loads room to display.
	 */
	public abstract void loadRoom();
	
	public abstract void NorthDoorBehavior(Player player, Game game);
	
	public abstract void SouthDoorBehavior(Player player, Game game);
		
	public void changeMiddleRoom(Game game){
		game.setCurrentRoom(game.getMiddleRoom());
	}
	
	public void changeSouthRoom(Game game){
		game.setCurrentRoom(game.getSouthRoom());
	}
	
	public void changeNorthRoom(Game game){
		game.setCurrentRoom(game.getNorthRoom());
	}
	
	public TileFactory getTileFactory() {
		return tileFactory;
	}

	public void setTileFactory(TileFactory tileFactory) {
		this.tileFactory = tileFactory;
	}

	public int[][] getRoomArr() {
		return RoomArr;
	}
	
	public void setRoomArr(int[][] roomArr) {
		RoomArr = roomArr;
	}

	public Rectangle getNorthDoor() {
		return northDoor;
	}

	public Rectangle getSouthDoor() {
		return southDoor;
	}
}