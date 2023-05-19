package assign.stackDynamic;

public class IntNode {
	
	int data;
	IntNode next;
	
	public IntNode(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "IntNode [data=" + data + "]";
	}
	
	

}
