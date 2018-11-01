package Game;

import Rooms.Room;

public class Board {
    public static void main(String[] args) {
        Room[][] building = new Room[9][8];

        //Fill the building with normal rooms
        for (int x = 0; x < building.length; x++) {
            for (int y = 0; y < building[x].length; y++) {
                building[x][y] = new Room(x, y);
            }
        }
    }
}
