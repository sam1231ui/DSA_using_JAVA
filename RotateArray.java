package assign;

public class RotateArray {
	
	// rotate array
	public static int [] rotate(int [] arr, int k) {
		
		int [] temp = new int[k];
		
		for(int i=0; i<arr.length; i++) {
			
			if(i < k) {
				temp[i] = arr[i];
			}else {
				arr[i-k] = arr[i];
			}
			
		}
		int j =1;
		for(int i=temp.length-1 ;i>=0; i--) {
			arr[arr.length-j] = temp[i];
			j++;
		}
		return arr;
	}
	
	// display array
	public static void display(int [] arr) {
		for(int i=0; i<arr.length; i++)
			System.err.print(arr[i] + " ");
	}
	
	// max element
	public static int max(int []arr) {
		int ans = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > ans)
				ans = arr[i];
		}
		return ans;
	}

	// even max and min
	public static void evenMaxMin(int [] arr) {
		
		int max = -1;
		int min;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max && arr[i]%2 == 0)
				max = arr[i];
		}
		min = max;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min && arr[i]%2 == 0)
				min = arr[i];
		}
		System.out.println("max even elemet is "+ max);
		System.out.println("min even elemet is "+ min);
	}
	
	// sum of all digits
	public static int sum(int []arr) {
		int ans =0;
		
		for(int i=0; i<arr.length; i++) {
			ans += arr[i];
		}
		return ans;
	}
	
	// duplicate in array
	public static void dupe(int []arr) {
		
		System.out.println("Dupe in array");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j])
					System.out.println(arr[i]);
			}
		}
	}
	
	
	public static void main(String []args) {
		
		int [] arr = {1,2,3,4,5,6,7,3,4,5};
		
		evenMaxMin(arr);
		System.out.println("Sum of array " + sum(arr));
		dupe(arr);
		
		
		
		
	}

}
