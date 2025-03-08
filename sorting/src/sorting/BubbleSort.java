package sorting;

import java.util.Arrays;

public class BubbleSort {
	public void BubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false)
				break;
		}
	}

	public static void main(String[] args) {
		BubbleSort s= new BubbleSort();
	    int[] arr= {81, 2, 45, 6, 17, 5, 12};
	    System.out.println("Bubble Sort");
		System.out.println("Before: " + Arrays.toString(arr));
		s.BubbleSort(arr);
		System.out.println("After : " + Arrays.toString(arr));
	
	}
}
