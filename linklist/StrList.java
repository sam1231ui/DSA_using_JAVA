package assign.linklist;

public class StrList {
	
	// head of list 
	StrNode head;
		
	// to define list
	public StrList() {
			head = null;
	}
		
	// to add object of book to list
	public void add(StrNode b) {
			
		if(head == null)
			head = b;
		else {
			StrNode temp = head;
				
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = b;
		}
	}
		
	
	// add node at start
	public void addAtFirst(StrNode s) {
		
		if(head == null) {
			head = s; 
			return;
		}
		
		s.next = head;
		head = s;
		
	}
	
	// add node at end
	public void addAtend(StrNode s) {
		
		if(head == null) {
			head = s;
			return;
		}
		
		this.add(s);
	}
	
	// data at First of list
	public void getStart() {
		System.out.println(head.str);
	}
	
	
	// data at End of list 
	public void getEnd() {
		StrNode temp = head;
		while(temp.next != null)
			temp = temp.next;
		System.out.println(temp.str);
	}
	
	
	
	
	// to display list 
	public void display() {
			
		StrNode temp = head;
			
		while(temp != null) {
			System.out.println(temp.str);
			temp = temp.next;
		}
		System.out.println();
	}

}
