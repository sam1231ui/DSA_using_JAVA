package assign.queue;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) throws MyQueueExp {
		
		// 10 integer  queue
		MyQueue q = new MyQueue(10);
		
		for(int i=0 ;i<10; i++) {
			q.enQueue(i+1);
		}
		q.display();
		 
		
		
		// customer queue
		CustQ qc = new CustQ(3);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter name and id");
			String name = sc.next();
			int id = sc.nextInt();
			
			Cust c = new Cust(name,id);
			
			qc.enQueue(c);
		}
		qc.display();
		
		
	}

}
