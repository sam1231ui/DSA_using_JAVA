package assign;

import java.util.*;

public class BookDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of books records");
		
		int size = sc.nextInt();
		
		Book []rec = new Book[size];
		
		int choice;
		
		// menu start  
		do {
			System.out.println("********MENU*********\n"
					+ "1. Add records\n"
					+ "2. Display All\n"
					+ "3. Modify \n"
					+ "4. Count\n"
					+ "5. search\n"
					+ "6. Exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				for(int i=0; i<size; i++) {
					System.out.println("Enter id, name and price");
					int id = sc.nextInt();
					String name = sc.next();
					double price = sc.nextDouble();
					
					rec[i] = new Book(id,name,price);
				}
				break;
				
			case 2:
				for(int i=0; i<rec.length; i++)
					System.out.println(rec[i].toString());
				break;
				
			case 3:
				System.out.println("Enter book id and name to be modify");
				int s = sc.nextInt();
				String str = sc.next();
				
				for(int i=0; i<rec.length; i++) {
					if(rec[i].getBid() == s) {
						rec[i].setName(str);
					}
				}
				break;
				
			case 4:
				System.out.println(size);
				break;
				
			case 5:
				System.out.println("Enter id to be searched ");
				int st = sc.nextInt();
				
				for(int i=0; i<rec.length; i++) {
					
					if(rec[i].getBid() == st)
						System.out.println(rec[i].toString());
				}
				break;
				
			case 6:
				System.out.println("thank you for being with us !!");
				break;
			default:
				System.out.println("Enter valid choice only");
			}
				
			
			
		}while(choice != 6);
		
		sc.close();

	}

}
