package com.mt.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JTableDemo {
	
	String[] colHeads = {"Name","Extension","ID#"};
	
	//Initialize data
	Object[][] data = {
			{"A. Rahim","4321","1001"},
			{"A. Karim","4321","1002"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"},
			{"A. Rahim","4321","1001"}
	};

	public JTableDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		JTable jtbl = new JTable(data, colHeads);
		JScrollPane jsp = new JScrollPane(jtbl);
		
		jf.add(jsp);
		
		
		//display the frame
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new JTableDemo();
					}
				});
	}
}
