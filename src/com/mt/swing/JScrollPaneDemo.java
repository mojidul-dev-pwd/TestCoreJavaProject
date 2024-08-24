package com.mt.swing;

import java.awt.*;
import javax.swing.*;

public class JScrollPaneDemo {
	
	public JScrollPaneDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(20,20));
		
		int b = 0;
		for(int x=0;x<20;x++) {
			for(int y=0;y<20;y++) {
				jp.add(new JButton("Button "+b));
				++b;
			}
		}
		
		JScrollPane jsp = new JScrollPane(jp);
		jf.add(jsp, BorderLayout.CENTER);
		
		//display the frame
	    jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run() {
					new JScrollPaneDemo();
				}
			});
	}

}
