package com.mt.swing;

import java.awt.*;
import javax.swing.*;

public class JTabbedPaneDemo {

	public JTabbedPaneDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,200);
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Cities", new CitiesPane());
		jtp.addTab("Colors", new ColorsPane());
		jtp.addTab("Flavors", new FlavorsPane());
		jf.add(jtp);
		
		//display the frame
	    jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new JTabbedPaneDemo();
					}
				});
	}
}

class CitiesPane extends JPanel{	
	public CitiesPane() {
		JButton jb1 = new JButton("New York");
		add(jb1);
		
		JButton jb2 = new JButton("Dhaka");
		add(jb2);
		
		JButton jb3 = new JButton("Hong Kong");
		add(jb3);
		
		JButton jb4 = new JButton("London");
		add(jb4);
		
	}
}

class ColorsPane extends JPanel{	
	public ColorsPane() {
		JCheckBox jb1 = new JCheckBox("Red");
		add(jb1);
		
		JCheckBox jb2 = new JCheckBox("Green");
		add(jb2);
		
		JCheckBox jb3 = new JCheckBox("Blue");
		add(jb3);
		
	}
}

class FlavorsPane extends JPanel{	
	public FlavorsPane() {
		JComboBox<String> jb1 = new JComboBox<String>();
		jb1.addItem("Vanila");
		jb1.addItem("Chocolet");
		jb1.addItem("Strawbery");
		add(jb1);		
	}
}
