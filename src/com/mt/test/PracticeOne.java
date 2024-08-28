package com.mt.test;

import java.util.Arrays;
import java.util.HashMap;

enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class PracticeOne {

	public static void main(String[] args) {
		String words = "One Two Three Four";
	    int countWords = words.split("\\s").length;
	    System.out.println("Total word = "+ countWords);
	    
	    //Reverse a String
	    String originalStr = "Hello";
	    String reversedStr = "";
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	    }
	    System.out.println("Reversed string: "+ reversedStr);
	    
	    //Calculate the Sum of an Array
	    int[] myArray = {1, 5, 10, 25};
	    int sum = 0;
	    int i; 
	    // Loop through the array elements and store the sum in the sum variable
	    for (i = 0; i < myArray.length; i++) {
	      sum += myArray[i];
	    }
	    System.out.println("The sum is: " + sum);
	    
	    //Convert a string to a char array
	    String myStr = "Hello";
	    // Convert the string to a char array
	    char[] myCharArray = myStr.toCharArray();
	    System.out.println(myCharArray[0]);
	    
	    //How To Sort an Array
	    String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
	    Arrays.sort(cars);
	    for (String str : cars) {
	      System.out.println(str);
	    }
	    
	    //how to averate an array
	    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
	    float avg, sumArr = 0;
	    int length = ages.length;
	    for (int age : ages) {
	    	sumArr += age;
	    }
	    avg = sumArr / length;
	    System.out.println("The average age is: " + avg);
	    
	    //How To Find the Smallest Element in an Array
	    int lowestAge = ages[0];
		 for (int age : ages) {
		   if (lowestAge > age) {
		     lowestAge = age;
		   }
		 }
		 System.out.println("The lowest age in the array is: " + lowestAge);
		 
		//loop through hash map
	 	HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    // Print keys
	    for (String hi : capitalCities.keySet()) {
	      System.out.println(hi);
	    }
	    // Print values
	    for (String hvi : capitalCities.values()) {
	      System.out.println(hvi);
	    }
	    
	    
	    //Loop Through an Enum
	    for (Level myVar : Level.values()) {
	        System.out.println(myVar);
	      }
	}

}
