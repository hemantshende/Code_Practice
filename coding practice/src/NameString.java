import java.util.Scanner;

public class NameString {
	public static void main(String[] args) {
		System.out.print("Enter Full name: ");
		String[] arr=new String[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
//		
		char[] s=arr[0].toCharArray();
		String rev="";
		for (int i = s.length - 1; i >= 0; i--) {
			rev=rev+s[i];
		}
			
		char[] s1=arr[1].toCharArray();
		char[] s2=arr[2].toCharArray();
		
		rev=rev+s1[0]+s2[0];
		System.out.println("Expected output: "+rev);
		
		
	}
}
