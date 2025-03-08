
public class SinglyLinkedList {
	
	static Node head;
	static Node tail;
	 
	public SinglyLinkedList() {
		 head=null;
		 tail=null;
	 }
	
	public class Node {
		//variables
		int data;
		Node next;
		
		//constructor
		public Node() {
			data=0;
			next=null;
		}
		
		
		public Node (int val) {
			data=val;
			next=null;
		}
	}

	public void addFirst(int element) {
		Node nn=new Node(element);
		if(head==null) {
			head=nn;
			tail=nn;
		}else {
			nn.next=head;
			head=nn;
		}
	}
	
	public void addLast(int element) {
		Node nn=new Node(element);
		if(head==null) {
			head=nn;
			tail=nn;
		}else {
			tail.next=nn;
			tail=nn;
		}
		
	}
	
	public void addAtPos(int element,int pos) {
		Node trav=head;
		Node nn=new Node(element);
		
		if(head==null) {
			addFirst(element);
		}
		
		for(int i=1;i<pos-1;i++) {
			trav=trav.next;
			if(trav.next==null || pos<=0) {
				throw new RuntimeException("invalid positin");
//				break;
			}
			trav=trav.next;
		}
		
		nn.next=trav.next;
		trav.next=nn;
		
				
	}
	
	public void delFirst() {
		if(head==null) {
		    throw new RuntimeException("List is Empty");
		}else {
			head=head.next;
		}
	}
	
	
	public void Display() {
		Node trav=head;
		if (head==null) {
			System.out.println("list is empty");
		}
		while(trav!=null) {
			System.out.println(trav.data);
			trav=trav.next;
		}
		
	}

	public static void main(String[] args) {
	
		SinglyLinkedList s1=new SinglyLinkedList();
		s1.addFirst(5);
		s1.addFirst(10);
		s1.addFirst(15);
//		
//		s1.addLast(20);
//		s1.addAtPos(25,3);
//		s1.addAtPos(25,8);
		s1.Display();
		
		s1.delFirst();
		System.out.println("after deletion");
		s1.Display();
		
		
		System.out.println("       ");
		System.out.println(+head.data+  "   "+tail.data);
		

	}

}
