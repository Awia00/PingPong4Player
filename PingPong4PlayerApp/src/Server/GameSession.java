/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

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
	
	
}
