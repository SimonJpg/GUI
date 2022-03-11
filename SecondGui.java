import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SecondGui {
	
	public SecondGui(String title, String textFirstLabel, String textSecondLabel) {
		
		//Frame
		JFrame frame = new JFrame(title);
		
		//Fonts
		Font writing = new Font("Serif", Font.PLAIN, 40);
		
		//ImageIcon
		ImageIcon icon = new ImageIcon("Heart.png");
		
		//BufferedImage
		//BufferedImage img = new Image.IO.read(new File("Heart.png"));
		
		//Labels
		JLabel firstLabel = new JLabel(textFirstLabel);
		JLabel secondLabel = new JLabel(textSecondLabel);
		JLabel imageLabel = new JLabel(icon);
		
		firstLabel.setBounds(0, 10, 1820, 50);
		firstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstLabel.setFont(writing);
		
		secondLabel.setBounds(0, 780, 1820, 50);
		secondLabel.setHorizontalAlignment(SwingConstants.CENTER);
		secondLabel.setFont(writing);
		
		imageLabel.setBounds(920, 500, 198, 254);
		//imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Buttons
		JButton firstButton = new JButton("Close");
		firstButton.setBounds(870, 860, 150, 50);
		firstButton.setHorizontalAlignment(SwingConstants.CENTER);
		firstButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		firstButton.addActionListener(event -> {frame.dispose();});
		firstButton.setVisible(true);
		
		//Panel
		JPanel panel = new JPanel();
		panel.setBounds(920, 500, 198, 254);
		
		
		//Frame
		ImageIcon topIcon = new ImageIcon(getClass().getResource("Pixelherz1"));
				
		frame.setLayout(null);
		frame.setIconImage(topIcon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1820, 960);
		frame.setBackground(new Color(68, 68, 68));
		frame.setLocationRelativeTo(null);
		frame.add(firstLabel);
		frame.add(secondLabel);
		frame.add(imageLabel);
		frame.add(firstButton);
		frame.setVisible(true);
		
	}
	
}