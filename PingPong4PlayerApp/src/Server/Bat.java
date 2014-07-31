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
public class Bat {
	
	private Point2D position;
	private Point2D direction;
	private float length;
	private float speed;
	
	public Bat(Point2D position, float length, float speed, Point2D direction)
	{
		this.position = position;
		this.length = length;
		this.speed = speed;
		this.direction = direction;
	}
	
	public static Bat emptyBat()
	{
		return new Bat(new Point2D.Float(), 0, 0,new Point2D.Float());
	}

	public float getLength()
	{
		return length;
	}

	public Point2D getPosition()
	{
		return position;
	}
	
	public void movePositive()
	{
		double x = position.getX() + speed*direction.getX();
		double y = position.getY() + speed*direction.getY();
		position = new Point2D.Double(x, y);
	}
	
	public void moveNegative()
	{
		double x = position.getX() + -1*speed*direction.getX();
		double y = position.getY() + -1*speed*direction.getY();
		position = new Point2D.Double(x, y);
	}
	
}
