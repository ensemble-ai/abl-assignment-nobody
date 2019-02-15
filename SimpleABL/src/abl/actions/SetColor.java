package abl.actions;

import java.awt.Color;
import game.Bot;
import game.GameEngine;

import java.awt.Point;



public class SetColor extends BaseAction {

	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[3]) {
				b.setColor(new Color((Integer)args[0],(Integer)args[1],(Integer)args[2]));
			}
		}
	}
}
