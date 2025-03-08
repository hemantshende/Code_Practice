import java.util.Scanner;

public class Palindome_Number {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();//1234
		int rev=0;
		int og_num=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==og_num) {
			System.out.println("palindrome Number");
		}else {
			System.out.println("Not palindrome Number");
		}
		
		
	}

}
