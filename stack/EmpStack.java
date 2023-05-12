package assign.stack;

public class EmpStack {
	Emp []arr;
	int top;
	int size;
	
	public EmpStack() {
		this.size = 0;
		this.arr = new Emp[0];
		this.top = -1;
	}
	
	public EmpStack(int size) {
		
		this.size = size;
		this.arr = new Emp[size];
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
	
	public void push(Emp a) {
		
		if(!isFull()) 
			arr[++top] = a;
		else
			System.out.println("stack overflow for " + a.toString());
	}
	
	public Emp pop() {
		if(!isEmpty())
			return arr[top--];
		else
			return null;
	}

	public void display() {
		while(!isEmpty()) {
			System.out.println(arr[top--].toString());
		}
	}
}