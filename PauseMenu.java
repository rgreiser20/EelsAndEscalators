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
    public PauseMenu(JFrame parent, CardLayout cl, JPanel containedIn, String sendToMenu)
    {
        Color textColor = new Color(74, 189, 105);
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







    }

}