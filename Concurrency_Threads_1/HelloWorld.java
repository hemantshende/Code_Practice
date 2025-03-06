package Concurrency_Threads_1;

public class HelloWorld implements Runnable{
//	void print() {
//		System.out.println("Hello World..!");
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World..!+ "+ Thread.currentThread().getName());
		
	}
}
