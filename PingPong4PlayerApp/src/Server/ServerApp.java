/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import java.awt.geom.Point2D;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ServerApp {

	private static ServerApp instance = null;
	
	protected GameSession gameSession;
	private boolean isGameRunning;
	private Timer timer;
	
	private ServerApp()
	{
		
	}
	
	public void initiate()
	{
		createGame();
		// put wait for players part here.
	}

	public GameSession getGameSession()
	{
		return gameSession;
	}
	
	private void createGame()
	{
		gameSession = new GameSession(
				Player.emptyPlayer(), 
				Player.emptyPlayer(), 
				Player.emptyPlayer(), 
				Player.emptyPlayer(), 
				3, 
				new Ball(new Point2D.Double(400,400), 1.5f, new Point2D.Double(1,1)),
				0,0,800,800);
	}
	
	public void runGame()
	{
		timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run()
			{
				gameSession.moveBall();
			}
		};
		timer.schedule(task, 15,15);
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
	
	public static ServerApp getServerApp()
	{
		if(instance == null) instance = new ServerApp();
		return instance;
	}
	
}
