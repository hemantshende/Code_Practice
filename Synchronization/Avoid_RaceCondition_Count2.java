package Synchronization;

public class Avoid_RaceCondition_Count2 {
	
	private int count;
	
	public Avoid_RaceCondition_Count2(int count) {
		this.count=count;
	}
	
	synchronized public void incValue(int data) {	
		count= count +data;
	}
	
	synchronized void decValue(int data) {
			count= count -data;
	}
	
	public int getResult() {
		return count;
	}

}

//method are synchronized...
//so multiple threads can not access same data 
//and we get the desired result
