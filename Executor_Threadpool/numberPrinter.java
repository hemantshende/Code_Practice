package Executor_Threadpool;

public class numberPrinter implements Runnable{
	
	public int number;
	
	public numberPrinter(int x) {
		number=x;
	}

	@Override
	public void run() {
		System.out.println("number "+number+"  thread+"+Thread.currentThread().getName());
	}
}
