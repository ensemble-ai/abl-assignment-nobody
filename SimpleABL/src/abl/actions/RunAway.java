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
public class RunAway extends BaseAction {

	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			double x = (Integer)args[0] - b.getX() + (int)(Math.random()*150) - 75;
			double y = (Integer)args[1] - b.getY() + (int)(Math.random()*90) - 45;
			double s = Math.sqrt(x*x+y*y)-0.00001;
			int dis = Math.abs((Integer)args[0]-b.getX())+Math.abs((Integer)args[1]-b.getY());
			int speed = GameEngine.BotSpeed;
			if(dis<300)
				b.setTrajectory(new Point((int)(-speed*x/s),(int)(-speed*y/s)));
			else
				b.setTrajectory(new Point((int)(speed*Math.random()-speed/2),(int)(speed*Math.random()-speed/2)));
		}
	}
}
