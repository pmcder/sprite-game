package tiles;

import java.awt.Graphics;

import graphics.Assets;

public class BedTile extends Tile  {

	public BedTile(int x, int y) {
		super(x, y);
	}

	@Override
	public void render(Graphics g, int x, int y) {
		g.drawImage(Assets.getBed(), x, y, 100, 100, null);
	}

	@Override
	public boolean isSolid() {
		return true;
	}

	

}
