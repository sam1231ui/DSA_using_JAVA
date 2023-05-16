package assign.circularQ;

public class CircularQdemo {

	public static void main(String[] args) {
		
		// integer circular queue 
		CircularQ q = new CircularQ(5);
		
		System.out.println(q.isEmpty());
		
		//q.enqueue(0);
		
		
		
		for(int i=0; i<5; i++) {
			q.enqueue(i+1);
		}
		System.out.println(q.isEmpty());
		q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q.isEmpty());
		q.enqueue(0);
		q.display();
		System.out.println(q.rear); 
		
		 
		// dynamic circular queue demo
		
		DynamicCirclularQ q2 = new DynamicCirclularQ(5);
		
		for(int i=0; i<5; i++)
			q2.enqueue(i+1);
		
		q2.display();
		
		q2.enqueue(6);
		q2.enqueue(7);
		
		System.out.println("Dy-queue display");
		q2.display();
		
	}

}
