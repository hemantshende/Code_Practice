package sorting;

import java.util.Arrays;

public class QuickSort {
	private void QuickSort(int[]arr,int left,int right) {
		if(left<right) {
			int pivot=Partition(arr,left,right);
			QuickSort(arr, left, pivot-1);
			QuickSort(arr, pivot+1, right);
			
		}
	}
		
		public int Partition(int[]arr,int left,int right) {
			int pivot=arr[left];
			int i=left;
			int j=right;
			 while(i<j) {
				 while(i<=right && arr[i]<=pivot)
					 i++;
				 while(arr[j]>pivot)
					 j--;
				 if(i<j) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 } 
				 	
			}
			 int temp=arr[j];
			 arr[j]=arr[left];
			 arr[left]=temp;
			return j;
		}
		
	

	public static void main(String[] args) {
		QuickSort s=new QuickSort();
		int[] arr= {81, 2, 45, 6, 17, 5, 12};
		System.out.println("QuickSort Sort");
		System.out.println("Before: " + Arrays.toString(arr));
		s.QuickSort(arr,0,arr.length-1);
		System.out.println("After : " + Arrays.toString(arr));

	}

}
