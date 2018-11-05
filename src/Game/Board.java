package Game;

import Game.Runner;
import Rooms.Room;

public class Board {
    private static Room[][] building;

    public Board(Room[][]building)
    {
        this.building = building;
    }
    public static String buildBoard()
    {
        String vrBuilding = "";
        if(!(building[2][1]==null)) {
            for (int i = 0; i < building.length; i++) {
                for (int w = 0; w < building[i].length; w++) {
                    vrBuilding += "[]";
                }
                vrBuilding += "\n";
            }
        }
        return vrBuilding;
    }
}
