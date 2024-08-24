package com.mt.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo {
	
	//create an array of cities
			String Cities[] = {"New York","Chicago","Dhaka","London",
					"Los Angels","Hong kong","Tokyo","Sydney","Bangkok","Delhi","Islamabad"};
			
	public JListDemo() {
		
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(200,200);
		
		JList<String> jlst = new JList<String>(Cities);
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane jsp = new JScrollPane(jlst);
		jsp.setPreferredSize(new Dimension(120,90));
		
		JLabel jl = new JLabel("Choose City");
		
		jlst.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int idx = jlst.getSelectedIndex();
				if(idx != -1)
					jl.setText("Current Selection "+Cities[idx]);
				else
					jl.setText("Choose a city");
			}
		});
		
		jf.add(jsp);
		jf.add(jl);
		
		
		//display the frame
	    jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run() {
					new JListDemo();
				}
			});
	}

}
