/*Phillip Yu*/
package Game;

import Events.Room;

public class Board {
    private Room[][] building;

    public Board(Room[][]building)
    {
        this.building = building;
    }
    public void buildBoard()
    {

    }
    public String printBoard()
    {
        String vrBuilding = "";
        if(!(building[0][0]==null))
        {
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
