package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Point;
/**
 * Stops the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class Stop extends BaseAction {

	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[0]) {
				b.setTrajectory(new Point(0, 0));
			}
		}
	}
}
