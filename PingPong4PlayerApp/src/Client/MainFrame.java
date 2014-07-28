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
	}
	
	private void rdyUp()
	{
		pack();
		setVisible(true);
		repaint();
	}

	
	
	
	
	
	// key listener
	
	@Override
	public void keyTyped(KeyEvent e)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
