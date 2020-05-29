/**
 * 
 * @author Ryan Greiser & Logan Davison 
 *
 */
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class PauseRules extends JPanel
{
	
	private Rectangle.Double rec = new Rectangle.Double(0,23,300,300);
	public PauseRules(JFrame parent, CardLayout cl, JPanel containedIn, String sendToMenu)
	{
		Color textColor = new Color(74, 189, 105);
		Color textColor2 = new Color(224, 9, 9);
		

		this.setLayout(null);
		JLabel board = new JLabel();
		board.setBounds(0, 0, 900, 900);  
		
		try {
			BufferedImage img = ImageIO.read(new File("board.jpg"));
			board.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel BackgroundDarkner = new JLabel("");
		BackgroundDarkner.setBounds(0, 0, 900, 900);
		BackgroundDarkner.setBackground(new Color(50,50,50,200));
		BackgroundDarkner.setOpaque(true);
		
		
		
		//* roll all 3 dice
		//* if you get one of each, you move as many as the dice says
		//* if you get all eels and a number, disregard the number , move toward the nearest eels and move down it
		//* if you get escalators, do the same as you would with the eels
		JLabel label0 = new JLabel("RULES: ");
		label0.setLocation(0, 250);
		label0.setSize(600, 100);
		label0.setFont(new Font("DIALOG", 0, 70));
		label0.setForeground(textColor);

		
		JLabel label1 = new JLabel("-Roll all 3 dice");
		label1.setLocation(0, 350);
		label1.setSize(600, 50);
		label1.setFont(new Font("DIALOG", 0, 19));
		label1.setForeground(textColor);
		
		
		JLabel label2 = new JLabel("-If you get an eel and escalator (esc) , you move as many as the number dice says");
		label2.setLocation(0, 400);
		label2.setSize(900, 50);
		label2.setFont(new Font("DIALOG", 0, 19));
		label2.setForeground(textColor);
		
		JLabel label3 = new JLabel("-If you get all eels and a number, disregard the number , move toward the nearest eels and move down it");
		label3.setLocation(0, 450);
		label3.setSize(900, 50);
		label3.setFont(new Font("DIALOG", 0, 19));
		label3.setForeground(textColor);
		
		JLabel label32 = new JLabel(" towards start");
		label32.setLocation(0, 500);
		label32.setSize(900, 50);
		label32.setFont(new Font("DIALOG", 0, 19));
		label32.setForeground(textColor);
		
		
		JLabel label4 = new JLabel("-If you get escalators (esc), do the same as you would with the eels but head to an escalator and move upwards");
		label4.setLocation(0, 550);
		label4.setSize(900, 50);
		label4.setFont(new Font("DIALOG", 0, 19));
		label4.setForeground(textColor);
		
		JLabel label5 = new JLabel("-Drag your player the number of spaces you got when it is your turn");
		label5.setLocation(0, 600);
		label5.setSize(900, 50);
		label5.setFont(new Font("DIALOG", 0, 19));
		label5.setForeground(textColor);
		
		
		JLabel label6 = new JLabel("-You can only move when it is your turn, press next turn button  to move to next player");
		label6.setLocation(0, 650);
		label6.setSize(900, 50);
		label6.setFont(new Font("DIALOG", 0, 19));
		label6.setForeground(textColor);
		
		JLabel label7 = new JLabel("-Player 1 is blue, Player 2 is red, Player 3 Green, and Player 4 yellow");
		label7.setLocation(0, 700);
		label7.setSize(900, 50);
		label7.setFont(new Font("DIALOG", 0, 19));
		label7.setForeground(textColor);
		
		
		
		
		
		
		JButton returnButton = new JButton("Return");
		returnButton.setSize(420,100);
		returnButton.setFont(new Font("DIALOG", 0, 75));
		returnButton.setBorderPainted(false);
		returnButton.setLocation(240, 70);
		returnButton.setOpaque(false);
		returnButton.setForeground(textColor2);
		returnButton.setBackground(new Color(74, 177, 189));
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(containedIn, sendToMenu);
				
			}
			
			
		});
		
		
		add(label0);
		add(label1);
		add(label2);
		add(label3);
		add(label32);
		add(label4);
		add(label5);
		add(label6);
		add(label7);
		add(returnButton);
		add(BackgroundDarkner);
		add(board);
	}
	

	
	
}