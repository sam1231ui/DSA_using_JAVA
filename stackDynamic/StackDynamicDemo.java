package assign.stackDynamic;

public class StackDynamicDemo {
	
	public static void main(String[] args) {
		
		
		// Emp stack DEMO
		Emp e1 = new Emp(1,"sam",99);
		Emp e2 = new Emp(2,"swo",88);
		Emp e3 = new Emp(3,"ddd",77);
		Emp e4 = new Emp(4,"see",66);
		
		EmpStack s = new EmpStack();
		
		s.push(e1);
		s.push(e2);
		s.push(e3);
		s.push(e4);
		s.display();
		
		System.out.println("deleted Node " + s.pop().toString());
		
		s.display();
//		
		
		
		// Even Odd Stack
		IntStack e = new IntStack();
		IntStack o = new IntStack();
		int i=1;
		while(true) {
			
			if(i%2 == 0 && e.count() != 10)
				e.push(i);
			
			if(i%2 != 0 && o.count() != 5)
				o.push(i);
			
			if(e.count() == 10 && o.count() == 5)
				break;
			
			i++;
		}
		
		System.out.println("Even Stack");
		e.display();
		System.out.println("Odd stack");
		o.display();
		
	}

}
