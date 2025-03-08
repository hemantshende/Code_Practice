import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
	
		String[] b= {"a","b","c"};
	
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(b));
		

		list.add("d");
		
		ArrayList<String> list1=new ArrayList<String>();
		Collections.addAll(list1, b);

		list1.add("d");
		System.out.println(list1);
	}

}
