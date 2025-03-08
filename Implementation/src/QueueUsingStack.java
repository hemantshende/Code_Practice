import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();
	
	public void push(int data) {
		s1.push(data);
	}
	
	public int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans= s2.pop();
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
	
	public void print() {
		System.out.println(s1.toString());
	}

	public static void main(String[] args) {

	    QueueUsingStack q1=new QueueUsingStack();
	    
	    q1.push(10);
	    q1.push(20);
	    q1.push(30);
	    q1.push(40);
	    
	   
//	   q1.print();
	   System.out.println(s1.toString());
	    System.out.println(q1.pop());
	    
//	    q1.print();
	    System.out.println(s1.toString());

	}

}
