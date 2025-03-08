import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"green","blue","yellow","blue","green","yellow"};
		//Arrays.sort(arr);
		for(String i : arr) {
			System.out.println(i);
			
		
		}
		
		List<String> list=new ArrayList<String>();
		Collections.addAll(list, arr);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
