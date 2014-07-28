/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
public class MainFrame extends JFrame {

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
}
