package com.mt.swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class PaintDemo {
	
	JLabel jb;
	PaintPanel pp;
	
	PaintDemo(){
		//Create a new JFrame container
		JFrame jf = new JFrame("Swing application!");
		//set layout
		//jf.setLayout(new FlowLayout());
		//frame initial size
		jf.setSize(820,590);
		//close the application
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pp = new PaintPanel();
		
		jf.add(pp);
		
		//display the frame
	    jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new PaintDemo();
					}
				});
	}
	

}
