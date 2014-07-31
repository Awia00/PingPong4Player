/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 *
 * @author Anders Wind - awis@itu.dk
 */
public interface Interface_SendInfoToServer {
	
	public void movePlayerPositive(int playerID); // up or left
	public void movePlayerNegative(int playerID); // down or right
	
	/*
	Signal specific methods
	*/
	public void sendStartRoundSignal(); // enter
	public void sendStartGameSignal(); // enter before game has begun.
	public void sendEndGameSignal(); // esc.
}
