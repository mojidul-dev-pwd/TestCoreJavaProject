package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo implements ItemListener {
	
	JLabel jbl;
	public JCheckBoxDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		JCheckBox jcb = new JCheckBox("C");
		jcb.addItemListener(this);
		jf.add(jcb);
		
		jcb = new JCheckBox("C++");
		jcb.addItemListener(this);
		jf.add(jcb);
		
		jcb = new JCheckBox("Java");
		jcb.addItemListener(this);
		jf.add(jcb);
		
		jcb = new JCheckBox("Python");
		jcb.addItemListener(this);
		jf.add(jcb);
		
		jbl = new JLabel("Select Language");
		jf.add(jbl);
		
		//display the frame
		jf.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		JCheckBox cb = (JCheckBox)ie.getItem();
		if(cb.isSelected())
			jbl.setText(cb.getText() + " is selected");
		else
			jbl.setText(cb.getText() + " is cleared");
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new JCheckBoxDemo();
					}
				});
	}
}
