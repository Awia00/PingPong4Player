/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class GameSession {

	private ArrayList<Player> players;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	
	private int pointsToWin;
	private int ActivePlayer = 0; // the last player who touched the ball or the player who just lost.
	private Ball ball;

	public GameSession(Player player1, Player player2, Player player3, Player player4, int pointsToWin, Ball ball)
	{
		players = new ArrayList<>();
		players.add(null);
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		this.pointsToWin = pointsToWin;
		this.ball = ball;
	}
	
	public void moveBall()
	{
		ball.move();
	}
	
	public int assignPlayer(String name)
	{
		for(int i = 1; i <=4 ; i++)
		{
			if(players.get(i).isEmpty())
			{
				players.add(i, new Player(new Bat(new Point2D.Float(0, 0), 2, 1,new Point2D.Float(1, 0)), 0, name));
				return i;
			}
		}
		return 0;
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
		return players.get(PlayerID).getBatPos();		
	}
	
	public float getPlayerXBatLength(int PlayerID)
	{
		return players.get(PlayerID).getBatLength();	
	}
	
	public int getPlayerXPoints(int PlayerID)
	{
		return players.get(PlayerID).getPoints();
	}
	
	public String getPlayerXName(int PlayerID)
	{
		return players.get(PlayerID).getName();
	}
	
	public Point2D getBallPos()
	{
		return ball.getPosition();
	}
	
	public void movePlayerXPositive(int PlayerID)
	{
		players.get(PlayerID).moveBatPositve();
	}
	
	public void movePlayerXNegative(int PlayerID)
	{
		players.get(PlayerID).moveBatNegative();
	}
}
