package Oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Colleges{
	int cId;
	String name;
	
	Colleges(int cId,String name){
		this.cId=cId;
		this.name=name;
	}
}

class University{
	private final List<Colleges> colleges;

	public University(List<Colleges> colleges) {
		this.colleges = colleges;
	}
	
	  public List<Colleges> getTotalCollegesInUniversity()   
	    {   
	        return colleges;   
	    }   
}
public class CompositionExample {

	public static void main(String[] args) {
		Colleges c1=new Colleges(1, "abc");
		Colleges c2=new Colleges(2, "afff");
		Colleges c3=new Colleges(3, "uuuasd");
		
		List<Colleges> clg=new ArrayList<>();
		clg.add(c1);
		clg.add(c2);
		clg.add(c3);
		
		University un=new University(clg);
		
		List<Colleges> list=un.getTotalCollegesInUniversity();
		
		for (Colleges cg : list) {
			System.out.println("Name : " + cg.cId   
                    + " and "  
                    + " Address : " + cg.name); 
		}
		
	}

}
