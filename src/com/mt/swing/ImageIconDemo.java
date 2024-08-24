package com.mt.swing;

import java.awt.*;

import javax.swing.*;

public class ImageIconDemo {
	
	public ImageIconDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		//create an icom
		ImageIcon ii = new ImageIcon("hourglass.png");		
		JLabel jl = new JLabel("Hourglass",ii,JLabel.CENTER);
		jf.add(jl);
		
		//display the frame
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new ImageIconDemo();
					}
				});
	}
}
