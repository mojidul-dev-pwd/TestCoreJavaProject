package com.mt.swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JButtonDemo implements ActionListener {

	JLabel jbl;
	public JButtonDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 450);
		
		//add buttons to content pane
		ImageIcon ii1 = new ImageIcon("hourglass.png");
		JButton jbtn1 = new JButton(ii1);
		jbtn1.setActionCommand("Hourglass");
		jbtn1.addActionListener(this);
		jf.add(jbtn1);
		
		ImageIcon ii2 = new ImageIcon("analog.png");
		JButton jbtn2 = new JButton(ii2);
		jbtn2.setActionCommand("Analog Clock");
		jbtn2.addActionListener(this);
		jf.add(jbtn2);
		
		ImageIcon ii3 = new ImageIcon("digital.png");
		JButton jbtn3 = new JButton(ii3);
		jbtn3.setActionCommand("Digital Clock");
		jbtn3.addActionListener(this);
		jf.add(jbtn3);
		
		ImageIcon ii4 = new ImageIcon("stopwatch.png");
		JButton jbtn4 = new JButton(ii4);
		jbtn4.setActionCommand("Stop Watch");
		jbtn4.addActionListener(this);
		jf.add(jbtn4);
		
		jbl = new JLabel("Choose a Timepiece");
		jf.add(jbl);
		
		//display the frame
		jf.setVisible(true);
	}
	
	//Handle button events
	public void actionPerformed(ActionEvent ae) {
		jbl.setText("You are selected "+ ae.getActionCommand());
	}
			
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new JButtonDemo();
					}
				});
	}
}
