import java.util.Scanner;

public class Count_EVENandODD_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		long num=sc.nextLong();
		long count=0;
		long rem=0;
		long even=0;
		long odd=0;
		
		while(num!=0) {
			rem=num%10;
			if(rem%2==0) 
				even++;
			else 
				odd++;
			num=num/10;
			count++;
		}
		System.out.println("no of digits:"+count);
		System.out.println("Even:"+even+" Odd:"+odd);
	}

}
