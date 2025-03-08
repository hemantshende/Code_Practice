import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDiffInArray {
	public static int finalresult(List<Integer> a1,List<Integer> a2, int sum1, int sum2, int ans) {
		for (int i = 0; i < a1.size(); i++) {
			for (int j = 0; j < a2.size(); j++) {
			
				if(sum2<sum1 && (a1.get(i)-a2.get(j))==ans) {
					a2.add(a1.remove(i));
					a1.add(a2.remove(j));
					break;
				}else if(sum1<sum2 && (a2.get(i)-a1.get(j))==ans){
					a1.add(a2.remove(i));
					a2.add(a1.remove(j));
					break;
				}
			}
		}
		int sum3=0,sum4=0;
		for (int i = 0; i < a1.size(); i++) {
			sum3+=a1.get(i);	
		}
		for (int i = 0; i < a2.size(); i++) {
			sum4+=a2.get(i);	
		}
		
		int diff1=Math.abs(sum3-sum4);
		System.out.println("sum3="+sum3+"  sum4="+sum4+"   diff="+diff1);
		return diff1;
	}

	public static int minDiff(int[] arr) {
		List<Integer> a1 =  new ArrayList<Integer>();
		List<Integer> a2 =  new ArrayList<Integer>();
		int sum1=0,sum2=0;
		
		//add 1st and 2nd ele to list a1 and a2 respectively
		a1.add(arr[0]);
		a2.add(arr[1]);
		
		//update the sum
		sum1+=arr[0];
		sum2+=arr[1];
		for (int i = 2; i < arr.length; i++) {
			
			if(sum1<sum2) {
				a1.add(arr[i]);	
				sum1+=arr[i];	
			}
			else {
				a2.add(arr[i]);
				sum2+=arr[i];	
			}
		}
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println("sum1="+sum1+"   "+"sum2="+sum2);
	
		int ans=Math.abs(sum2-sum1)/2;
		System.out.println("first_diff="+ans);

		int a=finalresult(a1,a2,sum1,sum2,ans);
		
		System.out.println(a1);
		System.out.println(a2);
	
		int finalSum1=0,finalSum2=0;
		for (int i = 0; i <a1.size(); i++) {
			finalSum1+=a1.get(i);
		}
		for (int i = 0; i < a2.size(); i++) {
			finalSum2+=a2.get(i);
		}

		int b=finalresult(a1,a2,finalSum1,finalSum2,ans);
		int diff=finalSum1-finalSum2;
		System.out.println(" 2===  " +finalresult(a1,a2,finalSum1,finalSum2,diff/2));
		System.out.println(a1);
		System.out.println(a2);
		
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
	
	
	
	public static void main(String[] args) {
//		int[] arr= {3,4,5,3,100,1,83,54,23,20};
//		int[] arr= {5,6,5,6,5,6};
		int[] arr= {10,9,12,12,21,18,8,14,16,20};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("final_diff="+minDiff(arr));
	}
}
