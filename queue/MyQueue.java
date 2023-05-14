package assign.queue;

public class MyQueue {
	// instance member
	int arr[];
	int size;
	int front, rear;
	
	// constructor 
	public MyQueue(int size) {
		this.size = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = 0;
	}
	
	// Empty check
	public boolean isEmpty() {
		if(rear == 0 && front == 0)
			return true;
		else
			return false;
	}
	
	// Full check
	public boolean isFull() {
		if(rear == size)
			return true;
		return false;	
	}
	
	// add element
	public void enQueue(int num) throws MyQueueExp {
		 if(!isFull()) {
			 arr[rear++] = num;
		 }else {
			 throw new MyQueueExp("Full");
		 }
	}
	
	// delete element
	public int deQueue() throws MyQueueExp {
		
		int n;
		if(isEmpty())
			throw new MyQueueExp("Queue is Empty");
		
		n = arr[front];
		if(rear == front) rear = front =0;
		
		front++;
		return n;
	}
	// display
	public void display() {
		int temp = front;
		while(temp != rear) {
			System.out.print(arr[temp++] + " ");
		}
		System.out.println();
	}
}