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
public class DaRules extends JPanel
{
	
	private Rectangle.Double rec = new Rectangle.Double(0,23,300,300);
	public DaRules (JFrame parent, CardLayout cl, JPanel containedIn, String sendToMenu)
	{
		Color textColor = new Color(74, 189, 105);
		
		

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
		label0.setLocation(350-10, 250);
		label0.setSize(600, 100);
		label0.setFont(new Font("DIALOG", 0, 70));
		label0.setForeground(textColor);

		
		JLabel label1 = new JLabel("Roll all 3 dice");
		label1.setLocation(320-10, 350);
		label1.setSize(600, 50);
		label1.setFont(new Font("DIALOG", 0, 50));
		label1.setForeground(textColor);
		
		
		JLabel label2 = new JLabel("If you get one of each, you move as many as the dice says");
		label2.setLocation(75, 400);
		label2.setSize(900, 50);
		label2.setFont(new Font("DIALOG", 0, 30));
		label2.setForeground(textColor);
		
		JLabel label3 = new JLabel("If you get all eels and a number, disregard the number , move toward the nearest eels and move down it");
		label3.setLocation(15, 450);
		label3.setSize(900, 50);
		label3.setFont(new Font("DIALOG", 0, 19));
		label3.setForeground(textColor);
		
		JLabel label4 = new JLabel("If you get escalators, do the same as you would with the eels");
		label4.setLocation(60, 500);
		label4.setSize(900, 50);
		label4.setFont(new Font("DIALOG", 0, 30));
		label4.setForeground(textColor);
		
		JButton returnButton = new JButton("Return");
		returnButton.setSize(450,100);
		returnButton.setFont(new Font("DIALOG", 0, 75));
		returnButton.setBorderPainted(false);
		returnButton.setLocation(240, 600);
		returnButton.setOpaque(false);
		returnButton.setForeground(textColor);
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
		add(label4);
		add(returnButton);
		add(BackgroundDarkner);
		add(board);
	}
	

	
	
}
