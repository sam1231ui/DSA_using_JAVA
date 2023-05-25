package assign.graph;

 
 

public class Gnode {
	int [][]vertex;
	IntNode []v;
	int []arr;
	
	 
	
	// size of graph
	public Gnode(int size ) {
		vertex = new int[size][size];
		arr = new int[size];
		v = new IntNode[size];
		
		for(int i=0; i<size; i++)
			v[i] = new IntNode(i);
	}
	 
	
	// adding data into graph using array
	public void addNode(int index, int data) {
		
		 vertex[index][data]  = 1;
		 
		 vertex[data][index] = 1;
	}
	
	// add data into graph of list
	public void addNodeList(int index, int data) {
		
		IntNode move = v[index];
		IntNode temp = new IntNode(data);
		
		while(move.next != null)
			move = move.next;
		
		move.next = temp;
		
		move = v[data];
		temp = new IntNode(index);
		
		while(move.next != null)
			move = move.next;
		
		move.next = temp;
	}
	
	
	
	
	
	
	
	
	// dfs on list graph
	public void dfsList(int i) {
	 
		 if(v[i] != null) {
			 
			 IntNode temp = v[i];
			 
			 while(temp != null) {
				 
				 if(arr[temp.data] != 1) {
					 System.out.print(temp.data + " ");
					 arr[temp.data] = 1;
					 
					 dfsList(temp.data);
				 }
				 temp = temp.next;
			 }
		 }
	}
	
	
	// dfs on array
	public void dfs(int start) {
		
		System.out.print(start + " ");
		arr[start] = 1;
		
		for(int i=0; i<vertex.length; i++) {
			 
			if(vertex[start][i] == 1 && arr[i] != 1) {
				dfs(i);
			}
		}
		 
		
	}
	
	// to make array back to 0
	public void visit() {
		for(int i=0; i<vertex.length; i++)
			arr[i] = 0;
	}
	
	
	
	
	
	
	// BFS on array
	public void bfs(int i) {
		
		 NodeQ q = new NodeQ();
		 
		 q.enQ(i);
		 
		 while(!q.isEmpty()) {
			 
			 int k = q.deQ();
			 if(arr[k] != 1) {
				 System.out.print(k + " ");
				 arr[k] = 1;
				 
				 for(int j=0; j<vertex.length; j++) {
					 if(vertex[k][j] == 1)
						 q.enQ(j);
				 }
			 }
		 }
		return;
	}
	
	
	
	
	
	
	
	
	
	
	// display graph of array
	public void showGraph() {
		 
		for(int i=0; i<vertex.length; i++) {
			System.out.print(i + " - " );
			int count = 0;
			for(int j=0; j<vertex[i].length; j++) {
				if(vertex[i][j] == 1) {
					System.out.print(j + " ");
					count++;
				}
			}
			System.out.println("degree : " + count);
		}
	}
	
	// display graph of list
	
	//display link list graph
	public void display() {
		
		for(int i=0; i<arr.length; i++) {
			IntNode move = v[i];
			System.out.print(v[i].data + " - ");
			move = move.next;
			while(move != null) {
				System.out.print(move.data + " ");
				move = move.next;
			}
			System.out.println();
		}
	}
	

}
