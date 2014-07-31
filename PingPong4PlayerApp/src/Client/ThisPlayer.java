/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

/**
 * Class description:
 *
 * @buildDate 29-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ThisPlayer {
	
	private String Name;
	private int ID;
	private int score;

	public ThisPlayer(String Name, int ID, int score)
	{
		this.Name = Name;
		this.ID = ID;
		this.score = score;
	}

	public int getID()
	{
		return ID;
	}

}
