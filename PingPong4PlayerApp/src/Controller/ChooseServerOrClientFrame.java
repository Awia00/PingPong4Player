/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.AppController;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 * Class description:
 *
 * @buildDate 28-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class ChooseServerOrClientFrame extends JFrame {
	
	private Container mainContainer, topContainer, botContainer;
	
	private JButton serverButton, clientButton; 
	private JLabel chooseMessage;
	
	public ChooseServerOrClientFrame() throws HeadlessException
	{
		setFrameSettings();
		
		MigLayout migMainLayout = new MigLayout();
        mainContainer = new JPanel(migMainLayout);
        
        this.add(mainContainer);
		
		topContainer = new JPanel();
		topContainer.setMinimumSize(new Dimension(400,50));
       
        botContainer = new JPanel();
		botContainer.setMinimumSize(new Dimension(400,50));
        botContainer.setLayout(new MigLayout("", "100[center]100", "[center]"));
		
		mainContainer.add(topContainer, "align center, wrap");
        mainContainer.add(botContainer, "align center, wrap");
		
		
		chooseMessage = new JLabel("Choose what you are");
		topContainer.add(chooseMessage);
		
		serverButton = new JButton("Server");
		serverButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				AppController.startAsServer();
			}
		});
		clientButton = new JButton("Client");
		clientButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				AppController.startAsClient();
			}
		});
		
		botContainer.add(clientButton, "cell 0 0");
        botContainer.add(serverButton, "cell 1 0");
		
		rdyUp();
	}
	
	private void setFrameSettings()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(400,100));
		setLocationRelativeTo(null);
	}
	
	private void rdyUp()
	{
		pack();
		setVisible(true);
		repaint();
	}
}
