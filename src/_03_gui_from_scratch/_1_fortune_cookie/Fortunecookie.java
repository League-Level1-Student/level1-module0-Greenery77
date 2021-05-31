package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortunecookie implements ActionListener {

	public void showButton() {
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		
		JButton Button = new JButton();
		
		frame.add(Button);
		
		frame.setSize(500, 500);
		
		Button.addActionListener (this);
		
		
	}

	public void actionPerformed(ActionEvent e) {

		int rand = new Random().nextInt(5);

		if (rand == 0) {

			JOptionPane.showMessageDialog(null, "You will have a great day tomorrow!");

		}
		if (rand == 1) {

			JOptionPane.showMessageDialog(null, "You wont have a great day tomorrow!");

		}
		if (rand == 2) {

			JOptionPane.showMessageDialog(null, "Things get better from now on.");

		}
		if (rand == 3) {

			JOptionPane.showMessageDialog(null, "You won't always get what you want.");

		}
		if (rand == 4) {

			JOptionPane.showMessageDialog(null, ":D");

		}
		
	}
	
}

