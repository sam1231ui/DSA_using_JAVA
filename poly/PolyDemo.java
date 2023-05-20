package assign.poly;

import java.util.*;

public class PolyDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PolyList p = new PolyList();
		
		System.out.println("Enter the terms");
		
		int terms = sc.nextInt();
		
		for(int i=0; i<terms; i++) {
			System.out.print("Enter coffiecient and exponent: ");
			int base = sc.nextInt();
			int power = sc.nextInt();
			
			p.add(base, power);
		}
		sc.close();
		System.out.println("Expression :");
		p.display();

	}

}
