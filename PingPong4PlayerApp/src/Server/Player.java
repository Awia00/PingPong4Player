/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.awt.geom.Point2D;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class Player {

	private Bat bat;
	private int points;
	private String name;

	public Player(Bat bat, int points, String name)
	{
		this.bat = bat;
		this.points = points;
		this.name = name;
	}

	public static Player emptyPlayer()
	{
		return new Player(Bat.emptyBat(), 0, "");
	}

	public String getName()
	{
		return name;
	}

	public int getPoints()
	{
		return points;
	}

	public Point2D getBatPos()
	{
		return bat.getPosition();
	}

	public Point2D getBatLength()
	{
		return bat.getLength();
	}

	public boolean isEmpty()
	{
		if (name.equals(""))
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	public void moveBatPositve()
	{
		bat.movePositive();
	}
	
	public void moveBatNegative()
	{
		bat.moveNegative();
	}
}
