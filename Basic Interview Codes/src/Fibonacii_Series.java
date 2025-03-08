import java.util.ArrayList;
import java.util.List;

public class Fibonacii_Series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=10;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
		List<Integer> list=new ArrayList<Integer>();
		int c=0;
		int d=1;
		int sum1=0;
		list.add(c);
		list.add(d);
		for(int i=2;i<=10;i++) {
			sum1=c+d;
			list.add(sum1);
			c=d;
			d=sum1;
		}

		System.out.println(list);
	}

}
