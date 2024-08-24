package com.mt.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;


public class CalculatorDemo implements ActionListener {

	JLabel result;
	double total = 0;
	double tempInput = 0;
	String resultStr = "";
	boolean isAdd = false;
	boolean isSubs = false;
	boolean isMultiply = false;
	boolean isDivided = false;
	
	public CalculatorDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		jf.setBackground(Color.GREEN);
		
		//setBorder(BorderFactory.createLineBorder(Color.PINK, 5));
		
		result = new JLabel("0");
		result.setBackground(Color.BLUE);
		jf.add(result);
		
		JButton jb1 = new JButton("1");
		jb1.setActionCommand("1");
		jb1.addActionListener(this);
		jf.add(jb1);
		
		JButton jb2 = new JButton("2");
		jb2.setActionCommand("2");
		jb2.addActionListener(this);
		jf.add(jb2);
		
		JButton jb3 = new JButton("3");
		jb3.setActionCommand("3");
		jb3.addActionListener(this);
		jf.add(jb3);
		
		JButton jbPlus = new JButton("+");
		jbPlus.setActionCommand("+");
		jbPlus.addActionListener(this);
		jf.add(jbPlus);
		
		JButton jbMinus = new JButton("-");
		jbMinus.setActionCommand("-");
		jbMinus.addActionListener(this);
		jf.add(jbMinus);
		
		JButton jbMultiply = new JButton("*");
		jbMultiply.setActionCommand("*");
		jbMultiply.addActionListener(this);
		jf.add(jbMultiply);
		
		JButton jbDivided = new JButton("/");
		jbDivided.setActionCommand("/");
		jbDivided.addActionListener(this);
		jf.add(jbDivided);
		
		JButton jbClear = new JButton("C");
		jbClear.setActionCommand("C");
		jbClear.addActionListener(this);
		jf.add(jbClear);
		
		JButton jbResult = new JButton("=");
		jbResult.setActionCommand("=");
		jbResult.addActionListener(this);
		jf.add(jbResult);
		
		
		
		//display the frame
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		switch(str) {
		case "+":
			isAdd = true;
			isSubs = false;
			isMultiply = false;
			isDivided = false;
			if(tempInput != 0) {
				resultStr += "+";
			}else {
				tempInput = Double.valueOf(str);
				total += tempInput;
			}
			break;
		case "-":
			isAdd = false;
			isSubs = true;
			isMultiply = false;
			isDivided = false;
			if(tempInput != 0) {
				resultStr += "-";
			}else {
				tempInput = Double.valueOf(str);
				total -= tempInput;
			}
			break;
		case "*":
			isAdd = false;
			isSubs = false;
			isMultiply = true;
			isDivided = false;
			if(tempInput != 0) {
				resultStr += "*";
			}
			break;
		case "/":
			isAdd = false;
			isSubs = false;
			isMultiply = false;
			isDivided = true;
			if(tempInput != 0) {
				resultStr += "/";
			}
			break;
		case "C":
			total = 0;
			tempInput = 0;
			resultStr = "0";
			isAdd = false;
			isSubs = false;
			isMultiply = false;
			isDivided = false;
			result.setText(resultStr);
			break;
		case "=":
			resultStr = String.valueOf(total);
			result.setText(resultStr);
			break;
		default:
			resultStr += str;
			tempInput = Double.valueOf(str);
			if(tempInput != 0) {
				if(isAdd)
				total += tempInput;
				if(isSubs)
				total -= tempInput;
				if(isMultiply)
				total *= tempInput;
				if(isDivided)
				total /= tempInput;
			}
			result.setText(resultStr);
			break;
		}
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run() {
						new CalculatorDemo();
					}
				});
	}
}
