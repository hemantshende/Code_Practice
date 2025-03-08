import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();//1234
		
		//logic 1
		int rev=0;
		while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		}
		
		System.out.println(rev);
		
		//logic 2 -->Stringbuffer
		System.out.println("(StringBuffer) Enter number: ");
		int num1=sc.nextInt();
		StringBuffer rev1;
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		rev1=sb.reverse();
		
		System.out.println(rev1);
		
		
		

	}

}
