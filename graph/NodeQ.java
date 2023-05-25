package assign.graph;

public class NodeQ {
	Node front;
	Node rear;
	
	public NodeQ() {
		front = rear = null;
	}
	
	// to check if empty 
	public boolean isEmpty() {
		if(front == null)
			return true;
		return false;
	}
	
	// add node in queue
	public void enQ(int e) {
		
		Node t = new Node(e);
		
		if(front == null) {
			rear = t;
			front = t;
			return;
		}
		rear.next = t;
		rear = t;
	}
	
	// delete node form queue
	public int deQ() {
		if(front == null)return -1;
		 
		Node temp = front;
		
		if(front == rear) {
			rear = front = null;
			return temp.data;
		}
		
		front = front.next;
		return temp.data;
	}
	
	// display
	public void display() {
		
		if(this.isEmpty()) {
			System.out.println("Empty");
			return;
		}
		
		Node temp = front;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println();
	}
	

}
