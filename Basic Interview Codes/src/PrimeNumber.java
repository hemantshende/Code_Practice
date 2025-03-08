import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nummber: ");
		int num = sc.nextInt();
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				list.add(i);
			}
		}
		if (count > 1) {
			System.out.println("not prime number");
			System.out.println("Factors of " + num + " are " + list);
		} else
			System.out.println("Prime Number");

	}

}
