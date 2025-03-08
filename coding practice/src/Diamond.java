import java.util.Stack;

public class Diamond {

	public static void main(String[] args) {
//	    right-angle triangle
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j < 5; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int i, j, row = 6;
		for (i = 0; i < row; i++) {
			for (j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (i = 1; i < row; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (j = 1; j <= row - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("---------------------");
		// reverse Array
		String str = "abcde";

		char[] arr = str.toCharArray();

		for (i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);

		System.out.println();
		System.out.println("=========================");

		// pattern
//		Stack<Integer> s = new Stack<Integer>();
//		for (int k = 5; k >= 1; k--) {
//			for (i = 1; i <= 5; i++) {
//				if (k >= i) {
//					System.out.print("@");
//				} else {
//					System.out.print(i);
//					s.push(i);
//					System.out.print(s.push(i));
//				}
//				System.out.println(s.peek());
////			}    
////			for (i = 1; i <= 5; i++) {
////				System.out.print(s.pop());
////			}
//		}
			
			

	}
	
}
