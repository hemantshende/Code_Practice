package Executor_Threadpool;

//import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		
		ExecutorService ex= Executors.newFixedThreadPool(5);
//		ExecutorService ex1=Executors.newsin
		
		for(int i=0;i<100;i++) {
			numberPrinter x=new numberPrinter(i);
			ex.execute(x);
		}
	}
}

/* IMPORTANT
 * Executors everytime creating new thrread is time consuming.. so for number of
 * tasks executors only create few threds like here we have created 5 threads
 * for 100 tasks
 */