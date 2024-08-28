package com.mt.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		String text = "Welcome to Software Development House\nHappy Learning!";

		try {
		      File myObj = new File("filename.txt");
		      //File myObj = new File("C:\\Users\\MyName\\filename.txt");
		      // Defining the file name of the file
		      Path fileName = Path.of("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      //writing in file
		      try {
		      Files.writeString(fileName, text);
		      // Reading the content of the file
	           String fileContent = Files.readString(fileName);
	           // Printing the content inside the file
	           System.out.println(fileContent);
	           //Another way to reading a file
	           File myFileObj = new File("filename.txt");
	           Scanner myReader = new Scanner(myFileObj);
	           while (myReader.hasNextLine()) {
	             String data = myReader.nextLine();
	             System.out.println(data);
	           }
	           myReader.close();
	           //Delete a file
				if (myFileObj.delete()) { 
			      System.out.println("Deleted the file: " + myFileObj.getName());
			    } else {
			      System.out.println("Failed to delete the file.");
			    } 
	         } catch (FileNotFoundException e) {
	           System.out.println("An error occurred.");
	           e.printStackTrace();
	         }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
			

	}

}
