package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import rooms.Room;

public class FileUtils {
	
	
	/**
	 * Reads room data file.
	 * @param fileName room file path
	 * @return room file matrix in 2D int array
	 */
	public static int[][] readFileInput(String fileName) {
		int[][] RoomArr = new int[Room.size][Room.size];
		int h = 0;
		try {
			Scanner fileInput = new Scanner(new File(fileName));
			while (fileInput.hasNext()) {
				String[] row = fileInput.nextLine().split("\\s+");
				for (int i = 0; i < Room.size; i++) {
					int j = Integer.parseInt(row[i]);
					RoomArr[i][h] = j;
				}
				h++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (NumberFormatException n) {
			n.printStackTrace();
			System.exit(1);
		}
		return RoomArr;
	}

}
