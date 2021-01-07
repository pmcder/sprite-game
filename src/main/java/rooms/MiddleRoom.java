package rooms;

import game.Game;
import sprites.Player;
import utils.FileUtils;

public class MiddleRoom extends Room {

	@Override
	public void loadRoom() {
		setRoomArr(FileUtils.readFileInput("res/MiddleRoom.txt"));
	}

	@Override
	public void NorthDoorBehavior(Player player, Game game) {
		player.setPosition(northDoorSpawn[0], northDoorSpawn[1]);
		changeNorthRoom(game);
	}

	@Override
	public void SouthDoorBehavior(Player player, Game game) {
		player.setPosition(southDoorSpawn[0], southDoorSpawn[1]);
		changeSouthRoom(game);
	}
}
