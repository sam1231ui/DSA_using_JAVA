package assign.circularQ;

public class CircularQ {
	
	int[] arr;
	int size;
	int front, rear;
	
	public CircularQ(int size) {
		
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
		
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		return false;
		
	}
	
	public boolean isFull() {
		if(front == (rear+1)%size)
			return true;
		return false;
	}
	
	public void enqueue(int num) {
		
		if(isEmpty()) {
			front++;
			arr[++rear] = num;
		}else if(isFull()) {
				
			System.out.println("Queue is full");
				
		}else {
			rear = (rear+1)%size;
			arr[rear] = num;
			}	
	}
	
	public int dequeue() {
		int temp = -9999;
		if(isEmpty()) return temp;
		
		if(rear == front) {
			temp = arr[front];
			front = rear =-1;
		}else
			front = (front+1)%size;
		
		return temp;
	}
	
	public void display() {
			
		int i = front;
		
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			
			while(i != rear) {
				System.out.println(arr[i]);
				i = (i+1)%size;
			}
			System.out.println(arr[i]);
		}
	}

}