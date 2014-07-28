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
	private float length;
	private float speed;
	
	public Bat(Point2D position, float length, float speed)
	{
		this.position = position;
		this.length = length;
		this.speed = speed;
	}
	
	public static Bat emptyBat()
	{
		return new Bat(new Point2D.Float(), 0, 0);
	}

}
