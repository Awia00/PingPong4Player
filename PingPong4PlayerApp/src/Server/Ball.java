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

	public Ball(Point2D position, float speed)
	{
		this.position = position;
		this.speed = speed;
	}
}
