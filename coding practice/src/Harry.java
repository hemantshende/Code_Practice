import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Harry {

	public static Object[] Actual(int[] arr) {
		Arrays.sort(arr);
		
		List<Integer> list=new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if(i!=0 && arr[i]==arr[i-1] ) {
				continue;
			}else if(list.size()>=arr.length/2){
				break;
			}else {
				list.add(arr[i]);
			}
		}
		Object[] arr2=list.toArray();
		Arrays.sort(arr2);
		
		return arr2;
	}
	public static void main(String[] args) {

		int[] arr1 = { 1,2,9,4,5,18,7,8,3,6,3,12,15,6,21,24 };

		System.out.println(Arrays.toString(Actual(arr1)));
	}
}
