import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;


public class Player extends JComponent{
	private Rectangle paddle = new Rectangle(0,0,100,100);
	
	private static int startY = 710;
	private static int playerNum = 1;
	private int player;
	
	public Player() {
		setLocation(14, startY+=35);
		setSize(30,30);
		player = playerNum++;
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.fill(paddle);
	}
	
	public int getPlayerNum() {
		return player;
	}
	

	
}
