package tiles;

import java.awt.Graphics;

import graphics.Assets;

public class WindowTile extends Tile {

	public WindowTile(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g, int x, int y) {
		g.drawImage(Assets.getWindow(), x, y, 100, 100, null);

	}

	@Override
	public boolean isSolid() {
		// TODO Auto-generated method stub
		return false;
	}

}
