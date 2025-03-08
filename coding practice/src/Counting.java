import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//HSBC code1

//public class Counting {
//	
//	static void countNumber(int n) {
//		int count = 0;
//		if (n <= 0) {
//			System.out.println("invalid number");
//		} else {
//			for (int i = 1; i <= n; i++) {
//				if (n <= 0) {
//					System.out.println("invalid number");
//				}
//				if (i % 5 == 0 || i % 7 == 0) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
//	}
//	public static void main(String[] args) {
//		int n = 0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the num : " + n);
//		n=sc.nextInt();
//		countNumber(n);
//	}
//}

//HSBC code2

//public class Counting {
//	static List findCount(int[] arr,int num,int diff) {
//		
//		LinkedList<Integer> list=new LinkedList<>();
////		int[] arr1=new int[arr.length];
//		int b = 0;
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			int a1=Math.abs(arr[i]-num);//convert the negative in value to positive
//			if(a1<=diff) {
//				count++;
//				 b=arr[i];
//				list.add(b); 
//			}	
//		}
//		list.sort(null);//..........just for sorting
//		System.out.println(count);
//		return list;	
//	}
//	public static void main(String[] args) {
//		int[] arr= {12,3,14,56,57,58,80,81,79,13};
//		int num=57;
//		int diff=2;	
//		
//		System.out.println(findCount(arr, num, diff));
//	}	
//}

//HSBC code 3
//Speed counting
//public class Counting {
//	static int speedOfBoat(int d,int t1,int t2) {
//		int a=d/t1;
//		int b =d/t2;
//		int c=(a+b)/2;
//		
//		return c;	
//	}
//	public static void main(String[] args) {
//		int d=56;
//		int t1=7;
//		int t2=4;
//		System.out.println(speedOfBoat(d, t1, t2));
//	}
//}

public class Counting {
	static int findCount(int[] arr, int num, int n) {
//		int[] arr1=arr.clone();
//        Arrays.sort(arr);
		int min = 0;
		int max = 0;
		for (int i = 0; i < num; i++) {
			min += arr[i];
//			System.out.println(min);
		}

		for (int i = n-1; i>=n-num; i--) {
			max += arr[i];
//			System.out.println(max);
		}

		int result=max - min;
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 10 ,10,10};
//		System.out.println(arr.length);
		int num = 4;
		int n = arr.length;
//		System.out.println(arr[7]);
//		findCount(arr, num, n);
		System.out.println(findCount(arr, num,n));
	}
}
