import java.util.Scanner;

public class Total_Ball {
	public static int calculate(int n) {
		int result=1;
		for(int i=0;i<=n;i++) {

			if(i%2==0) {
				result=result-1;
			}else {
				result=result+2;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of seconds");
		int n=sc.nextInt();
		System.out.println(calculate(n));
		
	}
}
