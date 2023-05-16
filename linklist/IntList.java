package assign.linklist;

public class IntList {
	
	// head of list 
	IntNode head;
	
	// to define list
	public IntList() {
		head = null;
	}
	
	// to add object of book to list
	public void add(IntNode b) {
		
		if(head == null)
			head = b;
		else {
			IntNode temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = b;
		}
	}
	
	// to display list 
	public void display() {
		
		IntNode temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

}
