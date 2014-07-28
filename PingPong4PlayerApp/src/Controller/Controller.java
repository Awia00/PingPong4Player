/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 * Class description:
 *
 * @version 0.1 - changed 28-07-2014
 * @authorNewVersion  Anders Wind - awis@itu.dk
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class Controller {

	private Controller instance = null;
	
	private Controller()
	{
		
	}
	
	public Interface_RetrieveServerInfo getServerRetrieve()
	{
		if(instance == null) instance = new Controller();
		return (Interface_RetrieveServerInfo)instance;
	}
	
	public Interface_RetrieveServerInfo getServerSend()
	{
		if(instance == null) instance = new Controller();
		return (Interface_RetrieveServerInfo) instance;
	}
}
