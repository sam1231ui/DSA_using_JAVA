package assign;

public class Prime_range {
	
///// check prime method
	public static boolean prime(int nums) {
		
		if(nums < 2)
			return false;
		
		int count = 0;
		
		for(int i=1; i<=nums; i++) {
			
			if(nums%i == 0) {
				count++;
			}
		}
		if(count == 2)
			return true;
		else
			return false;
	}
	
///// check arm strong num
	public static boolean armStrong(int nums) {
		
		int temp = nums;
		int digit = 0;
		
		while(temp > 0) {
			digit++;
			temp = temp/10;
		}
		
		temp = nums;
		int ans =0 ;
		while(temp > 0) {
			int rem = temp%10;
			//ans += (int) Math.pow(rem,digit);
			int power = 1;
			for(int i=0; i<digit; i++)
				power *= rem;
			
			ans += power;
			temp = temp/10;
		}
		
		if(ans == nums)
			return true;
		else
			return false;
			
	}
	
	
	
	
	
	
	public static void main(String []args) {
		
		// prime range loop
		int countp = 0;
		for(int i=1; i<=100; i++){
			if(prime(i)) {
				System.out.println(i);
				countp++;
			}
		}
		System.out.println("Total num of prime " + countp);
//////////////////////////////////////////////////////////////
	
		// Arm strong loop 
		int countA =0;
		for(int i=1; i<=10000; i++) {
			if(armStrong(i)) {
				System.out.println(i);
			}
		}
		System.out.println("Total num of Armstrong " + countA);
//////////////////////////////////////////////////////////////
		
		
		// Merge 2 separate arrays
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {11,22,33,44,55};
		
		int [] ans = new int[arr1.length+arr2.length];
		
		for(int i=0 ; i<ans.length; i++) {
			
			if(i >= arr1.length)
				ans[i] = arr2[i - arr1.length];
			else
				ans[i] = arr1[i];
		}
		
		for(int i=0 ;i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	
	

}
