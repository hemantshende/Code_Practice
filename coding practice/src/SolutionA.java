
class A{
	int a=10;
	void run1() {
		System.out.println("inside A");
	}
}
class B extends A{
	int b=20;
	void run2() {
		System.out.println("inside B");
	}
}
class C extends B{
	int c=30;
	void run() {
		System.out.println("inside c");
	}
}
public class SolutionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c=new C();
		B b=new B();
		A a= new A();
		System.out.print(c.a+" ");
		System.out.print(c.b+" ");
		System.out.println(c.c+" ");
		
		System.out.print(b.a+" ");
		System.out.println(b.b+" ");
//		System.out.print(b.c+" ");
		
		System.out.println(a.a+" ");
//		System.out.print(a.b+" ");
//		System.out.print(a.c+" ");
		
		c.run();
		c.run1();
		
		b.run1();
		

		

	}

}
