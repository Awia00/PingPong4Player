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
public class GameSession {

	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	
	private int pointsToWin;
	private int ActivePlayer = 0; // the last player who touched the ball or the player who just lost.
	private Ball ball;

	public GameSession(Player player1, Player player2, Player player3, Player player4, int pointsToWin, Ball ball)
	{
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.pointsToWin = pointsToWin;
		this.ball = ball;
	}
	
	public void moveBall()
	{
		
	}
	
	/**
	 * 
	 * @param PlayerID
	 * @return -1 if collision top/left +1 if collision down/right 0 if no collision.
	 */
	public int checkPlayerBoundsCollision(int PlayerID)
	{
		return 0;
	}
	
	/**
	 * 
	 * @param PlayerID
	 * @return true if coolision 
	 */
	public boolean checkPlayerBallCollision(int PlayerID)
	{
		return false;
	}
	
	public Point2D getPlayerXBatPos(int PlayerID)
	{
		switch (PlayerID){
				case 1: return player1.getBatPos();
				case 2: return player2.getBatPos();
				case 3: return player3.getBatPos();
				case 4: return player4.getBatPos();
		}
		return null;
	}
	
	public float getPlayerXBatLength(int PlayerID)
	{
		switch (PlayerID){
				case 1: return player1.getBatLength();
				case 2: return player2.getBatLength();
				case 3: return player3.getBatLength();
				case 4: return player4.getBatLength();
		}
		return 0;
	}
	
	public int getPlayerXPoints(int PlayerID)
	{
		switch (PlayerID){
				case 1: return player1.getPoints();
				case 2: return player2.getPoints();
				case 3: return player3.getPoints();
				case 4: return player4.getPoints();
		}
		return 0;
	}
	
	public String getPlayerXName(int PlayerID)
	{
		switch (PlayerID){
				case 1: return player1.getName();
				case 2: return player2.getName();
				case 3: return player3.getName();
				case 4: return player4.getName();
		}
		return "Error: no player";
	}
	
	public Point2D getBallPos()
	{
		return ball.getPosition();
	}
}
