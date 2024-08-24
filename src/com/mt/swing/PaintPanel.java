package com.mt.swing;

import java.awt.*;
import java.util.*;

import javax.swing.*;

public class PaintPanel extends JPanel {
	Insets ins;//holds the panel's insets
	Random rand;
	PaintPanel(){
		//put a boder around the panel
		setBorder(BorderFactory.createLineBorder(Color.PINK, 10));
		rand = new Random();
	}
	
	protected void paintComponent(Graphics g) {
		//always call super class method first
		super.paintComponent(g);
		int x,y,x2,y2;
		
		int height = getHeight();
		int width = getWidth();
		
		ins = getInsets();
		
		//Draw the lines
		
		for(int i=0;i<10;i++) {
			x = rand.nextInt(width - ins.left);
			y = rand.nextInt(height - ins.bottom);
			x2 = rand.nextInt(width - ins.left);
			y2 = rand.nextInt(width - ins.bottom);
			
			g.setColor(Color.PINK);
			//draw the line
			g.drawLine(x, y, x2, y2);
		}
	}
}
