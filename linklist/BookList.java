package assign.linklist;

public class BookList {
	
	// head of list 
	Node head;
	
	// to define list
	public BookList() {
		head = null;
	}
	
	// to add object of book to list
	public void add(Node b) {
		
		if(head == null)
			head = b;
		else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = b;
		}
	}
	
	// to display list 
	public void display() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.b.toString());
			temp = temp.next;
		}
		System.out.println();
	}

}
