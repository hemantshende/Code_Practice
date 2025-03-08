import java.util.Scanner;

public class Factorial_Number {
	
	// Using Recursion
	public static long factorial(int num) {
		if (num >= 1)
			return num * factorial(num - 1);
		else
			return 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		long fact1 = factorial(num);

		// Using Normal For loop
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Using FOR-LOOP: " + fact);
		System.out.println("\nUsing RECURSION: " + fact1);
	}


}
