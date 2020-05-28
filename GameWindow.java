import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
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
		
		JButton pauseBtn = new JButton("||");
		Color textColor = new Color(74, 189, 105);
		Color btnColor = new Color(74, 177, 189);
		pauseBtn.setSize(60,50);
		pauseBtn.setFont(new Font("DIALOG", 1, 35));
		pauseBtn.setForeground(textColor);
		pauseBtn.setBorderPainted(false);
		pauseBtn.setBackground(btnColor);
		pauseBtn.setLocation(15,15);
		pauseBtn.setOpaque(false);
		pauseBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	cl.show(containedIn, sendTo);
		
			}
			
		});
		
		
		this.add(pauseBtn);

	}
	
	public void makePlayers() {
		System.out.println("Here");
		for(int i = 0; i<MasterFrame.getCount(); i++) {
			Player p1 = new Player();
			p1.addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseDragged(MouseEvent e) {
					int x = p1.getX() + e.getX();
					int y = p1.getY() + e.getY();
					System.out.println("X: " + x + " Y: " + y);
					p1.setLocation(x, y);	
				}
				public void mouseMoved(MouseEvent e) {
				}
				
			});
			add(p1);
		}
		JLabel board = new JLabel();
		board.setBounds(0, 0, 900, 900);
		
		try {
			BufferedImage img = ImageIO.read(new File("board.jpg"));
			board.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.add(board);

		
	}

}
