package Rooms;

import Game.Runner;
import People.Person;


public class FoodRoom extends Room {
    public FoodRoom(int x, int y, Boolean Fat) {
        super(x, y, Fat);

    }
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Hey you found the food room, you lose your next turn to eat more!");


    }
}
