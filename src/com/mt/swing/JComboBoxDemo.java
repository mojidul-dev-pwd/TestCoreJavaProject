package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo {
	
	//create an array of cities
	String Cities[] = {"New York","Chicago","Dhaka","London",
			"Los Angels","Hong kong","Tokyo","Sydney","Bangkok","Delhi","Islamabad"};

	public JComboBoxDemo() {			
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(200,200);
		
		JComboBox<String> jcb = new JComboBox<String>(Cities);
		jf.add(jcb);
		
		JLabel jlb = new JLabel(new ImageIcon("hourglass.png"));
		jf.add(jlb);
		
		jcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String s = (String)jcb.getSelectedItem();
				jlb.setIcon(new ImageIcon(s+".png"));
			}
		});
		
		//display the frame
	    jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run() {
					new JComboBoxDemo();
				}
			});
	}

}
