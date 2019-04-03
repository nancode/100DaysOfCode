package CTCI;
//Given a binary search tree and a key, insert the key and find it
public class Node {
	Node left,right;
	int data;
	
	public Node(int data) {
		data = this.data;
		left = null;
		right =null;
	}
	
	public void insert(int d) {
		//if node value is less than value to be inserted
		if(d <= data) {
			//insert the value to the left of the node
			if(left == null)
				left = new Node(d);
			else
				left.insert(d);
		}
		//else insert the value into the right side
		else {
			//insert the value to the right of the node
			if(right == null)
				right = new Node(d);
			else
				right.insert(d);
		}
	}
	
	//checks if a value is present in the tree
	public boolean contains(int d) {
		// if value is the current node value
		if(d == data) {
			return true;
		}
		// if value is lesser than the current node value
		else if(d < data) {
			//if there is no more left nodes means the element is not in the tree
			if(left == null) {
				return false;
			}
			else{
				return left.contains(d);
			}
		}
		// if value is greater than the current node value
		else {
			if(right == null) {
				return false;
			}
			else {
				return right.contains(d);
			}
		}
	}
	
	// function to print a tree in in order traversal
	public void printInOrder() {
		// inorder traversal is to print the left, root, right.
		//print left
		if(left !=null) {
			left.printInOrder();
		}
		
		//print current
		System.out.println(data);
		
		//print right
		if(right != null) {
			right.printInOrder();
		}
		
	}
	
	public static void main(String args[]) {
		Node mine = new Node(2);
		mine.printInOrder();
		mine.insert(10);
		mine.printInOrder();
	}
}
