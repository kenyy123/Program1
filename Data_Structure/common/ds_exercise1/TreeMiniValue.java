package ds_exercise1;

import java.util.Stack;

import ds_exercise.TreeNode;

public class TreeMiniValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMiniValue tree = new TreeMiniValue();
		
		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(8);
        
        int min = tree.getMinimumDifference(tree.root);
        System.out.println(min);
	}
	
	TreeNode root;
	
	 public int getMinimumDifference(TreeNode root) {
		 
		 int diff; 
	 	 int min = 10;
//	 		int min = Integer.MAX_VALUE;
 		if (root == null) {
 			return 0;
 		}

 		Stack<TreeNode> stack = new Stack<TreeNode>();
 		TreeNode current = root;
 		TreeNode node;
 		while (current != null) {
 			stack.push(current);
 			current = current.left;
 		}
 		while (!stack.isEmpty()) {
 			current = stack.pop();
 			if (!stack.isEmpty()) {
 				diff = Math.abs(stack.peek().data - current.data);
 				min = Math.min(diff, min);
 			}
 			node = current.right;
 			while (node != null) {
 				stack.push(node);
 				node = node.left;
 				if (!stack.isEmpty()) {
 					diff = Math.abs(stack.peek().data - current.data);
 					min = Math.min(diff, min);
 				}
 			}
 		}
 		return min;
     }
	 
	 

}
