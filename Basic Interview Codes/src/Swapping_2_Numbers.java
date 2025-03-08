
public class Swapping_2_Numbers {

	public static void main(String[] args) {
		
		//using Third variable
		
		int a=10;
		int b=20;
		System.out.println("before swapping a="+a+ "  and b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a="+a+ "  and b="+b);
		
		//without Using third variable
		
		int c=10;
		int d=20;
		System.out.println("after swapping a="+c+ "  and b="+d);
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("after swapping a="+c+ "  and b="+d);

	}

}
