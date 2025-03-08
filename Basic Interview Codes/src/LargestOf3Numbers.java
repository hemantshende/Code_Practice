import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//using ternary operator
		int result=(a>b &&a>c)?a:(b>c?b:c);
		System.out.println("Using Ternary: "+result);
		
		//Normal if-else
		if(a>b && a>c)
			System.out.println("Using If-else: "+a);
		else if(b>a && b>c)
			System.out.println("Using If-else: "+b);
		else
			System.out.println("Using If-else: "+c);

	}

}
