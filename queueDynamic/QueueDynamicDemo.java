package assign.queueDynamic;


public class QueueDynamicDemo {
	
	public static void main(String[] args) {
		
		// employee data for queue
		Emp e1 = new Emp(1,"sam",99);
		Emp e2 = new Emp(2,"swo",88);
		Emp e3 = new Emp(3,"ddd",77);
		Emp e4 = new Emp(4,"see",66);
		
		// queue initialized
		EmpQueue q = new EmpQueue();
		
		// to check for empty queue
		Emp del = q.deQ();
		if(del != null)
			System.out.println("Deleted " +  q.deQ().toString());
		
		

		q.enQ(e1);
		System.out.println("Deleted " +  q.deQ().toString()); // delete condition for only one is available
		q.display();
		q.enQ(e2);
		q.enQ(e3);
		q.enQ(e4);
		
		System.out.println(q.isEmpty());
		
		q.display();
		
		
	}
}