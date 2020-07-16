package problem_014;

import java.util.ArrayList;

/**
 * Problem 14
 * 07/15/2020
 * 8 minutes since 9:10pm
 * @author arianekrumel
 *
 */
public class LatticePoints {
	
	LatticePointsNode root;
	static int paths = 0;
	
	public LatticePoints(LatticePointsNode r)
	{
		this.root = r;
	}
	
	public class LatticePointsNode {
		public LatticePointsNode down;
		public LatticePointsNode right;
		public String name;
		
		public LatticePointsNode(LatticePointsNode d, LatticePointsNode r, String n)
		{
			this.down = d;
			this.right = r;
			this.name = n;
		}
		
		public void print()
		{
			System.out.println("("
					+ ((down != null) ? down.name : null) + ", "
					+ ((right != null) ? right.name : null) + ", "
					+ name 
					+")");
		}
	}

	public static void main(String[] args) {
		LatticePoints tree = new LatticePoints(null);
		ArrayList<ArrayList<LatticePointsNode>> col = new ArrayList<ArrayList<LatticePointsNode>>();
		int limit = 20; //3;
		for(int i = limit; i>0; i--)
		{
			ArrayList<LatticePointsNode> row = new ArrayList<LatticePointsNode>();
			for(int j = limit; j>0; j--)
			{
				LatticePointsNode x = tree.new LatticePointsNode(null, null, j+":"+i);
				row.add(x);
				
				// Starting on second iterations, add right/ down nodes
				if(j<limit){
					x.right = row.get(limit-j-1);
				}
				if(i<limit){
					x.down = col.get(col.size()-1).get(limit-j);
				}
				x.print();
			}
			col.add(row);
		}
		tree.root = col.get(limit-1).get(limit-1);
		/*
		LatticePointsNode c3 = tree.new LatticePointsNode(null, null, "c3");	
		LatticePointsNode b3 = tree.new LatticePointsNode(null, c3, "b3");	
		LatticePointsNode a3 = tree.new LatticePointsNode(null, b3, "a3");	
		LatticePointsNode c2 = tree.new LatticePointsNode(c3, null, "c2");	
		LatticePointsNode b2 = tree.new LatticePointsNode(b3, c2, "b2");	
		LatticePointsNode a2 = tree.new LatticePointsNode(a3, b2, "a2");	
		LatticePointsNode c1 = tree.new LatticePointsNode(c2, null, "c1");	
		LatticePointsNode b1 = tree.new LatticePointsNode(b2, c1, "b1");	
		LatticePointsNode a1 = tree.new LatticePointsNode(a2, b1, "a1");	
		tree.root = a1;
		*/
		
		searchRightOrDown(tree.root, new ArrayList<String>());
		System.out.println(paths);
	}
	
	public static void searchRightOrDown(LatticePointsNode root, ArrayList<String> path){
		path.add(root.name);
		
		// found last node, increment count and print path
		if(root.right == null && root.down == null)
		{
			paths += 1;
			System.out.println(path.toString());
		}
		if(root.right != null)
		{
			searchRightOrDown(root.right, path);
		}
		if(root.down != null)
		{
			searchRightOrDown(root.down, path);
		}
	}

}
