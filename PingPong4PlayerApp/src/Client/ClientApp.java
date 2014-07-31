/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import Client.MainFrame;
import Controller.Interface_Server;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ClientApp {
	
	private static ClientApp instance;
	private Interface_Server serverConnection;

	private ClientApp()
	{
		new MainFrame();
		serverConnection = new DummyConnection();
	}
	
	

	public static ClientApp getClientApp()
	{
		if(instance == null) instance = new ClientApp();
		return instance;
	}
	
	
}
