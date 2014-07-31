/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import Controller.Interface_SendInfoToServer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Class description:
 *
 * @version 0.1 - changed 28-07-2014
 * @authorNewVersion  Anders Wind - awis@itu.dk
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class MainFrame extends JFrame implements KeyListener{

	private Interface_SendInfoToServer serverSend;
	private JComponent drawGameComponent;
	protected Timer timer;
	TimerTask task;
	
	public MainFrame() throws HeadlessException
	{
		setFrameSettings();
		drawGameComponent = new DrawGameComponent();
		add(drawGameComponent);
		rdyUp();
	}
	
	private void setFrameSettings()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(800,800));
		addKeyListener(this);
		task = new TimerTask() {

			@Override
			public void run()
			{
				rdyUp();
			}
		};
		timer = new Timer();
		timer.schedule(task, 15, 15);
	}
	
	protected void rdyUp()
	{
		pack();
		setVisible(true);
		repaint();
		System.out.println("hej");
	}

	
	
	
	
	
	// key listener
	
	@Override
	public void keyTyped(KeyEvent e)
	{
		//
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// 37 venstre
		// 39 højre
		// 38 op
		// 40 ned
		if(e.getKeyCode() == 37 || e.getKeyCode() == 38) // positive
			ClientApp.getClientApp().movePlayerPositive();
		if(e.getKeyCode() == 39 || e.getKeyCode() == 40) // negative
			ClientApp.getClientApp().movePlayerNegative();
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}
}
