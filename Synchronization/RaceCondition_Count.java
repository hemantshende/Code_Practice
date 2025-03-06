package Synchronization;

public class RaceCondition_Count {
	
	private int count;
	
	RaceCondition_Count(int count){
		this.count=count;
	}
	
	public void incValue(int data) {	
		count= count +data;
	}
	
	public void decValue(int data) {
			count= count -data;
	}
	
	public int getResult() {
		return count;
	}

}

//method are not synchronized...
//so multiple threads can access same data 
//and result may get wrong
