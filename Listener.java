import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Listener implements ActionListener {

	JFrame frame;
	
	public Listener(JFrame frame) {
		
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		new SecondGui("Written for the love of my life ~K <3", "I Love you dareling <3", "Click the button below to close");
		frame.dispose();
		
	}

}
