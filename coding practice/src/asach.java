import java.util.Scanner;

public class asach {

	public static void main(String[] args) {
		int b = 1;
		while(b!=48) {
		System.out.println("Enter Character : ");
		Scanner sc=new Scanner(System.in);
		 b=sc.next().charAt(0);
		System.out.println(b);
		}

	}

}
