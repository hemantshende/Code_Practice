import java.util.Scanner;
import java.util.Stack;

public class Reverse_String {

	public static void main(String[] args) {
		
		// 1)-->using Concatenation operator
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);	
		}
		System.out.println("Reversed String :"+rev);
		
		
		// 2)-->Using CHARACTER ARRAY
		char []arr=str.toCharArray();
		String rev1="";
		for(int i=str.length()-1;i>=0;i--) {
			rev1=rev1+arr[i];	
		}
		System.out.println("Reversed String (Char Array) :"+rev1);
		
		//  3)-->USING STACK
		Stack<Character> a=new Stack<Character>();
		
		char []arr1=str.toCharArray();
		String rev2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			a.add(arr1[i]);
			rev2=rev2+a.pop();
		}
		System.out.println("Reversed String (Stack) :"+rev2);
		
		//  4)-->using STRINGBUFFER CLASS
		StringBuffer sb= new StringBuffer(str);
		StringBuffer rev3=sb.reverse();
		System.out.println("Reversed String (StringBuffer) :"+rev3);
		
	}

}
