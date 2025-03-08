package Oops;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
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


