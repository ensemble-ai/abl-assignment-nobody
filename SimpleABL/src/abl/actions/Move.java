package abl.actions;

import game.Bot;
import game.GameEngine;
import java.awt.Point;

/**
 * Sets the trajectory of the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class Move extends BaseAction {

	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[2]) {
				int x = (Integer)args[0] - b.getX();
				int y = (Integer)args[1] - b.getY();
				
				double s = Math.sqrt(x * x + y * y);
				int x_speed = (int) ((Integer)GameEngine.BotSpeed * x / s);
				int y_speed = (int) ((Integer)GameEngine.BotSpeed * y / s);
				
				b.setTrajectory(new Point(x_speed, y_speed));
			}
		}
	}
}