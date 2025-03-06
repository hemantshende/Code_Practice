package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabdasComparator {

	public static void main(String[] args) {
		
//		List<Integer> list= new ArrayList(List.of(41, 22, 73, 24, 5, 86, 27, 48, 9, 10));
		
		//comparator --> functional interface-> we can use lambdas here
		//comparator has only one method -->compare(o1,o2);
		//it has two parameters..so we need to pass 2 parameters with lambdas
		
		List<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(73);
		list.add(28);
		list.add(43);
		list.add(29);
		list.add(53);
		list.add(93);

		Collections.sort(list, (x,y)->{   
			return x-y;
		});
		
		// here internally it takes comarator interface which is functional interface...
		//and comparator expect 2 parameters
		//so we pass (x,y) and compared them
		
		System.out.println(list);
	}
}
