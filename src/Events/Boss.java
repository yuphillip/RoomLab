/*Phillip Yu*/
package Events;

import Game.Runner;
import People.Person;

import static Game.Runner.gameOff;

public class Boss extends Room
{
	private int Health;
	public Boss(int x, int y, int Health) {
		super(x, y);
		this.Health = Health;

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the Boss room! Hope you have a weapon!");
        if(Health >= 100)
        {
            System.out.println("Yay! You beat the boss with only " + Health + " " + "left!");
            gameOff();
        }
        else
            System.out.println("Oh No! You couldn't take him down. You Died.");
            gameOff();
	}
	

}
