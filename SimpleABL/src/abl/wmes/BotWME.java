package abl.wmes;

import java.awt.Color;
import java.awt.Point;

import wm.WME;
/**
 * Stores information about the bot.
 * 
 * @author Ben Weber 3-7-11
 * @author Josh McCoy 1-23-2019
 */
public class BotWME extends WME {

	/** Location of the bot */
	private Point location;
	
	/** Trajectory of the bot */
	private Point trajectory;
	
	/** Color of the bot */
	private Color botColor;
	
	private int LastCreate; 
	
	/** ID of the bot */
	private int id;
	
	/**
	 * Instantiates a working memory element for tracking a bot.
	 */
	public BotWME(Point location, Point trajectory, Color botColor, int id) {
		this.location = location;
		this.trajectory = trajectory;
		this.botColor = botColor;
		this.id = id;
	}
	
	/**
	 * Returns the x location of the bot. 
	 */
	public int getLocationX() {
		return location.x;
	}
	
	/**
	 * Returns the y location of the bot. 
	 */
	public int getLocationY() {
		return location.y;
	}
	
	/**
	 * Returns the x direction of the bot. 
	 */
	public int getTrajectoryX() {
		return trajectory.x;
	}
	
	/**
	 * Returns the y direction of the bot. 
	 */
	public int getTrajectoryY() {
		return trajectory.y;
	}

	public int getId() {
		return id;
	}
	
	public Color getColor() {
		return botColor;
	}

	public void setId(int id) {
		this.id = id;
	}
}
