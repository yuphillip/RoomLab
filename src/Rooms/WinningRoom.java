package Rooms;

import Game.Runner;
import People.Person;

public class WinningRoom extends Room
{

	public WinningRoom(int x, int y, Boolean Fat) {
		super(x, y, false);

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
		System.out.println("You found the winning room! Ten points for Gryffindor.");
		Runner.gameOff();
	}
	

}
