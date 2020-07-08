package org.geeksforgeeks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.geeksforgeeks.BinaryTree.BinaryTreeNode;

public class LevelOrderTreeTraversal {

	public static void main(String[] args) {
		System.out.println("LevelOrderTraversalBinaryTree");
		
		Character foundShot = 'a';
		
		// Build tree
		BinaryTree tree = new BinaryTree();
		
		BinaryTree.BinaryTreeNode f = tree.new BinaryTreeNode(350);
		BinaryTree.BinaryTreeNode e = tree.new BinaryTreeNode(75);
		BinaryTree.BinaryTreeNode d = tree.new BinaryTreeNode(25);
		BinaryTree.BinaryTreeNode c = tree.new BinaryTreeNode(200);
		BinaryTree.BinaryTreeNode b = tree.new BinaryTreeNode(50);
		BinaryTree.BinaryTreeNode a = tree.new BinaryTreeNode(100);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		tree.root = a;
		
		// bfs
		System.out.println("bfs");
		printBfs(tree);
		System.out.println("");
		System.out.println("");
		
		// level order traversal
		System.out.println("bfs level order traversal");
		printLevelOrderTraversal(tree);
		System.out.println("");
		
		// dfs
		System.out.println("dfs preorder iterative and recursive");
		printDfsPreorderTraversalIterative(tree);
		System.out.println("");
		printDfsPreorderTraversalRecursive(tree.root);
		System.out.println("");
		System.out.println("");
		
		System.out.println("dfs inorder iterative and recursive");
		printDfsInorderTraversalIterative(tree);
		System.out.println("");
		printDfsInorderTraversalRecursive(tree.root);
		System.out.println("");
		System.out.println("");
		
		System.out.println("dfs postorder iterative and recursive");
		printDfsPostorderTraversalIterative(tree);
		System.out.println("");
		printDfsPostorderTraversalRecursive(tree.root);
		System.out.println("");
		System.out.println("");
	}

	/**
	 * BFS searching near the root first
	 * @param tree
	 * https://medium.com/basecs/breaking-down-breadth-first-search-cebe696709d9
	 */
	public static void printBfs(BinaryTree tree){
		// Verify there exists a root node
		if(tree.root.equals(null))
		{
			return;
		}
		
		// Create queue and push root node
		Queue<BinaryTree.BinaryTreeNode> queue = new LinkedList<BinaryTree.BinaryTreeNode>();
		queue.add(tree.root);
		
		// Search queue until its empty
		while(!queue.isEmpty())
		{
			// Refer to current node at top of queue
			// Remove current node from queue
			BinaryTree.BinaryTreeNode current = queue.remove();
			System.out.print(current.value+" ");
			
			// Consume children and add to queue
			if(current.left != null)
			{
				queue.add(current.left);
			}
			if(current.right != null)
			{
				queue.add(current.right);
			}
			
		}
	}
	
