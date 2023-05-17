package assign.linklist;

public class StrList {
	
	// head of list 
	StrNode head;
		
	// constructor
	public StrList() {
			head = null;
	}
	
	// count of list
	public int count() {
		
		StrNode temp = this.head;
		int count =0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	
	
	
	// ALL ADD OPERATIONS
	
	// add link
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
	
	// add node at nth 
	public void addPos(int pos, StrNode data) {
		
		 if(head == null || pos == 1) {
			 this.addAtFirst(data);
			 return;
		 }
		 
		 int i=1;
		 StrNode temp = head;
		 
		 while(temp != null && i != pos-1) {
			 temp = temp.next;
			 i++;
		 }
		 
		 if(temp != null) {
			 data.next = temp.next;
			 temp.next = data;
		 }
		 return;
		 
	}
	
	
		
	
	// ALL DELETE OPERATIONS
		
	// delete at end
	public void deleteEnd() {
		
		if(head == null)return;
		
		StrNode temp = head;
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
	}
	
	// delete at start
	public void deletebeg() {
			
			if(head != null)
				head = head.next;
		}
	
	// delete nth data link
	public void deletePos(int pos) {
		
		 
		if(head == null && head.next == null) {
			head = null;
			return;
		}
		if(pos == 1) {
			head = head.next;
			return;
		}
		
		int i=1;
		StrNode temp = head;
		
		while(temp.next != null && i != pos-1) {
			temp = temp.next;
			i++;
		}
		
		if(i == pos-1 && temp.next == null)
			temp.next = null;
		else if(i == pos-1 && temp.next != null)
			temp.next = temp.next.next;
		return;
	}

	// delete mid 
	public void deleteMid() {
		int mid = this.count()/2;
		
		this.deletePos(mid);
	}
	
	
	
	// ALL DISPLAY METHODS
	
	// First of list data
	public void getStart() {
			if(head != null)
				System.out.println(head.str);
			else
				System.out.println("Empty");
		}
	
	// End of list data
	public void getEnd() {
			if(head == null) {
				System.out.println("Empty");
				return;
			}
				
			StrNode temp = head;
			while(temp.next != null)
				temp = temp.next;
			System.out.println(temp.str);
		}
	
	// Print reverse
	// display reverse 
	public void printReverse(StrNode list) {
		
		if(list != null) {
			printReverse(list.next);
			System.out.print(list.str + " " );
			
		}	
	}
	
	// Normal display
	// to display list 
	public void display() {
			
		StrNode temp = head;
			
		while(temp != null) {
			System.out.println(temp.str);
			temp = temp.next;
		}
		System.out.println();
	}

	// Print nth data
	// display nth data
	public void displayPos(int n) {
		int i=0;
		StrNode temp = head;
		
		while(temp != null && i != n-1) {
			temp = temp.next;
			i++;
		}
		if(i == n-1)
			System.out.println(temp.str);
		else
			System.out.println("Data not present");
		
	}
}
