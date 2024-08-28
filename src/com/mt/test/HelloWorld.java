package com.mt.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        
        System.out.println("Max = "+Math.max(a, b));
        System.out.println("Min = "+Math.min(a, b));
        System.out.println("a Suare root = "+Math.sqrt(a));
        System.out.println("Abs = "+Math.abs(-4.7));//returns the absolute (positive) value
        System.out.println("Random number = "+Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("Random number from 1 to 100 = "+randomNum);
        
        String result = (a < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        
        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
        
        //sum from 1 to 20
        int ii = 1;
        int iiMax = 20;
        int iSum = 0;
        while(ii<=iiMax) {
        	iSum += ii;
        	ii++;
        }
        System.out.println("Sum from 1 to "+ iiMax +"="+ iSum);
        ii = 1;
        iSum = 0;
        do {
        	iSum += ii;
        	ii++;
        }while(ii<=iiMax);
        System.out.println("Sum from 1 to "+ iiMax +"="+ iSum);
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }
        
        //multi-dimentional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
          for (int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
          }
        }
		
        //call recursive
        int resultr = sumrecursiveSum(10);
        System.out.println("Recursive = "+resultr);
        
        //encapsulation example
        PersonClass myObj = new PersonClass();
        //myObj.name = "John";  // error
        //System.out.println(myObj.name); // error
        myObj.setName("Mojidul Islam"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
        
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Match found");
        } else {
          System.out.println("Match not found");
        }
		
	}	
	
	
	public static int sumrecursiveSum(int k) {
	    if (k > 0) {
	      return k + sumrecursiveSum(k - 1);
	    } else {
	      return 0;
	    }
	  }

}

class PersonClass {
	  private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
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