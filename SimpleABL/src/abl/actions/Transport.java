package abl.actions;

import game.Bot;
import game.GameEngine;
import java.awt.Point;


public class Transport extends BaseAction {

	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[2]) {
				b.setLocation(new Point((Integer)args[0], (Integer)args[1]));
			}
		}
	}
}