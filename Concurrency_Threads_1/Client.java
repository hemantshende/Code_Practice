package Concurrency_Threads_1;

import Executor_Threadpool.numberPrinter;

public class Client {

	public static void main(String[] args) {
		/*
		//creating object of Helloworld class type...
		HelloWorld helloWorld=new HelloWorld();
		Thread t=new Thread(helloWorld);//expecting runnable type object
		*/
		
		
		
		  Runnable helloWorld=new HelloWorld();
		  
		  System.out.println("thread: "+Thread.currentThread().getName());
		  Thread t=new Thread(helloWorld); 
		  t.start();
		  
		 
		
		  for(int i=0;i<100;i++) { 
			  numberPrinter number=new numberPrinter(i);
			  Thread t1=new Thread(number);
			  t1.start(); }
		 
	}
}
