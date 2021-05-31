package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	
	JButton button1 = new JButton("1");
	
	JButton button2 = new JButton("2");
	
	JButton button3 = new JButton("3");
			
	public void UI() {
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		
		panel.add(button1);

		panel.add(button2);

		panel.add(button3);

		button1.addActionListener(this);

		button2.addActionListener(this);
		
		button3.addActionListener(this);
		
		frame.add(panel);
		
		frame.pack();
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button1){
			
			showDucks();
			
		}

		if (e.getSource() == button2){
			
			showFrog();
			
		}

		if (e.getSource() == button3){
			
			showFluffyUnicorns();
			
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
