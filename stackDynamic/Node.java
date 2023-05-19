package assign.stackDynamic;

public class Node {

	Emp e;
	Node next;
	
	public Node(Emp e) {
		this.e = e;
		next = null; 
	}

	@Override
	public String toString() {
		return e.toString() + " ";
	}
	
	
}
