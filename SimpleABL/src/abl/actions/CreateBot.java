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
public class CreateBot extends BaseAction {

	/**
	 * Sets the trajectory of the player to move right.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		//System.out.println("***********************");
		//System.out.println((Integer)args[4]);
		//System.out.println("***********************");
		int a = 0;
		int i = 0;
		for(Bot b:GameEngine.getInstance().getBots()) {
			i=i+1;
			if(b.getId() == (Integer)args[4]) {
				a = 1;
			}
		}
		//System.out.println(i);
		if(a==1&&i<5) {
			Bot c = new Bot();
			c.setLocation(new Point((Integer)args[0]+(Integer)args[2], (Integer)args[1]+(Integer)args[3] ));
			GameEngine.getInstance().getBots().add(c);
			///GameEngine.getInstance().startAgent();
			///c.notifyAll();
			if(i==1)
				c.x2p=20;
			if(i==2)
				c.x2p=-20;
			if(i==3)
				c.y2p=20;
			if(i==4)
				c.y2p=-20;				
		}
	}
}
