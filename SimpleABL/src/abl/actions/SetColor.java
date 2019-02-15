package abl.actions;

import java.awt.Color;
import game.Bot;
import game.GameEngine;

import java.awt.Point;
/**
 * Sets the trajectory of the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class SetColor extends BaseAction {

	/**
	 * Sets the trajectory of the player to move right.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[3]) {
				b.setColor(new Color((Integer)args[0],(Integer)args[1],(Integer)args[2]));
			}
		}
	}
}
