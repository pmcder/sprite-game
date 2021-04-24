package tiles;

import java.awt.Graphics;

import graphics.Assets;

public class FloorTile extends Tile {

	public FloorTile(int x, int y) {
		super(x, y);
	}

	@Override
	public void render(Graphics g, int x, int y) {
		g.drawImage(Assets.getFloor(), x, y, 100, 100, null);
	}

	@Override
	public boolean isSolid() {
		return false;
	}
}
