package assign;


public class MyArray {
	
	
	// display of arrays 
	public static void display(int []arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// contains method
	public static boolean contains(int []arr, int k) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == k)
				return true;
		}
		return false;
	}
	
	// search method
	public static int search(int[] arr, int k) {
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] == k)
				return i;
		}
		return -1;
	}
	
	// reverse array
	public static void reverse(int []arr) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	  
	public static void main(String []args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter size for array");
//		
//		int n = sc.nextInt();
//		int []arr = new int[n];
//		
//		
//		System.out.println("Enter the elements ");
//		
//		for(int i=0; i<n; i++) {
//			
//			arr[i] = sc.nextInt();
//		}
		
		int []sample = {1,2,3,4,5,6,7,8};
		
		System.out.println(search(sample,5)+ " is element pos");;
		
		reverse(sample);
		
		display(sample);
		
		
		
	}
}
