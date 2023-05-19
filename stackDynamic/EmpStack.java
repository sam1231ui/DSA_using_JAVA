package assign.stackDynamic;

public class EmpStack {
	 Node top;
	
	public EmpStack() {
		 top = null;
	}
	
	// to check empty
	public boolean isEmpty() {
		if(top == null)
			return true;
		return false;
	}
	
	// to push object
	public void push(Emp a) {
		
		Node e = new Node(a);
		
		if(top == null) {
			top = e;
		}else {
			 e.next = top;
			 top = e;
		}
		
	}
	
	// to delete top most object
	public Node pop() {
		 
		if(top == null)
			return null;
		Node temp = top;
		
		top = top.next;
		
		return temp;
	}

	// to display stack
	public void display() {
		 Node temp = top;
		  
		 while(temp != null) { 
			 System.out.println(temp.e);
			 temp = temp.next;  
		 }
		 
	}
}