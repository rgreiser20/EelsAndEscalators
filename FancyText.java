import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FancyText extends JLabel{
	
	private final Color TEXT_COLOR;
	private final Font TEXT_FONT;
	
	public FancyText(int x, int y, int width, int height, String text, int size) {
		TEXT_COLOR = new Color(74, 189, 105);
		TEXT_FONT = new Font("DIALOG", 0, size);
		setLocation(x, y);
		setSize(width, height);
		setText(text);
		setFont(TEXT_FONT);
		setOpaque(false);
		setHorizontalAlignment(SwingConstants.CENTER);
		setForeground(TEXT_COLOR);
	}
}
