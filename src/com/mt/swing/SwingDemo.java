package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingDemo {
	
	JLabel jb;
	
	SwingDemo(){
		
		//Create a new JFrame container
		JFrame jf = new JFrame("Swing application!");
		//set layout
		jf.setLayout(new FlowLayout());
		//frame initial size
		jf.setSize(220,90);
		//close the application
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//create two button
		JButton jbtn1 = new JButton("Yes");
		JButton jbtn2 = new JButton("No");
		
		//add action listener for yes
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jb.setText("Yes is pressed!");
			}
		});
		
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jb.setText("No is pressed!");
			}
		});
		
		jf.add(jbtn1);
		jf.add(jbtn2);
		
		//create a label
		jb = new JLabel("Press a button.");
		//add label to the frame
		jf.add(jb);
		//display the frame
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new SwingDemo();
					}
				});
	}
	

}
