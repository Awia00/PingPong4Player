/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.awt.geom.Point2D;

/**
 *
 * @author Anders Wind - awis@itu.dk
 */
public interface Interface_RetrieveServerInfo {
	
	/*
	Player specific methods
	*/
	public Point2D getPlayerXPosition(int playerID);
	public Point2D getPlayerXBatLength(int playerID);
	public int getPlayerXScore(int playerID);
	public int assignPlayer(String name);
	
	/*
	Game specific methods
	*/
	public Point2D getBallPosition();
	
	/*
	Message specific methods
	*/
	public String getWhichPlayersTurn();
	public String getMessage();
	
}
