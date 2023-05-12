package assign.stack;

public class CharStack {

	char []arr;
	int top;
	int size;
	
	public CharStack() {
		this.size = 0;
		this.arr = new char[0];
		this.top = -1;
	}
	
	public CharStack(int size) {
		
		this.size = size;
		this.arr = new char[size];
		this.top = -1;
	}
	
	public boolean isFull() {
		if(top == size-1)
			return true;
		return false;
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
	}
	public void push(char num) {
		
		if(!isFull()) 
			arr[++top] = num;
		else
			System.out.println("stack overflow for " + num);
	}
	public char pop() {
		if(!isEmpty())
			return arr[top--];
		else
			return '#';
	}
	public void display() {
		while(!this.isEmpty())
			System.out.print(arr[top--]+ " ");
	}

}
