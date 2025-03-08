package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	private void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			
			int temp=arr[i];
			int j; 
			
			for(j=i-1;j>=0 && arr[j]>temp;j--) {
				arr[j+1]=arr[j];
			}
			
			arr[j+1]=temp;
		}
	}

	
	
	public static void main(String[] args) {
		InsertionSort s= new InsertionSort();
	    int[] arr= {81, 2, 45, 6, 17, 5, 12};
	    System.out.println("Insertion Sort");
		System.out.println("Before: " + Arrays.toString(arr));
		s.InsertionSort(arr);
		System.out.println("After : " + Arrays.toString(arr));
	 
	}

}
