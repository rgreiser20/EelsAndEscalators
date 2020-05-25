import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Ryan Greiser & Logan Davison
 * 
 * @How_to_play:
	* roll all 3 dice
	* if you get one of each, you move as many as the dice says
	* if you get all eels and a number, disregard the number , move toward the nearest eels and move down it
	* if you get escalators, do the same as you would with the eels
 */
public class MasterFrame extends JFrame {
	private static int numPlayers;
	
	public MasterFrame() {
		numPlayers = 1;
		setBounds(10,10,916,939);
		setTitle("Eels and Escalators");
		setResizable(false);
		
		JPanel overall = new JPanel();
		
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
		
		MenuWindow menu = new MenuWindow(this, cl, overall, "game");
		GameWindow game = new GameWindow();
		
		overall.add(game, "game");
		overall.add(menu, "menu");
		
		cl.show(overall, "menu");
		add(overall);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MasterFrame();

	}
	
	public static int getCount() {
		return numPlayers;
	}
	
	public static void changeCount(String c)
	{
		if(c.equals("+"))
			numPlayers++;
		if(c.equals("-"))
			numPlayers--;
	}
}
