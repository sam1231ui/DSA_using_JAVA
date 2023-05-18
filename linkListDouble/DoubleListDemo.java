package assign.linkListDouble;

public class DoubleListDemo {
	
	// to check prime
	public static boolean isPrime(int n) {
		
		 int count = 0;
		
		for(int i=1; i<=n; i++) {
			
			if(n%i == 0)
				count++;
		}
		
		if(count == 2)
			return true;
		return false;
		
	}
	
	
	public static void main(String[] args) {
		
		// Prime double list DEMO
		
		DoubleList l = new DoubleList();
		
		int i =1;
		while(l.count() < 10) {
			if(isPrime(i))
				l.add(new Dnode(i));
			i++;
		}
		
		l.display(); // normal display
		l.delete(); // one element deleted 
		l.display();
		
		
		l.delete(2); // nth delete
		System.out.println("2nd deleted");
		l.display();
		
		
		l.add(new Dnode(20), 1);
		System.out.println("20 added at 1");
		l.display();
		
		
		l.display(3); // display data of nth position
		l.displayR(); // reverse of list display
		
		
		
	}
}
