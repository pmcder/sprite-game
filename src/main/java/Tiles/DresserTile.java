package Tiles;

import java.awt.Graphics;

import graphics.Assets;

public class DresserTile extends Tile {

	public DresserTile(int x, int y) {
		super(x, y);
	}

	@Override
	public void render(Graphics g, int x, int y) {
		g.drawImage(Assets.getDresser(), x, y, 100, 100, null);

	}

	@Override
	public boolean isSolid() {
		return true;
	}

}
