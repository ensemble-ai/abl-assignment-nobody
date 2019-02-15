package abl.actions;

import game.Bot;
import game.GameEngine;
import java.awt.Point;

// Create a Bot
public class CreateBot extends BaseAction {

	public void execute(Object[] args) {
		Bot b = new Bot();
		b.setLocation(new Point((Integer)args[0], (Integer)args[1]));
		GameEngine.getInstance().getBots().add(b);
		//System.out.println("XXX Created!");
	}
}