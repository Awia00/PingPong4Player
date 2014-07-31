/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class description:
 *
 * @version 0.1 - changed 28-07-2014
 * @authorNewVersion Anders Wind - awis@itu.dk
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class DrawGameComponent extends JComponent {

	public DrawGameComponent()
	{
		// component  settings
		setMinimumSize(new Dimension(800, 800));
	}

	@Override
	public void paint(Graphics g)
	{
		final Graphics2D g2 = (Graphics2D) g;
		Thread thread = new Thread() {
			@Override
			@SuppressWarnings("empty-statement")
			public void run()
			{
				g2.setColor(Color.black);
				g2.fillRect(0, 0, 800, 800);
				drawBall(g2);
			}
		};
		thread.run();
	}

	private void drawBall(Graphics g)
	{

	}

	private void drawBat(Graphics g)
	{

	}

	private void drawEnvironment(Graphics g)
	{

	}

	private void drawPlayerName(Graphics g)
	{

	}

	private void drawScore(Graphics g)
	{

	}
}
