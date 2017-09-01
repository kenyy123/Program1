package ds_tree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNode {
	
		public int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int x){
			this.val = x;
		}
		
		public String toString(){
		        return Integer.toString(val);
		    }
	

//	    int []arr = {3, 9, 20, Integer.MAX_VALUE, Integer.MAX_VALUE, 15, 7};
	    private static int[] StrToIntArray(String str) {
	        str = str.substring(1, str.length() - 1);
	        String []strs = str.split(",");
	        int []arr = new int[strs.length];

	        for (int i = 0; i < arr.length; i++) {
	            if (strs[i].equals("null")) {
	                arr[i] = Integer.MAX_VALUE;
	            } else {
	                arr[i] = Integer.parseInt(strs[i]);
	            }
	        }

	        return arr;
	    }

//	    String str = "[3,9,20,null,null,15,7]";
	    public static TreeNode mkTree(String str) {
	        int []arr = StrToIntArray(str);
	        TreeNode []nodes = new TreeNode[arr.length + 1];
	        for (int i = 1; i < nodes.length; i++) {
	            if (arr[i - 1] != Integer.MAX_VALUE) {
	                nodes[i] = new TreeNode(arr[i - 1]);
	            }else {
	                nodes[i] = null;
	            }
	        }

	        TreeNode node = null;
	        for (int i = 1; i < nodes.length / 2; i++) {
	            node = nodes[i];
	            if (node == null) continue;
	            node.left = nodes[2 * i];
	            node.right = nodes[2 * i + 1];
	        }
	        return nodes[1];
	    }
	
	
	
//    private TreeNode root;// ���ڵ�
//  
//    public BinaryTree1()
//     {
//    }
	    
	    public ArrayList<Integer> preorderTraversal(TreeNode root) {
	        ArrayList<Integer> returnList = new ArrayList<Integer>();
	 
	        if(root == null)
	            return returnList;
	 
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        stack.push(root);
	 
	        while(!stack.empty()){
	            TreeNode n = stack.pop();
	            returnList.add(n.val);
	 
	            if(n.right != null){
	                stack.push(n.right);
	            }
	            if(n.left != null){
	                stack.push(n.left);
	            }
	 
	        }
	        return returnList;
	    }
    
}
