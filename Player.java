import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;


public class Player extends JComponent{
	//private Rectangle paddle = new Rectangle(0,0,100,100);
	private Ellipse2D.Double circle = new Ellipse2D.Double(12.5,0,25,25);
	private Ellipse2D.Double eye1 = new Ellipse2D.Double(17,5,5,5);
	private Ellipse2D.Double eye2 = new Ellipse2D.Double(25,5,5,5);
	private Rectangle.Double mouth = new Rectangle.Double(20, 15, 15, 2);
			
			
	private static int startX = 14;
	private static int startY = 754;
	
	
	public Player() {
		setLocation(250, 180);
		setSize(40,40);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.fill(circle);
		g2.setColor(Color.BLACK);
		g2.fill(eye1);
		g2.fill(eye2);
		g2.fill(mouth);
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
