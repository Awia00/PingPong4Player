/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * Class description:
 *
 * @version 0.1 - changed 28-07-2014
 * @authorNewVersion  Anders Wind - awis@itu.dk
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class DrawGameComponent extends JComponent {

	public DrawGameComponent()
	{
		// component  settings
		setMinimumSize(new Dimension(800,800));
	}
	
	@Override
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 800);
	}
}
