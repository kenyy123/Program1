package ds_exercise;

import java.util.Stack;

//http://www.zrzahid.com/
//http://www.zrzahid.com/transformflatten-binary-tree-tofrom-linked-list/

public class Tree02BSTtoDLL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree02BSTtoDLL3 tree = new Tree02BSTtoDLL3();
		
		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        
        LinkedListNode head = tree.bstToDLL(tree.root);
        tree.print(head);
	}
	
	TreeNode root;
	
	public class LinkedListNode{
		int val;
		LinkedListNode prev;
		LinkedListNode next;
		public LinkedListNode(int val){
			this.val = val;
			this.prev = null;
			this.next = null;
		}
	}
	
	public void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	public void print(LinkedListNode node){
		while(node != null){
			System.out.print(node.val + " -> ");
			node = node.next;
		}
	}
	
	public LinkedListNode bstToDLL(TreeNode root){
		if(root == null){
			return null;
		}
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        stack.push(node);
        
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode dNode = dummy;
        LinkedListNode curr;
        
        while(!stack.isEmpty()){
        	while(node != null && node.left != null){
        		stack.push(node.left);
        		node = node.left;
        	}
        	
        	node = stack.pop();
        	curr = new LinkedListNode(node.data);
        	
        	dNode.next = curr;
        	curr.prev = dNode;
        	dNode = dNode.next;   
        	
        	node = node.right;
        	if(node != null){
        		stack.push(node);
        	}
        }        
        return dummy.next;
	}
	
	
}
