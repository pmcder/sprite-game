package graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;


public class Assets {
	
	private static BufferedImage gameOver, floor, wall, window, door, player, fishman, lock, menu, bed, dresser;
	
	public static void init() {
		try {
		floor = ImageIO.read(new File("res/floor.png"));
		wall =  ImageIO.read(new File("res/wall.png"));
		window = ImageIO.read(new File("res/window.png"));
		door = ImageIO.read(new File("res/door.png"));
		player = ImageIO.read(new File("res/player.png"));
		fishman = ImageIO.read(new File("res/fishman.png"));
		lock = ImageIO.read(new File("res/lock.png"));
		setMenu(ImageIO.read(new File("res/menu.png")));
		setBed(ImageIO.read(new File("res/bed.png")));
		setDresser(ImageIO.read(new File("res/dresser.png")));
		setGameOver(ImageIO.read(new File("res/gameOver.png")));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static BufferedImage getFloor() {
		return floor;
	}
	
	public static BufferedImage getWall() {
		return wall;
	}
	
	public static BufferedImage getWindow() {
		return window;
	}
	
	public static BufferedImage getDoor() {
		return door;
	}
	
	public static BufferedImage getPlayer() {
		return player;
	}
	
	public static BufferedImage getFishman() {
		return fishman;
	}
	
	public static BufferedImage getLock() {
		return lock;
	}

	public static BufferedImage getMenu() {
		return menu;
	}

	public static void setMenu(BufferedImage menu) {
		Assets.menu = menu;
	}

	public static BufferedImage getBed() {
		return bed;
	}

	public static void setBed(BufferedImage bed) {
		Assets.bed = bed;
	}

	public static BufferedImage getDresser() {
		return dresser;
	}

	public static void setDresser(BufferedImage dresser) {
		Assets.dresser = dresser;
	}

	public static BufferedImage getGameOver() {
		return gameOver;
	}

	public static void setGameOver(BufferedImage gameOver) {
		Assets.gameOver = gameOver;
	}
}
