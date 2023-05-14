package assign.queue;

public class CustQ {
	// instance member
	Cust arr[];
	int size;
	int front, rear;
	
	// constructor 
	public CustQ(int size) {
		this.size = size;
		this.arr = new Cust[size];
		this.front = this.rear = -1;
	}
	
	// Empty check
	public boolean isEmpty() {
		if(rear == -1 && front == -1)
			return true;
		else
			return false;
	}
	
	// Full check
	public boolean isFull() {
		if(rear == size-1)
			return true;
		return false;	
	}
	
	// add element
	public void enQueue(Cust num) throws MyQueueExp {
		if(isEmpty()) {
			rear++;
			front++;
			arr[rear] = num;
			
		}else {
			if(!isFull()) {
				arr[rear++] = num;
			}else
				throw new MyQueueExp("Queue is full");
		}
	}
	
	// delete element
	public Cust deQueue() throws MyQueueExp {
		
		Cust n;
		if(isEmpty())
			throw new MyQueueExp("Queue is Empty");
		
		n = arr[front++];
		if(rear == front) rear = front =-1;
		
		return n;
	}
	// display
	public void display() {
		int temp = front;
		while(temp != rear) {
			System.out.print(arr[temp++].toString() + " ");
		}
		System.out.println();
	}
}