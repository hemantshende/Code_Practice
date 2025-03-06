package Comparable_Comparator;

public class student implements Comparable<student> {
	String name;
	int age;
	int gradYear;
	int psp;
	
	public student(String name, int age, int gradYear, int psp) {
//		super();
		this.name = name;
		this.age = age;
		this.gradYear = gradYear;
		this.psp = psp;
	}
	
	
	//we are going to sort it on the basis of age...
	@Override
	public int compareTo(student other) {
		//-1: if this obj come first
		//+1: if other obj come first
		//0: when both obj are equal
		
		if(this.age < other.age) {
			return -1;
		}else if(this.age > other.age) {
			return 1;
		}
		return 0;
	}
}
