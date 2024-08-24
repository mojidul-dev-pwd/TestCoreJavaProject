package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo {

	public JToggleButtonDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		JLabel jlb = new JLabel("Button is off");
		
		JToggleButton jtbl = new JToggleButton("On/Off");
		//add item listener for toggle button
		jtbl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(jtbl.isSelected())
					jlb.setText("Button is On");
				else
					jlb.setText("Button is Off");
			}
		});
		
		jf.add(jtbl);
		jf.add(jlb);
		
		
		//display the frame
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new JToggleButtonDemo();
					}
				});
	}
}
