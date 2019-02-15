package abl.actions;

import game.Bot;
import game.Bullet;
import game.GameEngine;

import java.awt.Point;
/**
 * Stops the chaser. 
 * 
 * @author Ben Weber 3-7-11
 */
public class BulletDetection extends BaseAction {

	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() > 0) {
				for(Bullet bu:GameEngine.getInstance().getBullets()) {
					if ((bu.getX() - 5 < b.getX()) && (bu.getX() + 5 > b.getX()) &&
							(bu.getY() - 5 < b.getY()) && (bu.getY() + 5 > b.getY())) {
						GameEngine.getInstance().getBots().remove(b);
					}
				}
			}
		}
	}
}
