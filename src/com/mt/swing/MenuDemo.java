package com.mt.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo implements ActionListener{
	
	JLabel jlb;

	public MenuDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		jlb = new JLabel();		
		
		//create menu bar
		JMenuBar jmb = new JMenuBar();
		/*
		//create menu file
		JMenu jm = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiClose = new JMenuItem("Close");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiExit = new JMenuItem("Exit");
		jm.add(jmiOpen);
		jm.add(jmiClose);
		jm.add(jmiSave);
		jm.addSeparator();
		jm.add(jmiExit);
		jmb.add(jm);
		*/
		//using mnemonics and accelarators		
		//create menu file
		JMenu jm = new JMenu("File");
		jm.setMnemonic(KeyEvent.VK_F);
		JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
		jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
		jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		jm.add(jmiOpen);
		jm.add(jmiClose);
		jm.add(jmiSave);
		jm.addSeparator();
		jm.add(jmiExit);
		jmb.add(jm);
		
		JMenu jmOptions = new JMenu("Options");
		JMenu jmColors = new JMenu("Colors");
		JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
		JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
		JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");
		JCheckBoxMenuItem jmiPink = new JCheckBoxMenuItem("Pink");
		jmColors.add(jmiRed);
		jmColors.add(jmiGreen);
		jmColors.add(jmiBlue);
		//jmColors.addSeparator();
		jmColors.add(jmiPink);
		jmOptions.add(jmColors);
		
		JMenu jmPriority = new JMenu("Priority");
		JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High",true);
		JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");
		jmPriority.add(jmiHigh);
		jmPriority.add(jmiLow);
		jmOptions.add(jmPriority);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jmiHigh);
		bg.add(jmiLow);
		
		JMenuItem jmiReset = new JMenuItem("Reset");
		jmOptions.addSeparator();
		jmOptions.add(jmiReset);
		jmb.add(jmOptions);
		
		JMenu jmHelp = new JMenu("Help");
		ImageIcon icon = new ImageIcon("about.gif");
		JMenuItem jmiAbout = new JMenuItem("About",icon);
		jmHelp.add(jmiAbout);
		jmb.add(jmHelp);
		
		jmiOpen.addActionListener(this);
		jmiClose.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiRed.addActionListener(this);
		jmiGreen.addActionListener(this);
		jmiBlue.addActionListener(this);
		jmiPink.addActionListener(this);
		jmiHigh.addActionListener(this);
		jmiLow.addActionListener(this);
		jmiReset.addActionListener(this);
		jmiAbout.addActionListener(this);
		
		
		jf.add(jlb);
		jf.setJMenuBar(jmb);
		
		//display the frame
		jf.setVisible(true);
	}
	
	//Handle menu item action event
	public void actionPerformed(ActionEvent ae) {
		String actionCommandStr = ae.getActionCommand();
		if(actionCommandStr.equals("Exit")) System.exit(0);
		jlb.setText(actionCommandStr+ " is Selected");
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new MenuDemo();
					}
				});
	}
}
