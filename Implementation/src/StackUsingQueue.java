import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();
	
	public void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		q1.add(data);
		
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
		}
	}
	
	public int pop() {
		int ans=q1.remove();
		return ans;
	}
	
	public void print() {
		System.out.println(q1.toString());
	}


	public static void main(String[] args) {
		StackUsingQueue s=new StackUsingQueue();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
//		s.print();
		System.out.println(q1.toString());
		
		s.pop();
		System.out.println(q1.toString());

	}

}
