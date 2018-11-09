package Events;

import Game.Runner;
import People.Person;

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


	}
	

}
