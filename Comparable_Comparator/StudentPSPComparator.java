package Comparable_Comparator;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<student>{
	
	//just to have access to compare the object on the basis of ther attributes

	@Override
	public int compare(student o1, student o2) {
		if(o1.psp < o2.psp) {
			return -1;
		}else if(o1.psp > o2.psp) {
			return 1;
		}
		return 0;
	}

}
