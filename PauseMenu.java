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
public class PauseMenu extends JPanel
{
    public PauseMenu(JFrame parent, CardLayout cl, JPanel containedIn, String sendToMenu, String sendToGame)
    {
        Color textColor = new Color(74, 189, 105);
        Color textColor2 = new Color(224, 9, 9);
        Color textColor3 = new Color(3, 205, 255);
        
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
        
        JLabel named = new JLabel("Eels and Escalators");
        named.setLocation(230, 10);
        named.setSize(900, 50);
        named.setFont(new Font("DIALOG", 0, 50));
        named.setForeground(textColor);
        
        JLabel pauseLabel = new JLabel("Paused");
    	pauseLabel.setLocation(200-100+10, 100);
    	pauseLabel.setSize(900, 200);
    	pauseLabel.setFont(new Font("DIALOG", 0, 200));
    	pauseLabel.setForeground(textColor);

    	JButton returnMenuButton = new JButton("Return to Menu");
    	returnMenuButton.setSize(600,100);
    	returnMenuButton.setFont(new Font("DIALOG", 0, 75));
    	returnMenuButton.setBorderPainted(false);
    	returnMenuButton.setLocation(140, 600);
    	returnMenuButton.setOpaque(false);
    	returnMenuButton.setForeground(textColor2);
    	returnMenuButton.setBackground(new Color(74, 177, 189));
    	returnMenuButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(containedIn, sendToMenu);
				
			}
			
			
		});

    	
    	JButton returnGameButton = new JButton("Return to Game");
    	returnGameButton.setSize(600,100);
    	returnGameButton.setFont(new Font("DIALOG", 0, 75));
    	returnGameButton.setBorderPainted(false);
    	returnGameButton.setLocation(140, 400);
    	returnGameButton.setOpaque(false);
    	returnGameButton.setForeground(textColor3);
    	returnGameButton.setBackground(new Color(74, 177, 189));
    	returnGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(containedIn, sendToGame);
				
			}
    		
    		
    		
    	});
    	
    	add(named);
    	add(returnGameButton);
		add(returnMenuButton);
    	add(pauseLabel);
		add(BackgroundDarkner);
		add(board);

    }

}