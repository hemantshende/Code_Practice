package Generics;

public class GenericsPair2<T,V>{
	
	T first;
	V second;
	
	
	
	//generic method
	//1
	public <E> void doSomething(E third) {
		System.out.println("generic method");
		System.out.println(third);
	}
	
	//2
	public <E> int doSomething1(E third) {
		System.out.println("generic method");
		System.out.println(third);
		return 1;
	}
	
	//3
	public <E> E doSomething3(E third) {
		System.out.println("generic method");
		System.out.println(third);
		return third;
	}
	
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

}
