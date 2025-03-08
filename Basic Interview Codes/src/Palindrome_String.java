import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");

		String str = sc.next();
		String og_String = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (rev.equals(og_String)) {
			System.out.println("Palindrome Sring");
		} else {
			System.out.println("Not a Palindrome Sring");
		}

	}
}
