package assign.stackDynamic;

public class IntStack {
	
	 IntNode top;
		
	public IntStack() {
		 top = null;
	}
	
	// count of stack
	public int count() {
		IntNode temp = top;
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;	
	}
	
	// to check empty
	public boolean isEmpty() {
		if(top == null)
			return true;
		return false;
	}
	
	// to push object
	public void push(int a) {
		
		IntNode e = new IntNode(a);
		if(top == null) {
			top = e;
		}else {
			 e.next = top;
			 top = e;
		}
		
	}
	
	// to delete top most object
	public IntNode pop() {
		 
		if(top == null)
			return null;
		IntNode temp = top;
		
		top = top.next;
		
		return temp;
	}

	// to display stack
	public void display() {
		 IntNode temp = top;
		  
		 while(temp != null) { 
			 System.out.println(temp.toString());
			 temp = temp.next;  
		 }
		 
	}
}
