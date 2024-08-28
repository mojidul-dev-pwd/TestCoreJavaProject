package com.mt.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
*/

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//local current time
		LocalTime localTimeObj = LocalTime.now();
		System.out.println(localTimeObj);
		//local current date and time
		LocalDateTime localdtObj = LocalDateTime.now();
		System.out.println("Before formatting: " + localdtObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//DateTimeFormatter myFormatOnlyDateObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//DateTimeFormatter myFormatOnlyDateObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		DateTimeFormatter myFormatOnlyDateObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = localdtObj.format(myFormatObj);
		System.out.println("Afer formatting: " + formattedDate);
		String formattedOnlyDate = localdtObj.format(myFormatOnlyDateObj);
		System.out.println("Only Date formatting: " + formattedOnlyDate);
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    double myDouble1 = 9.78d;
	    int myInt1 = (int) myDouble1; // Manual casting: double to int
	    System.out.println(myDouble1);   // Outputs 9.78
	    System.out.println(myInt1);      // Outputs 9
	    
	    int maxScore = 500;
	    int userScore = 423;
	    float percentage = (float) userScore / maxScore * 100.0f;
	    System.out.println("User's percentage is " + percentage +" %");
	    
	    //bitwise operator
	 // Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        
        String firstName = "Mojidul ";
        String lastName = "Islam";
        System.out.println(firstName.concat(lastName));
        
        
		
		
		
	}

}
/*
public JTextFieldDemo() {
		//set up the frame
		JFrame jf = new JFrame("Swing application!");
		jf.setLayout(new FlowLayout());		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(260,210);
		
		
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
*/