package assign.poly;

public class PolyList {

	Pnode head;
	
	public PolyList() {
		head = null;
	}
	
	public void add(int base,int power) {
		
		Pnode p  = new Pnode(base,power);
		
		if(head == null) {
			head = p;
			return;
		}
		Pnode temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = p;
		return;
		
	}
	
	public void display() {
		if(head == null)return;
		
		Pnode temp = head;
		
		while(temp.next != null) {
			System.out.print(temp.toString() + "+");
			temp = temp.next;
		}
		System.out.println(temp.toString());
	}
}
