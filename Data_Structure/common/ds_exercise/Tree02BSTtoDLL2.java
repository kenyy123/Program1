package ds_exercise;

import java.util.Stack;

public class Tree02BSTtoDLL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree02BSTtoDLL2 tree = new Tree02BSTtoDLL2();
		
		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        tree.root.right.right = new TreeNode(8);
        
//        tree.inOrder(tree.root);
        
        DoublyListNode head = tree.bstToDLL(tree.root);
	    tree.print(head);
	}
	
	
//	public class TreeNode {
//	     public int node;
//	      public TreeNode left, right;
//	      public TreeNode(int node) {
//	          this.node = node;
//	          this.left = this.right = null;
//	   }
//	}
	
	
	TreeNode root;
	
	public class DoublyListNode {
	      int val;
	      DoublyListNode next, prev;
	      DoublyListNode(int val) {
	          this.val = val;
	          this.next = this.prev = null;
	      }
    }
	
	public void inOrder(TreeNode root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void print(DoublyListNode node)
	{	
		while(node != null)
		{			
			System.out.print(node.val + " -> ");	
			node = node.next;
		}
	}
	
	public DoublyListNode bstToDLL(TreeNode root){
		if (root == null) {
            return null;
        }
        //Init stack
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;    
        stack.push(node);
        //Create DoublyListNode header
        DoublyListNode dummy = new DoublyListNode(0);
        DoublyListNode dNode = dummy;
        DoublyListNode curr;
            
        while(!stack.isEmpty()) {
            while (node != null && node.left != null) {
                stack.push(node.left);
                node = node.left;
            }
            //add node
            node = stack.pop();
            curr = new DoublyListNode(node.data);
            
            dNode.next = curr;
            curr.prev = dNode;
            dNode = dNode.next;
            
            //check right node and add to stack
            node = node.right;
            if (node != null) {
                stack.push(node);
            } 
        }
//        while (dummy.leftChild != null) 
//        {
////            System.out.print(head.data + " ");
//            root = root.leftChild;
//        }
        return dummy.next;	
        		
	}
		    
}


