/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import Client.MainFrame;
import Controller.Interface_Server;
import java.awt.geom.Point2D;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ClientApp {
	
	private static ClientApp instance = null;
	private Interface_Server serverConnection;
	private ThisPlayer thePlayer;

	private ClientApp()
	{
		
	}
	
	public void initiate()
	{
		new MainFrame();
		serverConnection = new DummyConnection();
		int id = serverConnection.assignPlayer("Anders");
		if(id != 0)thePlayer = new ThisPlayer("Anders", id, 0);
		startGame();
	}

	public Interface_Server getServerConnection()
	{
		return serverConnection;
	}
	
	public void movePlayerPositive()
	{
		serverConnection.movePlayerPositive(thePlayer.getID());
	}
	
	public void movePlayerNegative()
	{
		serverConnection.movePlayerNegative(thePlayer.getID());
	}
	
	public Point2D getPlayerXPosition(int playerID)
	{
		return serverConnection.getPlayerXPosition(playerID);
	}
	
	public Point2D getPlayerXBatLength(int playerID)
	{
		return serverConnection.getPlayerXBatLength(playerID);
	}
	
	public Point2D getBallPosition()
	{
		return serverConnection.getBallPosition();
	}
	
	public void startGame()
	{
		serverConnection.startGame();
	}

	public static ClientApp getClientApp()
	{
		if(instance == null) instance = new ClientApp();
		return instance;
	}
	
	
}
