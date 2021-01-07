package rooms;

import game.Game;
import sprites.Player;
import utils.FileUtils;

public class NorthRoom extends Room {

	@Override
	public void loadRoom() {
		setRoomArr(FileUtils.readFileInput("res/NorthRoom.txt"));
	}

	@Override
	public void NorthDoorBehavior(Player player, Game game) {
		//doesn't lead anywhere
	}

	@Override
	public void SouthDoorBehavior(Player player, Game game) {
		player.setPosition(southDoorSpawn[0], southDoorSpawn[1]);
		changeMiddleRoom(game);
	}


}
