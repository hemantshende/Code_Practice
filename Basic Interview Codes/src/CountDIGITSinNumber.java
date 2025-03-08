import java.util.Scanner;

public class CountDIGITSinNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		long num=sc.nextLong();
		long count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("no of digits:"+count);

	}

}
