package Events;

import Game.Runner;
import People.Person;

public class BattleEvent extends Room
{
    private int Health;
    public BattleEvent(int b, int e, int Health)
    {
        super(b, e);
        this.Health = Health;

    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        int BattleDmg = (int)(Math.random()*(100));
        Health = Health - BattleDmg;
        System.out.println("You ran in to a battle!");
        System.out.println("You took some damage from the battle. You now have " + Health + " " + "health left.");


    }


}
