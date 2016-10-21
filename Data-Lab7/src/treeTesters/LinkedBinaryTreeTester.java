package treeTesters;

import positionInterfaces.Tree;
import positionTree.BTNode;
import positionTree.LinkedBinaryTree;
import positionTree.LinkedBinaryTreePostOI;

public class LinkedBinaryTreeTester {

	public static void main(String[] args) {
		LinkedBinaryTree<Integer> t1 = new LinkedBinaryTree<Integer>(); 
		BTNode<Integer> v; 
		
		v = (BTNode<Integer>) t1.addRoot(4); 
		
		v = (BTNode<Integer>) t1.insertLeft(v, 9);
		t1.insertLeft(v, 7);
		t1.insertRight(v, 10);
		
		v = (BTNode<Integer>) t1.insertRight(t1.root(), 20);
		v = (BTNode<Integer>) t1.insertLeft(v, 15);
		t1.insertLeft(v, 12);
		v = (BTNode<Integer>) t1.insertRight(v, 17);
		t1.insertLeft(v, 19);

		v = (BTNode<Integer>) t1.insertRight(v.getParent().getParent(), 21);
		v = (BTNode<Integer>) t1.insertRight(v, 40);
		t1.insertLeft(v, 30);
		t1.insertRight(v, 45);

		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT THE SPECIFIED TREE...
		
		showTreeElements(t1); 
		
		t1.makeEmpty(); 
		showTreeElements(t1); 
		
		
		LinkedBinaryTreePostOI<Integer> t2 = new LinkedBinaryTreePostOI<Integer>(); 
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT A NEW COPY OF THE SPECIFIED TREE...
		for (Integer integer : t1) 
		{
			t2.attach(v, t1, t2);
		}
		showTreeElements(t2); 

	}
	
	/**
	 * Shows the elements in a particular tree based on the available
	 * iterator for the particular type of tree....
	 * @param t the tree to traverse...
	 */
	private static void showTreeElements(Tree<Integer> t) { 
		System.out.println("The tree has "+ t.size() + " elements. These are: "); 
		for (Integer e : t)
			System.out.print(e + " ");
		System.out.println(); 
	}

}
