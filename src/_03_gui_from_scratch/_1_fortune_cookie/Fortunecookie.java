package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortunecookie {

	public void showButton() {
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		
		JButton Button = new JButton();
		
		frame.add(Button);
		
		frame.pack();
		
		Button.addActionListener((ActionListener) this);
		
		 int rand = new Random().nextInt(5);
		
		System.out.println("Button clicked");
		
	}

	public void actionPerformed() {
		
		JOptionPane.showMessageDialog(null, "Woohoo!");
		
	}
	
}

