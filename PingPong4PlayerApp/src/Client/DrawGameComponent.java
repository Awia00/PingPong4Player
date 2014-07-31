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
import java.awt.geom.Point2D;
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
				g2.setColor(Color.white);
				g2.fillRect(0, 0, 800, 800);
				drawBall(g2);
				drawBat(g2);
			}
		};
		thread.run();
	}

	private void drawBall(Graphics g)
	{
		g.setColor(Color.black);
		Point2D ballPos = ClientApp.getClientApp().getBallPosition();
		g.fillRect((int)ballPos.getX()-2, (int)ballPos.getY()-2, 4, 4);
	}

	private void drawBat(Graphics g)
	{
		g.setColor(Color.black);
		for(int i = 1 ; i<=4 ; i++)
		{
			Point2D batPos = ClientApp.getClientApp().getPlayerXPosition(i);
			Point2D batLength = ClientApp.getClientApp().getPlayerXBatLength(i);
			g.fillRect(
					(int)(batPos.getX()-batLength.getX()/2),
					(int)(batPos.getY()-batLength.getY()/2),
					(int)batLength.getX(),
					(int)batLength.getY());
		}
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
