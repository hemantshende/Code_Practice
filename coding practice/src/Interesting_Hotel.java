import java.util.Scanner;

public class Interesting_Hotel {
	public void Program(int n) {
		int arr[]=new int[n];
		System.out.println("array elements");
		for(int i=0;i<=n-1;i++) {
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
			System.out.print(arr[i]);
		}
		
		System.out.println("interesting hotels");
		for(int i=0;i<=n-3;i++) {
			
			 if(!(arr[i]>arr[i+1] && arr[i]>arr[i+2])) {
				System.out.println(i+1);
			}
			 while(arr[i]==arr[i+1]) {
				 System.out.println("=========");
			 }
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Hotels");
		int n=sc.nextInt();

		Interesting_Hotel h=new Interesting_Hotel();
		h.Program(n);	
	}
}
