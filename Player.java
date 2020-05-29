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
	
	private static int startX = 14;
	private static int startY = 754;
	
	public Player() {
		setLocation(250, 180);
		setSize(30,30);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.fill(paddle);
	}
	
	public int getX() {
		return startX;
	}
	
	public void incX() {
		startX += 35;
	}
	
	public int getY() {
		return startY;
	}
	
}
