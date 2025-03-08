
public class Ifocus {

	public static synchronized void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Ifocus obj=new Ifocus(n);
		Thread f= new Thread();
		Thread g=new Thread();
		f.start();
		System.out.println("A");
		f.wait(1000);
		g.start();
		System.out.println("B");
		

	}
//	static int a=10;
//	static int n;
//	int b=5;
//	int c;
//	public Ifocus(int m) {
//		System.out.println(a+ " "+b+" "+c+" "+n+" "+m);
//	
//		
//	}
//	{
//		b=30;
//	n=20;
//	}
//	static {
//		a=60;
//	}

}


