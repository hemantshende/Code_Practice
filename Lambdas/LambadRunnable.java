package Lambdas;

public class LambadRunnable {

	public static void main(String[] args) {
		
		//Lambdas only work with functional interface
		//functional interface --> only has 1 abstract method
		//  ex..Runnable, callable, comparator, comparable etc,
		
		
		//we dont need to create seperate class for it..
		//java will understand and create class and object for it....
		//ex..java creates object runnable
		
		
		Runnable runnable=()->{
			System.out.println("hello world");
		};
		
		Thread t=new Thread(runnable);
		t.start();;
	}

}
