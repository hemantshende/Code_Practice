package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student("A",20,2017,90);
		student s2=new student("B",24,2010,78);
		student s3=new student("C",26,2013,48);
		student s4=new student("D",22,2018,69);
		student s5=new student("E",27,2015,87);
		
		ArrayList< student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		//-----------comparable--------------------
		Collections.sort(list); //this is allow when student class
									//have sorting algorithm.and this 
									//is done by COMPARABLE interface...
		System.out.println("sorting by comparable");
		for (student student : list) {
			System.out.println(student.name+"  "+student.age);
		}
		
		//------------comparator----------------------------
		
		Collections.sort(list, new StudentPSPComparator()); //need to pass comparator object in the sort method 
															//here we pass studentPSPcomparator object	
		System.out.println("sorting on the basis of PSP via PSPcomparator");
		for (student student : list) {
			System.out.println(student.name+"  "+student.age +"  "+ student.psp);
		}

	}

}

