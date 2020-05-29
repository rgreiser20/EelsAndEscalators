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
import javax.swing.SwingConstants;

/**
 * 
 * @author Ryan Greiser & Logan Davison
 * 
 * 
 */
public class MenuWindow extends JPanel{
	
	public MenuWindow(JFrame parent, CardLayout cl, JPanel containedIn, String sendToGame, String sendToRules, GameWindow game) {
		this.setSize(400, 300);
		this.setLayout(null);
		//The spacing inbetween the buttons
		int spacer = 10;
		Color textColor = new Color(74, 189, 105);
		Color btnColor = new Color(74, 177, 189);
		
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
		
		JButton playBtn = new JButton("Start Game");
		playBtn.setSize(450,100);
		playBtn.setFont(new Font("DIALOG", 0, 75));
		playBtn.setBackground(btnColor);
		playBtn.setBorderPainted(false);
		playBtn.setLocation(parent.getWidth()/2 - playBtn.getWidth()/2, parent.getHeight()/2 - playBtn.getHeight()/2);
		playBtn.setOpaque(false);
		playBtn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(containedIn, sendToGame);
				game.reset();
				
			}
			
		});
		
		JButton rulesBtn = new JButton("Rules");
		rulesBtn.setSize(450,100);
		rulesBtn.setFont(new Font("DIALOG", 0, 75));
		rulesBtn.setBackground(btnColor);
	
		
		rulesBtn.setBorderPainted(false);
		rulesBtn.setOpaque(false);
		rulesBtn.setLocation(playBtn.getX(), playBtn.getY()+playBtn.getHeight() + spacer);
		rulesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				cl.show(containedIn, sendToRules);
			}
		});
		
		JButton decrBtn = new JButton("-");
		decrBtn.setSize(450/3,100);
		decrBtn.setFont(new Font("DIALOG", 0, 75));
		decrBtn.setBackground(btnColor);
		decrBtn.setBorderPainted(false);
		decrBtn.setLocation(playBtn.getX(), rulesBtn.getY()+rulesBtn.getHeight() + spacer);
		decrBtn.setOpaque(false);
		
		JButton incrBtn = new JButton("+");
		incrBtn.setSize(450/3,100);
		incrBtn.setFont(new Font("DIALOG", 0, 75));
		incrBtn.setBackground(btnColor);
		incrBtn.setBorderPainted(false);
		incrBtn.setLocation(playBtn.getX() + playBtn.getWidth() - incrBtn.getWidth(), rulesBtn.getY()+rulesBtn.getHeight() + spacer);
		incrBtn.setOpaque(false);
		
		JLabel pCount = new JLabel("" + MasterFrame.getCount());
		pCount.setSize(450/3, 100);
		pCount.setLocation(decrBtn.getX()+decrBtn.getWidth(), decrBtn.getY());
		pCount.setFont(new Font("DIALOG", 0, 75));
		//pCount.setBackground(btnColor);
		pCount.setOpaque(false);
		pCount.setHorizontalAlignment(SwingConstants.CENTER);
		pCount.setForeground(textColor);
		
		decrBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(MasterFrame.getCount() > 1) {
					MasterFrame.changeCount("-");
					pCount.setText("" + MasterFrame.getCount());
				}
			}
			
		});
		
		incrBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(MasterFrame.getCount() < 4) {
					MasterFrame.changeCount("+");
					pCount.setText("" + MasterFrame.getCount());
				}
			}
			
		});
		
		incrBtn.setForeground(textColor);
		decrBtn.setForeground(textColor);
		rulesBtn.setForeground(textColor);
		playBtn.setForeground(textColor);
		
		this.add(pCount);
		this.add(incrBtn);
		this.add(decrBtn);
		this.add(rulesBtn);
		this.add(playBtn);
		this.add(BackgroundDarkner);
		add(board);
	}	

}
