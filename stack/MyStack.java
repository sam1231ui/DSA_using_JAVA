package assign.stack;

public class MyStack {
	
	int []arr;
	int top;
	int size;
	
	public MyStack() {
		this.size = 0;
		this.arr = new int[0];
		this.top = -1;
	}
	
	public MyStack(int size) {
		
		this.size = size;
		this.arr = new int[size];
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
	public void push(int num) {
		
		if(!isFull()) 
			arr[++top] = num;
		else
			System.out.println("stack overflow for " + num);
	}
	public int pop() {
		if(!isEmpty())
			return arr[top--];
		else
			return -9999;
	}
	public void display() {
		while(!this.isEmpty())
			System.out.print(arr[top--]+ " ");
	}

}
