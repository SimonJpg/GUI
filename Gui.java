import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

public class Gui {

	//Title : title of frame, text : text of JLabel
	public Gui(String title, String textFirstLabel, String textSecondLabel) {
		
		//Frame
		JFrame frame = new JFrame(title);
		
		//Fonts
		Font writing = new Font("Serif", Font.PLAIN, 40);
		
		//Labels
		JLabel firstLabel = new JLabel(textFirstLabel);
		JLabel secondLabel = new JLabel(textSecondLabel);
		
		firstLabel.setBounds(0, 10, 1820, 50);
		firstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstLabel.setFont(writing);
		
		secondLabel.setBounds(0, 380, 1820, 50);
		secondLabel.setHorizontalAlignment(SwingConstants.CENTER);
		secondLabel.setFont(writing);
		
		//Buttons
		JButton firstButton = new JButton("Run");
		firstButton.setBounds(870, 200, 150, 50);
		firstButton.setHorizontalAlignment(SwingConstants.CENTER);
		firstButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		firstButton.addActionListener(new Listener(frame));
		firstButton.setVisible(true);
		
		JButton secondButton = new JButton("Exit");
		secondButton.setBounds(870, 600, 150, 50);
		secondButton.setHorizontalAlignment(SwingConstants.CENTER);
		secondButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		secondButton.addActionListener(event -> {frame.dispose();});
		secondButton.setVisible(true);
		
		//Frame
		ImageIcon icon = new ImageIcon(getClass().getResource("Pixelherz1"));
		
		frame.setLayout(null);
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1820, 960);
		frame.setBackground(new Color(68, 68, 68));
		frame.setLocationRelativeTo(null);
		frame.add(firstLabel);
		frame.add(secondLabel);
		frame.add(firstButton);
		frame.add(secondButton);
		frame.setVisible(true);
		
	}
	
}
