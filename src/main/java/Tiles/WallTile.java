package tiles;

import java.awt.Graphics;
import graphics.Assets;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class WallTile extends Tile {

	public WallTile(int x, int y) {
		super(x, y);
	}

	private List<Rectangle> wallList = new ArrayList<Rectangle>();

	@Override
	public void render(Graphics g, int x, int y) {
		Rectangle r = new Rectangle(x, y, 50, 50);
		wallList.add(r);
		g.drawImage(Assets.getWall(), x, y, 100, 100, null);
	}

	public List<Rectangle> getWallList() {
		return this.wallList;
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
