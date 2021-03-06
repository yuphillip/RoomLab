/*Phillip Yu*/
package Events;

import Game.Runner;
import People.Person;

public class HealEvent extends Room
{
    private int Health;
    public HealEvent(int v, int w, int Health)
    {
        super(v, w);
        this.Health = Health;

    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        Health = Health + 50;
        if(Health > 650)
        {
            Health = 650;
        }
        System.out.println("You found a Heal Room!");
        System.out.println("You got a free heal of 100 health. You now have " + Health + " " + "health left.");
    }

}
