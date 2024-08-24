package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonDemo implements ActionListener{

	JLabel jbl;
	public JRadioButtonDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		JRadioButton jrb1 = new JRadioButton("A");
		jrb1.addActionListener(this);
		jf.add(jrb1);
		
		JRadioButton jrb2 = new JRadioButton("B");
		jrb2.addActionListener(this);
		jf.add(jrb2);
		
		JRadioButton jrb3 = new JRadioButton("C");
		jrb3.addActionListener(this);
		jf.add(jrb3);
		
		//define a button group
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		
		jbl = new JLabel("Select One");
		jf.add(jbl);
		
		//display the frame
	    jf.setVisible(true);		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
			jbl.setText("You selected" + ae.getActionCommand());
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new JRadioButtonDemo();
					}
				});
	}
}
