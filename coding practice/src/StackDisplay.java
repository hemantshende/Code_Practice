

import java.util.Arrays;
import java.util.Stack;

public class StackDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[] {1,4,0,-5,1,6};
		int N=3;
		System.out.println(Arrays.toString(stackDisplay(N,arr)));
	}

	private static int[] stackDisplay(int N, int[] arr) {
		
		Stack<Integer> stack=new Stack<Integer>();
		int[] arr2=new int[arr.length];
		int M=0;
		int m=0;
		for(int k=0;k<arr.length;k++) {
			
			if(arr[k]>0) {
				stack.push(arr[k]);
				M++;
				int sum=0;
				for(int i=1;i<=stack.size();i++) {
					
					for(int j=1;j<=stack.size();j++) {
						
						sum+=stack.elementAt(i-1)*(stack.elementAt(j-1)*stack.elementAt(j-1));
					}
				}
				arr2[m]=sum;
				++m;
			}
			else if(arr[k]<0){
				stack.push(arr[k]);
				M++;
				arr2[m]=0;
				m++;
			}else {
				if(!stack.empty()) {
					stack.pop();
					M--;
					int sum=0;
					for(int i=1;i<=stack.size();i++) {
						
						for(int j=1;j<=stack.size();j++) {
							sum+=stack.elementAt(i-1)*(stack.elementAt(j-1)*stack.elementAt(j-1));						
						}
					}
					arr2[m]=sum;
					++m;
				}
			}
		}
		return arr2;
	}

}
