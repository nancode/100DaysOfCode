package CTCI;
// DFS using stack internally

// 1.if root is null --> return
// 2.visit the true and change status 
// 3.visit adjacent nodes

public class DFS {

	
	public static void main(String args[]) {
		myNode n5 = new myNode(5);
		myNode n4 = new myNode(4);
		myNode n1 = new myNode(1);
		myNode n2 = new myNode(2);
		myNode n3 = new myNode(3);
		
		myNode[] adjacents1 = {n3,n2};
		n1.adjacent = adjacents1;
		
		myNode[] adjacents2 = {n5,n4};
		n2.adjacent = adjacents2;
		
		myNode[] adjacents3 = {n2};
		n3.adjacent = adjacents3;
		
		myNode[] adjacents5 = {n4};
		n5.adjacent = adjacents5;
		
		myNode[] graphNodes = {n1,n2,n3,n4,n5};
		Graph g = new Graph(graphNodes);
		
		g.search(n1);
		
	}
}

class myNode{
	boolean visited = false;
	myNode[] adjacent;
	int value;
	
	myNode(int value){
		value = this.value;
	}
}

class Graph{
	myNode[] myNodes;
	String name;
	Graph(myNode[] myNodes){
		myNodes = this.myNodes;
	}
	

	void search(myNode root) {
		//if root is null --> return
		if(root == null)
			return;
		
		//visit the true and change status 
		root.visited = true;
		System.out.println("Visiting the node " + root.value);
		
		//visit adjacent nodes
		for(myNode n: root.adjacent) {
			if(root.visited != true) {
				System.out.println("Going to visit " + root.value);
				search(root);
			}
			else {
				System.out.println("Already visited " + root.value);
			}
		}
	}
}