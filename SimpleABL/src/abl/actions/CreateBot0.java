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
public class CreateBot0 extends BaseAction {

	/**
	 * Sets the trajectory of the player to move right.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		//System.out.println("***********************");
		//System.out.println((Integer)args[4]);
		//System.out.println("***********************");
		int a = 0;
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[2]) {
				a = 1;
			}
		}
		Bot c = new Bot();
		c.setLocation(new Point((Integer)args[0], (Integer)args[1]));
		GameEngine.getInstance().getBots().add(c);
	}
}
