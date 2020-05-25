import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		JButton button1 = new JButton("Click to head home");
		button1.setLocation(40, 10);
		button1.setSize(120,30);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	cl.show(containedIn, sendTo);
		
			}
			
		});
		this.add(button1);
	}

}
