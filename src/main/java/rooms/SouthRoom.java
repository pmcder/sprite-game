package rooms;

import game.Game;
import sprites.Player;
import utils.FileUtils;

public class SouthRoom extends Room {
	

	@Override
	public void loadRoom() {
		setRoomArr(FileUtils.readFileInput("res/SouthRoom.txt"));
}

	@Override
	public void NorthDoorBehavior(Player player, Game game) {
		player.setPosition(northDoorSpawn[0], northDoorSpawn[1]);
		changeMiddleRoom(game);
	}

	@Override
	public void SouthDoorBehavior(Player player, Game game) {
		// doesn't lead anywhere
	}


	}