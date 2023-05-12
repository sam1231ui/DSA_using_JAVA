package assign.stack;

import java.util.*;

public class StackDemo {
	
///// check prime method
	public static boolean isPrime(int nums) {
		
		if(nums < 2)
			return false;
		
		int count = 0;
		
		for(int i=1; i<=nums; i++) {
			if(nums%i == 0)
				count++;
		}
		if(count == 2)
			return true;
		else
			return false;
	}
	

///// check balance
	public static boolean isBalance(String str) {
		
		CharStack c = new CharStack(str.length());
		
		
		for(int p=0; p<str.length(); p++) {
			 
			 if(str.charAt(p) == '(' || str.charAt(p) == '{' || str.charAt(p) == '[' && !c.isFull()) {
				 c.push(str.charAt(p));
			 }
			 if(str.charAt(p) == ')' && !c.isEmpty()) {
				 char temp = c.pop();
				 if(temp != '(') {
					 return false;
				 }
			 }
			 if(str.charAt(p) == '}' && !c.isEmpty()) {
				 char temp = c.pop();
				 if(temp != '{') {
					 return false;
				 }
			 }
			 if(str.charAt(p) == ']' && !c.isEmpty()) {
				 char temp = c.pop();
				 if(temp != '[') {
					 return false;
				 }
			 }
		 }
		
		if(c.isEmpty())
			return true;
		else
			return false;
		
	}
	
	
	
	public static void main(String []args) {
		
		MyStack s = new MyStack(10);
		int i =1;
		
		while(true) {
			if(s.isFull())
				break;
			if(isPrime(i))
				s.push(i);
			i++;
		}
		s.display();
		System.out.println("\n");
		

////////EMP SATCK CODE
		
		EmpStack eStack = new EmpStack(5);
		Emp [] arr = new Emp[5];
		
		Scanner sc = new Scanner(System.in);
		for(int j=0 ;j<5; j++) {
			System.out.println("Enter Emp id, name and sal");
			
			int id= sc.nextInt();
			String name = sc.next();
			double sal = sc.nextDouble();
			
			arr[j] = new Emp(id,name,sal);
			eStack.push(arr[j]);
		}
		sc.close();
		eStack.display();
//		
		
		
		
		
		
//////////BALANCE parenthesis
		
		 String []sample = {"({[{}]})", "({[]}()())",
				 			"({[]}", "({[]}}"};
		 
		 for(int k=0; k<sample.length; k++) {
			 
			 String temp = sample[k];
			 
			 if(isBalance(temp))
				 System.out.println("balance");
			 else
				 System.out.println("not balanace");
			 
		 }

	}
}
