import java.util.Arrays;

public class SelectionSort {
	
	public void SelectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {

			for(int j=i+1;j<=arr.length-1;j++) {
				
				//swapping is done here
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int[] arr = { 81, 2, 45, 6,6, 17, 5, 12 };
		
		System.out.println("Selection Sort");
		System.out.println("Before: " + Arrays.toString(arr));
		s.SelectionSort(arr);
		System.out.println("After : " + Arrays.toString(arr));

	}

}
