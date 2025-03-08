
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

//implementing list
public class LinkedList1 {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList();

		list.add(12);
		list.add(34);
		list.add(45);
		list.add(36);
		list.add(47);
		list.add(87);
		System.out.println(list);
		
		list.remove(0);
		list.remove(3);
		System.out.println(list);
		
		Queue<Integer> list1=new LinkedList();

		list1.add(12);
		list1.add(34);
		list1.add(45);
		list1.add(36);
		list1.add(47);
		list1.add(87);
		System.out.println(list1);
		list1.remove();
		list1.remove();
		System.out.println(list1);
		
		Set<Integer> set=new HashSet<>(); 
		set.add(12);
		set.add(12);
		set.add(14);
		set.add(11);
		set.add(33);
		set.add(28);
		System.out.println("hs=="+set);
		
		Set<Integer> set1=new LinkedHashSet<>(); 
		set1.add(12);
		set1.add(12);
		set1.add(14);
		set1.add(11);
		set1.add(33);
		set1.add(28);
		System.out.println("lhs=="+set1);
		
		Set<Integer> set2=new TreeSet<>(); 
		set2.add(12);
		set2.add(12);
		set2.add(14);
		set2.add(11);
		set2.add(33);
		set2.add(28);
		System.out.println(set2);
	}

}
