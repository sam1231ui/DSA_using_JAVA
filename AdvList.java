package assign.linklist;

public class AdvList {
	
	IntNode []head;
	
	public AdvList(int size) {
		
		this.head = new IntNode[size];
		
		for(int i=0;i<size;i++)
			head[i]=new IntNode(i);
	}
	
	public void display(){
		for(int i=0;i<this.head.length;i++){
			IntNode move=head[i];
	
			while(move!=null){
				System.out.print(move.data + " ");
				move=move.next;
			}
			System.out.println();
		}
	} //end of display
	
	public void add(int i, int j) {
		
		if(head[i] == null)return;
		
		IntNode temp = head[i];
		IntNode rec = new IntNode(j);
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = rec;
		return;
	}
}
