import java.util.ArrayList;
import java.util.List;

public class ReturnLargestArray {

	public static void main(String[] args) {

		int[] arr = { 1, -5, 8, -100, 2, 9,1000 };
		int large = 0;
		int start = 0, end = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int j = i; j <= arr.length - 1; j++) {
				sum = sum + arr[j];
				if (sum > large) {
					start = i;
					end = j;
					large = sum;
				}
			}
		}
		System.out.println(large);
		
		List<Integer> list = new ArrayList<Integer>();
		for (int k = start; k <= end; k++) {
			list.add(arr[k]);
		}
		System.out.println(list);

	}

}
