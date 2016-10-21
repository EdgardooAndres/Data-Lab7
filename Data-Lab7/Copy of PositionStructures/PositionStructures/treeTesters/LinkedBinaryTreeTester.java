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
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT THE SPECIFIED TREE...
		
		showTreeElements(t1); 
		
		t1.makeEmpty(); 
		showTreeElements(t1); 
		
		
		/**
		
		LinkedBinaryTreePOI<Integer> t2 = new LinkedBinaryTreePOI<Integer>(); 
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT A NEW COPY OF THE SPECIFIED TREE...

		showTreeElements(t2); 

		**/
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
