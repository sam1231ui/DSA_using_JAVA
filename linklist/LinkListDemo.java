package assign.linklist;



public class LinkListDemo {
	
	public static void main(String[] args) {
		
//		// INT LIST DEMO \\
//		IntList l = new IntList();
//		
//		for(int i=0; i<5; i++) {
//			l.add(new IntNode(i+1));
//		}
//		
//		// display of Int list 
//		l.display();
		
		
		
		
		// String list Demo \\
		// String list
		StrList s = new StrList();
		
		StrNode s1 = new StrNode("I");
		StrNode s2 = new StrNode("am");
		StrNode s3 = new StrNode("sam");
		StrNode s4 = new StrNode("!!");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.addAtFirst(new StrNode("Hi"));
		s.addAtend(new StrNode("done"));
		s.display();
		
		// start and last data in list
		s.getStart();
		s.getEnd();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// BOOK  LIST DEMO \\
//		// link list of book object 
//		BookList l1 = new BookList();
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			
//			// user input for book instances
//			System.out.println("Enter book Id ,name and price to add book or 1 to exit");
//			
//			if(sc.nextInt() == -1)
//				break;
//			
//			int id = sc.nextInt();
//			String name = sc.next();
//			double price = sc.nextDouble();
//			
//			// indirect book object for better understanding
//			//BookL b = new BookL(id,name,price);
//			
//			// direct creation of link node of type book
//			Node n1 = new Node(new BookL(id,name,price));
//			
//			l1.add(n1);
//		}
//		sc.close();
//		l1.display();
		
	}
}
