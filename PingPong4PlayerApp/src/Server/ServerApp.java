/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import Server.Ball;
import Server.GameSession;
import Server.Player;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ServerApp {

	protected GameSession gameSession;
	private boolean isGameRunning;
	private Timer timer;
	
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
	
	private void runGame()
	{
		timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run()
			{
				gameSession.moveBall();
			}
		};
		timer.schedule(task, 100,100);
	}
	
	
	private void stopGame()
	{
		timer.purge();
		timer.cancel();
		timer = null;
	}
	
	/**
	 * 
	 * @param playerID 
	 * @param direction negative for down/right positive for up/left
	 */
	private void movePlayer(int playerID, int direction)
	{
		
	}
	
}
