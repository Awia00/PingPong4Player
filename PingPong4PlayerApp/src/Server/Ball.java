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
public class Ball {

	private Point2D position;
	private float speed;
	private Point2D direction;
	
	public Ball(Point2D position, float speed, Point2D direction)
	{
		this.position = position;
		this.speed = speed;
		this.direction = direction;
	}
	
	public static Ball emptyBall()
	{
		return new Ball(new Point2D.Float(), 0, new Point2D.Float());
	}

	public Point2D getPosition()
	{
		return position;
	}
	
	public void move()
	{
		double x = position.getX() + speed*direction.getX();
		double y = position.getY() + speed*direction.getY();
		position = new Point2D.Double(x, y);
	}
	
	public void changeDirectionX()
	{
		double x = direction.getX()*-1;
		direction = new Point2D.Double(x, direction.getY());
	}
	
	public void changeDirectionY()
	{
		double y = direction.getY()*-1;
		direction = new Point2D.Double(y, direction.getY());
	}
}
