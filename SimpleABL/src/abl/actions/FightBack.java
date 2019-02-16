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
public class FightBack extends BaseAction {

	/**
	 * Sets the trajectory of the player to move down.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		int a = 0;
		for(Bot b:GameEngine.getInstance().getBots()) {
			a = a+1;
			int x = (int)(Math.random()*11);
			int s = Math.abs((Integer)args[0]-b.getX())+Math.abs((Integer)args[1]-b.getY());
			if(a==x && ( s>100 ) ) {
				int rx = (int)(Math.random()*s/10)-s/20;
				int ry = (int)(Math.random()*s/16)-s/32;
				int disx = 0, disy = 0;
				if (((Integer)args[0]-b.getX()) != 0)
					disx = ((Integer)args[0]-b.getX())/((Integer)args[0]-b.getX())*10;
				if (((Integer)args[1]-b.getY()) != 0)
					disy = ((Integer)args[1]-b.getY())/((Integer)args[1]-b.getY())*10;
				GameEngine.getInstance().fireBullet(
					new Point(b.getX()+disx, b.getY()+disy), 
					new Point((Integer)args[0]+rx, (Integer)args[1]+ry));
			}
		}
		//System.out.println(a);
	}
}
