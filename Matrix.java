package assign;

public class Matrix {
	
	// fact method 
	public static int fact(int num) {
		
		int ans = 1;
		while(num != 0) {
			ans *= num;
			num--;
		}
		return ans;
	}
	
	// display
	public static void display(int [][]arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		
		
		int []arr1 = {1,2,3,4,5};
		int [][]arr2 = new int[5][3];
		
		
		// 1st column 
		for(int i=0; i<arr2.length; i++)
			arr2[i][0] = arr1[i];
//		
		// 2nd column 
		for(int i=0; i<arr2.length; i++)
			arr2[i][1] = fact(arr1[i]+1);
//		
//		
		// 3rd column
		for(int i=0; i<arr2.length; i++)
			arr2[i][2] = arr1[i] * arr1[i];
		
		// display 
		display(arr2);
	}

}
