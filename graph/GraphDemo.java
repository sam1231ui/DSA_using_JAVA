package assign.graph;

 

public class GraphDemo {
	
	public static void main(String[] args) {
		
		Gnode g  = new Gnode(6);
		
		g.addNode(0, 1);
		g.addNode(1, 2);
		g.addNode(1, 3);
		g.addNode(2, 4);
		g.addNode(3, 5);
		g.addNode(3, 4);
		g.addNode(4, 5);
		 
		g.showGraph();
		
		g.dfs(5); // dfs on array
		System.out.println();
		g.visit();
		
		
		g.bfs(5); // bfs on array
		g.visit();
		System.out.println();
		
		
		
		// demo of same but with using list
		Gnode g1 = new Gnode(6);
		
		g1.addNodeList(0, 1);
		g1.addNodeList(1, 2);
		g1.addNodeList(1, 3);
		g1.addNodeList(2, 4);
		g1.addNodeList(3, 4);
		g1.addNodeList(3, 5);
		g1.addNodeList(4, 5);
		
		
		g1.display();
		
		// dfsList calls
		g1.dfsList(0);
		g1.visit();
		System.out.println();
		
		g1.dfsList(5);
		g1.visit();

			
	}

}
