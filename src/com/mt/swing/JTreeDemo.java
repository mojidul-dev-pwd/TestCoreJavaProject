package com.mt.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;


public class JTreeDemo {

	public JTreeDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		//create top node of tree
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
		
		//Create sub tree of "A"
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		top.add(a);
		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
		a.add(a1);
		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");
		a.add(a2);
		
		//create sub tree of "B"
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		top.add(b);
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
		b.add(b1);
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
		b.add(b2);
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("b3");
		b.add(b3);
		
		//Create the tree
		JTree tree = new JTree(top);
		
		JScrollPane jsp = new JScrollPane(tree);
		jf.add(jsp);
		
		JLabel jlb = new JLabel();
		jf.add(jlb, BorderLayout.SOUTH);
		
		//Handle tree selection listener
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent tse) {
				jlb.setText("Selection is "+tse.getPath());
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
						new JTreeDemo();
					}
				});
	}
}
