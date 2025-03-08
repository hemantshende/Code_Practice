
//leap year divisible by 4
//century year(ended with 00) are not leap year except the year is divisible by 400

import java.util.*;

class leap_year {
	public static void main(String args[]) {
		int n;
		System.out.println("enter the year:");
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0)) {
			System.out.println("it is a leap year");
		} else {
			System.out.println("it is not a leap year");

		}
	}
}
