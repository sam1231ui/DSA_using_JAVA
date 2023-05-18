package assign.linkListDouble;

public class Dnode {
	int data;
	Dnode next, prev;
	
	public Dnode(int data) {
		this.data = data;
		next = prev = null;
	}

	@Override
	public String toString() {
		return "Dnode [data=" + data + "]";
	}
}
