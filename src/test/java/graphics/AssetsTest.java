package graphics;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;

import org.junit.jupiter.api.Test;


class AssetsTest {

	@Test
	void Floortest() {
		Assets.init();
		assertEquals(Assets.getFloor().getClass(),BufferedImage.class);
	}
	
	@Test
	void Walltest() {
		Assets.init();
		assertEquals(Assets.getWall().getClass(),BufferedImage.class);
	}
	
	@Test
	void Doortest() {
		Assets.init();
		assertEquals(Assets.getDoor().getClass(),BufferedImage.class);
	}
	
	@Test
	void Windowtest() {
		Assets.init();
		assertEquals(Assets.getWindow().getClass(),BufferedImage.class);
	}
		
	@Test
	void Playertest() {
		Assets.init();
		assertEquals(Assets.getPlayer().getClass(),BufferedImage.class);
	}
	
	

}
