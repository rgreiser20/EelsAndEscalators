import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Ryan Greiser & Logan Davison
 * 
 */
public class MenuWindow extends JPanel{
	
	public MenuWindow(JFrame parent, CardLayout cl, JPanel containedIn, String sendToGame) {
		this.setSize(400, 300);
		this.setLayout(null);
		//The spacing inbetween the buttons
		int spacer = 10;
		
		JLabel board = new JLabel();
		board.setBounds(0, 0, 900, 900);
		
		try {
			BufferedImage img = ImageIO.read(new File("board.jpg"));
			board.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel BackgroundDarkner = new JLabel("testing in a seperate class");
		BackgroundDarkner.setBounds(0, 0, 900, 900);
		BackgroundDarkner.setBackground(new Color(0,0,0,200));
		BackgroundDarkner.setOpaque(true);
		
		JButton playBtn = new JButton("Start Game");
		playBtn.setSize(450,100);
		playBtn.setFont(new Font("DIALOG", 0, 75));
		playBtn.setBackground(new Color(0,0,0,127));
		playBtn.setBorderPainted(false);
		playBtn.setLocation(parent.getWidth()/2 - playBtn.getWidth()/2, parent.getHeight()/2 - playBtn.getHeight()/2);
		playBtn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				//cl.show(containedIn, sendToGame);
				if(playBtn.getForeground().equals(Color.red))
					playBtn.setForeground(Color.blue);
				else
					playBtn.setForeground(Color.red);
			}
			
		});
		
		JButton rulesBtn = new JButton("Rules");
		rulesBtn.setSize(450,100);
		rulesBtn.setFont(new Font("DIALOG", 0, 75));
		rulesBtn.setBackground(new Color(0,0,0,127));
		rulesBtn.setBorderPainted(false);
		rulesBtn.setLocation(playBtn.getX(), playBtn.getY()+playBtn.getHeight() + spacer);
		rulesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(rulesBtn.getForeground().equals(Color.red))
					rulesBtn.setForeground(Color.blue);
				else
					rulesBtn.setForeground(Color.red);
			}
		});
		
		this.add(rulesBtn);
		this.add(playBtn);
		this.add(BackgroundDarkner);
		add(board);
	}	

}
