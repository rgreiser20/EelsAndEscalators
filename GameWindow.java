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
import javax.swing.SwingConstants;
import javax.swing.Timer;
/**
 * 
 * @author Ryan Greiser & Logan Davison
 *  
 */
public class GameWindow extends JPanel{
	
	
	private int turn;
	private FancyText turnLbl;
	private FancyText diceNumLbl;
	private FancyText eelDice1;
	private FancyText eelDice2;
	private int row1;
	private JButton incTurn;
	private Player p1;
	private Player p2;
	private Player p3;
	private Player p4;

	
	public GameWindow(CardLayout cl, JPanel containedIn, String sendTo) {
		row1 = 2;
		turn = 0;
		turnLbl = new FancyText(150, row1, 125, 50, "Turn: ", 35);
		diceNumLbl = new FancyText(285, row1, 190, 50, ("Num Roll: " + (int)(Math.random()*6 + 1)), 35);
		eelDice1 = new FancyText(485, row1, 180, 50, "Dice 1: ", 35);
		eelDice2 = new FancyText(675, row1, 180, 50, "Dice 2: ", 35);
	
		p1 = new Player();
		p1.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(turn == p1.getPlayerNum()) {
					int x = p1.getX() + e.getX() - 15;
					int y = p1.getY() + e.getY() - 15;
					p1.setLocation(x, y);	
				}
			}
			public void mouseMoved(MouseEvent e) {
			
			}
		});
		add(p1);
		
		p2 = new Player();
		p2.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(turn == p2.getPlayerNum()) {
					int x = p2.getX() + e.getX() - 15;
					int y = p2.getY() + e.getY() - 15;
					p2.setLocation(x, y);	
				}
			}
			public void mouseMoved(MouseEvent e) {
			
			}
		});
		add(p2);
		
		p3 = new Player();
		p3.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(turn == p3.getPlayerNum()) {
					int x = p3.getX() + e.getX() - 15;
					int y = p3.getY() + e.getY() - 15;
					p3.setLocation(x, y);	
				}
			}
			public void mouseMoved(MouseEvent e) {
			
			}
		});
		add(p3);
		
		p4 = new Player();
		p4.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(turn == p4.getPlayerNum()) {
					int x = p4.getX() + e.getX() - 15;
					int y = p4.getY() + e.getY() - 15;
					p4.setLocation(x, y);	
				}
			}
			public void mouseMoved(MouseEvent e) {
			
			}
		});
		add(p4);
		
		this.setSize(400, 300);
		this.setLayout(null);
		
		JButton pauseBtn = new JButton("||");
		Color textColor = new Color(74, 189, 105);
		Color btnColor = new Color(74, 177, 189);
		pauseBtn.setSize(55,50);
		pauseBtn.setFont(new Font("DIALOG", 1, 35));
		pauseBtn.setForeground(textColor);
		pauseBtn.setBorderPainted(false);
		pauseBtn.setBackground(btnColor);
		pauseBtn.setLocation(15,15);
		pauseBtn.setOpaque(false);
		pauseBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(containedIn, sendTo);
		
			}
			
		});
		
		EelDice eelD1 = new EelDice();
		EelDice eelD2 = new EelDice();

		//FancyText diceRoll = new FancyText(100,15,);
		incTurn = new JButton("<html>Start<br />Game</html>");

		incTurn.setBounds(75, 15, 75, 50);
		incTurn.setFont(new Font("DIALOG", 0, 18));
		incTurn.setForeground(textColor);
		incTurn.setHorizontalAlignment(SwingConstants.CENTER);
		incTurn.setBorderPainted(false);
		incTurn.setBackground(btnColor);
		incTurn.setOpaque(false);
		incTurn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(turn == 0)
					incTurn.setText("<html>Next<br />Turn</html>");
				turn = (turn%MasterFrame.getCount()) + 1;
				turnLbl.setText("Turn: " + turn);
				diceNumLbl.setText("Num Roll: " + (int)(Math.random()*6 + 1));
				if(eelD1.roll())
					eelDice1.setText("Dice 1: Esc");
				else
					eelDice1.setText("Dice 1: Eel");
				if(eelD2.roll())
					eelDice2.setText("Dice 2: Esc");
				else
					eelDice2.setText("Dice 2: Eel");
			}
			
		});
		add(eelDice1);
		add(eelDice2);
		add(diceNumLbl);
		add(turnLbl);
		add(incTurn);
		this.add(pauseBtn);
		JLabel board = new JLabel();
		board.setBounds(0, 0, 900, 900);
		
		try {
			BufferedImage img = ImageIO.read(new File("board.jpg"));
			board.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			
		}
		this.add(board);
	}
	

	
//	public void makePlayers() {
//		for(int i = 1; i<MasterFrame.getCount() + 1; i++) {
//			Player p1 = new Player();
//			
//			p1.addMouseMotionListener(new MouseMotionListener() {
//				
//				@Override
//				public void mouseDragged(MouseEvent e) {
//					if(turn == p1.getPlayerNum()) {
//						int x = p1.getX() + e.getX() - 15;
//						int y = p1.getY() + e.getY() - 15;
//						p1.setLocation(x, y);	
//					}
//				}
//				public void mouseMoved(MouseEvent e) {
//				
//				}
//				
//			});
//			add(p1);
//		}
//		JLabel board = new JLabel();
//		board.setBounds(0, 0, 900, 900);
//		
//		try {
//			BufferedImage img = ImageIO.read(new File("board.jpg"));
//			board.setIcon(new ImageIcon(img));
//		} catch (IOException e) {
//			
//		}
//		this.add(board);
//	}
	
	public void reset() {
		turn = 0;
		incTurn.setText("<html> Start<br />Game</html>");
		turnLbl.setText("Turn:" );
		diceNumLbl.setText("Num Roll: ");
		eelDice1.setText("Dice 1: ");
		eelDice2.setText("Dice 2: ");
//		makePlayers();
		p1.setVisible(false);
		p1.setLocation(14, 710+35);
		p2.setVisible(false);
		p2.setLocation(14, 745+35);
		p3.setVisible(false);
		p3.setLocation(14, 780+35);
		p4.setVisible(false);
		p4.setLocation(14, 815+35);
		for(int i = 0; i < MasterFrame.getCount(); i++) {
			if(i==0)
				p1.setVisible(true);
			if(i==1)
				p2.setVisible(true);
			if(i==2)
				p3.setVisible(true);
			if(i==3)
				p4.setVisible(true);
		}
		repaint();
		
	}

}
