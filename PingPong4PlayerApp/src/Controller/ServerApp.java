/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Server.Ball;
import Server.GameSession;
import Server.Player;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ServerApp {

	private GameSession gameSession;
	public ServerApp()
	{
		createGame();
	}
	
	private void createGame()
	{
		gameSession = new GameSession(
				Player.emptyPlayer(), 
				Player.emptyPlayer(), 
				Player.emptyPlayer(), 
				Player.emptyPlayer(), 
				3, 
				Ball.emptyBall());
	}
	
}
