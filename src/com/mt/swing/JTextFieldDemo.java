package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo {
	
	public JTextFieldDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		JTextField jtxt = new JTextField(15);
		jf.add(jtxt);
		
		JLabel jlb = new JLabel();
		jf.add(jlb);
		
		//Handle action events
		jtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlb.setText(jtxt.getText());
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
						new JTextFieldDemo();
					}
				});
	}
}
