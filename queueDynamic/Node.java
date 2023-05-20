package assign.queueDynamic;

public class Node {

	Emp data;
	Node next;
	
	
	public Node(Emp data) {
		this.data = data;
		next = null; 
	}

	@Override
	public String toString() {
		return data.toString();
	}
	
	
}
