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
public class Surround extends BaseAction {

	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			//int x = (Integer)args[0] - b.getX() + ( b.getId()*2 - 10 ) * 7;
			//int y = (Integer)args[1] - b.getY() - 70 + (Math.abs( b.getId() * 2 - 10 )*Math.abs( b.getId() * 2 - 10 )) ;
			double x = (Integer)args[0] - b.getX() + Math.sin(2*Math.PI*b.getId()/11)*60;
			double y = (Integer)args[1] - b.getY() + Math.cos(2*Math.PI*b.getId()/11)*60;
			double s = Math.sqrt(x*x+y*y)-0.00001;
			b.setTrajectory(new Point((int)(GameEngine.BotSpeed*x/s),(int)(GameEngine.BotSpeed*y/s)));
		}
	}
}
