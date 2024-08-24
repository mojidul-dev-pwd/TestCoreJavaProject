package com.mt.test;

import java.io.IOException;

public class TestGarbageCollection {
	
	public void finalize(){
		System.out.println("object is garbage collected");
	}  

	public static void main(String[] args) throws Exception {
		System.out.println("Garbase Collection Test");
		TestGarbageCollection obj1 = new TestGarbageCollection();
		TestGarbageCollection obj2 = new TestGarbageCollection();
		
		obj1 = null;
		obj2 = null;
		System.gc();
		
		//Runtime.getRuntime().exec("notepad");//will open a new notepad
		System.out.println(Runtime.getRuntime().availableProcessors());
		Runtime r=Runtime.getRuntime();  
	    System.out.println("Total Memory: "+r.totalMemory());  
	    System.out.println("Free Memory: "+r.freeMemory());
	    /*
	    for(int i=0;i<10000;i++){  
		   new TestGarbageCollection();  
		  }  
		  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());
        */ 

	}

}
