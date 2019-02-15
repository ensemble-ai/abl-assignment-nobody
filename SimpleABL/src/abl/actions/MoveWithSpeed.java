package abl.actions;

import game.Bot;
import game.GameEngine;
import java.awt.Point;


public class MoveWithSpeed extends BaseAction {

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
				int x_speed = (int) ((Integer)args[3] * x / s);
				int y_speed = (int) ((Integer)args[3] * y / s);
				
				b.setTrajectory(new Point(x_speed, y_speed));
			}
		}
	}
}