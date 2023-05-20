package assign.sorting;

public class Sort {
	
	// BUBBLE SORT
	public static int bubbleSort(int []arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; i<arr.length-j-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					count++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return count;
	}
	
	// Selection sort
	public static int selectSort(int []input){
		
		int count = 0;
		for(int i=0; i<input.length; i++){
			for(int j=i+1; j<input.length; j++){
				
				if(input[i] > input[j]){
					
					count++;
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			} 
		}
		return count;
	}
	public static int insertSort(int [] arr) {
		int count = 0;
		
		for(int i=1; i<arr.length; i++) {
			int j = i-1;
			int key = arr[i];
			
			while(j >=0 &&  arr[j] > key) {
				count++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key; 
		}
		return count;
	}
	
	
	//display 
	public static void display(int []arr) {
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		int []sample1 = {5,4,3,2,1,3};
		int []sample2 = {8,5,3,7,4,7};
		int []sample3 = {7,3,0,1,3,6};
		
		
		
		int c1 = bubbleSort(sample1);
		int c2 = selectSort(sample2);
		int c3 = insertSort(sample3);
		
		
		display(sample1);
		display(sample2);
		display(sample3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
	}
}
