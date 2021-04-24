package tiles;

public class TileFactory {

	/**
	 * Returns a tile object.
	 * 
	 * @param x    coordinate
	 * @param y    coordinate
	 * @param type tile code 0-5
	 * @return tile object of specified type
	 */
	public Tile getTile(int x, int y, int type) {

		Tile t = null;

		if (type == 1) {
			t = new WallTile(x, y);
		} else if (type == 0) {
			t = new FloorTile(x, y);
		} else if (type == 2) {
			t = new WindowTile(x, y);
		} else if (type == 3) {
			t = new DoorTile(x, y);
		}
		if (type == 4) {
			t = new BedTile(x,y);
		}
		if (type == 5 ) {
			t = new DresserTile(x,y);
		}
		return t;
	}
}