	public static void printLevelOrderTraversal(BinaryTree tree){
		// Verify there exists a root node
		if(tree.root.equals(null))
		{
			return;
		}
		
		// Create two queues, current and next, and push root node
		Queue<BinaryTree.BinaryTreeNode> queue1 = new LinkedList<BinaryTree.BinaryTreeNode>();
		Queue<BinaryTree.BinaryTreeNode> queue2 = new LinkedList<BinaryTree.BinaryTreeNode>();
		Queue<BinaryTree.BinaryTreeNode> temp = new LinkedList<BinaryTree.BinaryTreeNode>();
		queue1.add(tree.root);
		
		// Maintain a level increment
		int level = 0;
		
		// Search queue until its empty
		while(!queue1.isEmpty())
		{
			// Refer to current node at top of queue
			// Remove current node from queue
			BinaryTree.BinaryTreeNode current = queue1.remove();
			System.out.print(current.value+" ");
			
			// Consume children and add to next queue
			if(current.left != null)
			{
				queue2.add(current.left);
			}
			if(current.right != null)
			{
				queue2.add(current.right);
			}
			
			if(queue1.isEmpty()){
				System.out.print("\n");
				level++;
				temp = queue1;
				queue1 = queue2;
				queue2 = temp;
			}
		}
	}
	/**
	 * DFS searches near the leaves first
	 * Recursive
Preorder (DLR): Read the data of the node, then visit the left subtree/nodes, followed by the right subtree/nodes.
Inorder (LDR): Visit the left subtree/nodes, then read the data of the node, and finally visit the right subtree/nodes.
Postorder (LRD): Visit the left subtree/nodes, then visit the right subtree/nodes, and finally read the data of the node.
https://medium.com/basecs/demystifying-depth-first-search-a7c14cccf056
https://www.baeldung.com/java-depth-first-search
	 */
	public static void printDfsPreorderTraversalIterative(BinaryTree tree){
		// Verify there exists a root node
		if(tree.root.equals(null))
		{
			return;
		}
		
		// Create queue and push root node
		Stack<BinaryTree.BinaryTreeNode> stack = new Stack<BinaryTree.BinaryTreeNode>();
		stack.push(tree.root);
		
		// Search queue until its empty
		while(!stack.isEmpty())
		{
			// Refer to current node at top of queue
			// Remove current node from queue
			BinaryTree.BinaryTreeNode current = stack.pop();
			System.out.print(current.value+" ");
			
			// Consume children and add to queue, right to left
			if(current.right != null)
			{
				stack.push(current.right);
			}
			if(current.left != null)
			{
				stack.push(current.left);
			}
			
		}
	}
	
	public static void printDfsPreorderTraversalRecursive(BinaryTree.BinaryTreeNode tree){
		if(tree != null)
		{
			System.out.print(tree.value+" ");
			printDfsPreorderTraversalRecursive(tree.left);
			printDfsPreorderTraversalRecursive(tree.right);
			return;
		}
	}
	
	public static void printDfsInorderTraversalRecursive(BinaryTree.BinaryTreeNode node){
		if(node != null)
		{
			printDfsInorderTraversalRecursive(node.left);
			System.out.print(node.value+" ");
			printDfsInorderTraversalRecursive(node.right);
			return;
		}
	}
	
	public static void printDfsInorderTraversalIterative(BinaryTree tree){
		// Create stack and push root node
		Stack<BinaryTree.BinaryTreeNode> stack = new Stack<BinaryTree.BinaryTreeNode>();
		BinaryTree.BinaryTreeNode current = tree.root;
		stack.push(current);
		
		// Search queue until its empty
		while(!stack.isEmpty())
		{
			//Keep pushing left child onto stack, till we reach current node's left-most child
			while(current.left != null)
			{
				current = current.left;
				stack.push(current);
			}
			// Refer to current node at top of queue
			// Remove current node from queue
			current = stack.pop();
			System.out.print(current.value+" ");
			
			// Push right child onto stack
			if(current.right != null)
			{
				current = current.right;
				stack.push(current);
			}
			
		}
	}
	
	public static void printDfsPostorderTraversalRecursive(BinaryTree.BinaryTreeNode node){
		if(node != null)
		{
			printDfsInorderTraversalRecursive(node.left);
			printDfsInorderTraversalRecursive(node.right);
			System.out.print(node.value+" ");
			return;
		}
	}
	
	public static void printDfsPostorderTraversalIterative(BinaryTree tree){
		// Create stack and push root node
		Stack<BinaryTree.BinaryTreeNode> stack = new Stack<BinaryTree.BinaryTreeNode>();
		BinaryTree.BinaryTreeNode prev = tree.root;
		BinaryTree.BinaryTreeNode current = tree.root;
		stack.push(current);
		
		// Search queue until its empty
		while(!stack.isEmpty())
		{
			current = stack.peek();
			boolean hasChild = (current.left != null || current.right != null);
			boolean isPrevLastChild = (prev == current.right || 
			          (prev == current.left && current.right == null));
			
			if (!hasChild || isPrevLastChild) {
				// Refer to current node at top of queue
				// Remove current node from queue
				current = stack.pop();
				System.out.print(current.value+" ");
				prev = current;
			} else {
				if(current.right != null)
				{
					stack.push(current.right);
				}
				if(current.left != null)
				{
					stack.push(current.left);
				}
			}
			
		}
	}
}
