package Game;

import Game.Runner;
import Rooms.Room;

public class Board {
    private Room[][] building;

    public Board(Room[][]building)
    {
        this.building = building;
    }
    public String buildBoard()
    {
        String vrBuilding = "";
        for (int i = 0; i < building.length; i++) {
            for (int w = 0; w < building[i].length; w++) {
                vrBuilding += "[]";
            }
            vrBuilding += "\n";
        }
        return vrBuilding;
    }
}
