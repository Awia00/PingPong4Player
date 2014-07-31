/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import Controller.Interface_Server;
import Server.ServerApp;
import java.awt.geom.Point2D;

/**
 * Class description:
 *
 * @buildDate 31-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class DummyConnection implements Interface_Server{

	private ServerApp serverconnection;
	
	public DummyConnection()
	{
		serverconnection = ServerApp.getServerApp();
	}
	
	@Override
	public Point2D getPlayerXPosition(int playerID)
	{
		return serverconnection.getGameSession().getPlayerXBatPos(playerID);
	}

	@Override
	public int getPlayerXScore(int playerID)
	{
		return serverconnection.getGameSession().getPlayerXPoints(playerID);
	}

	@Override
	public Point2D getBallPosition()
	{
		return serverconnection.getGameSession().getBallPos();
	}

	@Override
	public String getWhichPlayersTurn()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String getMessage()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void movePlayerPositive(int playerID)
	{
		serverconnection.getGameSession().movePlayerXPositive(playerID);
	}

	@Override
	public void movePlayerNegative(int playerID)
	{
		serverconnection.getGameSession().movePlayerXNegative(playerID);
	}

	@Override
	public void sendStartRoundSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void sendStartGameSignal()
	{
		serverconnection.runGame();
	}

	@Override
	public void sendEndGameSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void startGame()
	{
		serverconnection.runGame();
	}

	@Override
	public void setUp()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int assignPlayer(String name)
	{
		return serverconnection.getGameSession().assignPlayer(name);
	}

}
