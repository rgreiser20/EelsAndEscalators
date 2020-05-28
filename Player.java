import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;


public class Player extends JComponent implements MouseListener{
	private Rectangle paddle = new Rectangle(0,0,100,100);
	private static int startX = 14;
	public Player() {
		setLocation(250, 180);
		setSize(140,30);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.fill(paddle);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("here we go");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		int x = getX() + e.getX();
//		int y = getY() + e.getY();
//		setLocation(x, y);
//
//		
//	}
//
//	@Override
//	public void mouseMoved(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
}
