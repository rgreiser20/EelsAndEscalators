import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author Ryan Greiser & Logan Davison
 * 
 */
public class GameWindow extends JPanel{
	
	public GameWindow() {
		this.setSize(400, 300);
		this.setLayout(null);
		JLabel label1 = new JLabel("testing in a seperate class");
		label1.setLocation(250, 180);
		label1.setSize(140,30);
		this.add(label1);
		JLabel board = new JLabel();
		board.setBounds(0, 0, 900, 900);
		
		try {
			BufferedImage img = ImageIO.read(new File("board.jpg"));
			board.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton button1 = new JButton("Click to head home");
		button1.setLocation(40, 10);
		button1.setSize(120,30);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	cl.show(containedIn, sendTo);
		
			}
			
		});
		label1.setBackground(new Color(0,0,0));
		label1.setOpaque(true);
		label1.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = label1.getX() + e.getX();
				int y = label1.getY() + e.getY();
				label1.setLocation(x, y);
				
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		Player p1 = new Player();
		p1.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = p1.getX() + e.getX();
				int y = p1.getY() + e.getY();
				p1.setLocation(x, y);
				
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.add(p1);
		this.add(button1);
		this.add(board);
	}

}
