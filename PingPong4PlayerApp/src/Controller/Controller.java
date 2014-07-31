/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.awt.geom.Point2D;

/**
 * Class description:
 *
 * @version 0.1 - changed 28-07-2014
 * @authorNewVersion  Anders Wind - awis@itu.dk
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class Controller implements Interface_Server{

	private static Controller instance = null;
	
	private Controller()
	{
		
	}
	
	public static Interface_RetrieveServerInfo getServerRetrieve()
	{
		if(instance == null) instance = new Controller();
		return (Interface_RetrieveServerInfo)instance;
	}
	
	public static Interface_RetrieveServerInfo getServerSend()
	{
		if(instance == null) instance = new Controller();
		return (Interface_RetrieveServerInfo) instance;
	}
	
	public static Interface_ServerSettings getServerSettings()
	{
		if(instance == null) instance = new Controller();
		return (Interface_ServerSettings) instance;
	}
	
	//
	// interface specific methods.
	//
	
	// retrieve

	@Override
	public Point2D getPlayerXPosition(int playerID)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int getPlayerXScore(int playerID)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Point2D getBallPosition()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
	
	// send

	@Override
	public void sendStartRoundSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void sendStartGameSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void sendEndGameSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	// settings

	@Override
	public void startGame()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setUp()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int assignPlayer(String name)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void movePlayerPositive(int playerID)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void movePlayerNegative(int playerID)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
