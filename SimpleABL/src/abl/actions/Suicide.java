package abl.actions;

import game.Bot;
import game.GameEngine;
import wm.WME;
import wm.WorkingMemory;

import java.awt.Point;
/**
 * Sets the trajectory of the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class Suicide extends BaseAction {

	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			GameEngine.getInstance().getBots().remove(b);
			break;
		}		
	}
}
