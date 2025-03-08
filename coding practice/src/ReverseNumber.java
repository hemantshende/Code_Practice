import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		 System.out.println("enter");
//		 int n=sc.nextInt();
		 int n=1234001;
		 System.out.println(n);
		 int rev=0;
		 
		 while(n>0) {
			 int m=n%10;
			 rev=rev*10+m;
			 n=n/10;
		 }
		 System.out.println(rev);

	}

}
