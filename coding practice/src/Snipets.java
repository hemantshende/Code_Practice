//
//public class Snipets {
//
//	public static void main(String[] args) {
//		div(4,0);
//	}
//	
//	public static void div(final int a,final int b) {
//		try {
//			final int x=a/b;
//			System.out.println();
//		}
//		catch(final Exception exp){
//			System.out.println("Exceptioncaught int catch-1");	
//		}
//		catch(final ArithmeticException exp){
//			System.out.println("Exceptioncaught int catch-2");	
//		}
//	}
//
//}

//============================

public class Snipets implements Runnable {
	@Override
	public void run() {
		System.out.println("thread");
	}

	public static void main(String[] args) throws InterruptedException {

		final Thread t1=new Thread(new Snipets());
		t1.start();
		t1.start();
		System.out.println(t1.getState());
	}
}
//============================

//public class Snipets extends B {
//	public static String sing() {
//		return "sa";
//	}
//
//	public static void main(String[] args) {
//		final Snipets a=new Snipets();
//		final B b= new Snipets();
//		System.out.println(a.sing()+""+b.sing());
//		
//	}
//	
//}
//class B{
//	public static String sing() {
//		return "re";
//	}
//}
