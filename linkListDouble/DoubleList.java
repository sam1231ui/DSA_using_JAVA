package assign.linkListDouble;

public class DoubleList {

	Dnode head;

	
	public DoubleList() {
		head  = null;
	}
	
	// count method
	public int count() {
		Dnode temp = head;
		int count = 0;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	// ALL ADD OPERATIONS
	
	// add method
	public void add(Dnode d) {
		
		if(head == null)
			head = d;
		else {
			Dnode temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = d;
			d.prev = temp;
		}
	}
	
	// add to nth position
	public void add(Dnode d, int pos) {
		
		 if(pos == 1) {
			 if(head == null) {
				 head = d;
			 }else {
				 d.next = head;
				 head.prev = d;
				 head = d; 
			 }	
			 return;
		 }
		 
		 if(pos < 1 && pos > this.count()) {
			 System.out.println("Invalid pos");
		 }
		
		 int i = 1;
		 Dnode temp = head;
		 
		 while(temp.next != null && i != pos) {
			 temp = temp.next;
			 i++;
		 }
		 d.next = temp;
		 temp = temp.prev;
		 temp.next = d;
		 d.prev = temp;
		 temp.next.next.prev = d;
		 return;
		 
	}
	
	
	
	
	
	
	// ALL DELETE METHODS
	
	// will remove one element from last
	public void delete() {
		
		if(head == null || head.next == null) {
			head = null;
			return;
		}
		Dnode temp = head;
		 
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 temp= temp.prev;
		 temp.next = temp.next.next;
		 
		 return;
	}
	
	// delete nth position
	public void delete(int pos) {
		if(pos < 1 || pos > this.count() || head == null) {
			System.out.println("Not valid");
			return;
		}
		if(pos == 1) {
			if(head.next == null)
				this.delete();
			else {
				head = head.next;
				head.prev = null;
			}
			return;
		}
		
		
		if(pos == this.count()) {
			this.delete();
			return;
		}
		
		int i =1;
		Dnode temp = head;
		
		while(temp.next != null && i != pos-1) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		temp = temp.next;
		temp.prev = temp.prev.prev;
		
		return;
		
		
	}
	
	
	
	
	
	
	//ALL DISPLAY 
	
	// display method
	public void display() {
		Dnode temp = head;
		
		while(temp != null) {
			System.out.println(temp.toString());
			temp = temp.next;
		}
		System.out.println();
	}
	
	// nth data print
	public void display(int pos) {
		
		if(pos < 1 || pos > this.count()) {
			System.out.println("Not valid pos");
			return;
		}
			
		int i = 0;
		Dnode temp = head;
		
		while(temp != null && i != pos-1) {
			temp = temp.next; 
			i++;
		}
			
		
		System.out.println(temp.toString());
		System.out.println();
	}
	
	
	// reverse display
	public void displayR() {
		if(head == null)return;
		
		Dnode temp = head;
		
		while(temp.next != null) 
			temp = temp.next;
		
		while(temp != null) {
			System.out.println(temp.toString());
			temp = temp.prev;
		}
		System.out.println();
	}
}
