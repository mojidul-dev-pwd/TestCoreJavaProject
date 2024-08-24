package com.mt.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class ConcurrentJavaExample {

	public static void main(String[] args) {
		//example of executor
		ExecutorImp obj = new ExecutorImp();
        try {
            obj.execute(new NewThread());
        }
        catch (RejectedExecutionException
               | NullPointerException exception) {
            System.out.println(exception);
        }
        
        //example of ExecutorService
        // Creating objects of CountDownLatch class
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        
        // Creating objects of ExecutorService class
        //ExecutorService executorService1 = Executors.newSingleThreadExecutor(); //Creates //a ExecutorService object having a single thread.         
        //ExecutorService executorService2 = Executors.newFixedThreadPool(10);  // Creates a //ExecutorService object having a pool of 10 threads.          
        //ExecutorService executorService3 = Executors.newScheduledThreadPool(10); //Creates a scheduled thread pool executor with 10 threads. In scheduled thread //pool, we can schedule tasks of the threads.  

        ExecutorService es = Executors.newFixedThreadPool(2);
        // Executing the tasks 
        es.execute(new MyThread(cd1, "A"));
        es.execute(new MyThread(cd2, "B"));
        es.execute(new MyThread(cd3, "C"));
        es.execute(new MyThread(cd4, "D"));
        
        // Try block to check for exceptions
        try { 
            // Waiting for tasks to complete
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } 
        // Catch block to handle exceptions
        catch (InterruptedException e) {
           
            System.out.println(e);
        }
        
        // Making all current executing threads to terminate
        es.shutdown();
        //shutdownNow(): It immediately terminates all the executing/pending tasks.
        
        //example of ScheduledExecutorService
        
 
        // Display message only for better readability
        System.out.println("Done");        
        

	}

}

class MyThread implements Runnable {
	 
    // Class data members
    String name;
    CountDownLatch latch;
 
    // Constructor
    MyThread(CountDownLatch latch, String name)
    {
 
        // this keyword refers to current instance itself
        this.name = name;
        this.latch = latch;
 
        new Thread(this);
    }
 
    // Method
    // Called automatically when thread is started
    public void run()
    {
 
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}

class ExecutorImp implements Executor {
    @Override
    public void execute(Runnable command)
    {
        new Thread(command).start();
    }
}

class NewThread implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Thread executed under an executor");
    }
}


