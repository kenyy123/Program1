package ds_exercise;

import java.util.Stack;

public class TreeBSTPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree02BSTtoDLL2 tree = new Tree02BSTtoDLL2();
		
		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        
//        inOrder(tree.root);
//        preOrder(tree.root);
//        postOrder(tree.root);
        
        InorderTraversal(tree.root);
//        MorrisInorderTraversal(tree.root);        
        
	}
	

	public class DoublyListNode {
	      int val;
	      DoublyListNode next, prev;
	      DoublyListNode(int val) {
	          this.val = val;
	          this.next = this.prev = null;
	      }
    }
	
	TreeNode root;
	
	public static void inOrder(TreeNode root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.data + "-> ");
			inOrder(root.right);
		}
	}
	
	public static void preOrder(TreeNode root)
	{
		if(root != null)
		{
			System.out.print(root.data + "-> ");
			inOrder(root.left);			
			inOrder(root.right);
		}
	}
	
	
	public static void postOrder(TreeNode root)
	{
		if(root != null)
		{
			inOrder(root.left);
			inOrder(root.right);
			System.out.print(root.data + "-> ");
			
		}
	}
	
	
	/////////////////////////
	public static void InorderTraversal(TreeNode root){
		
		Stack<TreeNode> stack = new Stack<TreeNode>();		
		TreeNode cur = root;
		
		while(true){
			//go to left most node while pushing nodes along the way
			if(cur != null){
				stack.push(cur);
				cur = cur.left;
			}
			else{
				//backtrack
				if(!stack.isEmpty()){
					cur = stack.pop();
					System.out.print(cur.data+"-> ");
					cur = cur.right;
				}
				else{
					return;//done
				}
			}
		}
	}
	
	
	public static void MorrisInorderTraversal(TreeNode root){
		if(root == null){
			return;
		}
		
		TreeNode cur = root;
		TreeNode pre = null;
		while(cur != null){
			//if no left subtree the visit right subtree right away after printing current node
			if(cur.left == null){
				System.out.print(cur.data+", ");
				cur = cur.right;
			}
			else{
				//otherwise we will traverse the left subtree and come back to current 
				//node by using threaded pointer from predecessor of current node 
				//first find the predecessor of cur
				pre = cur.left;
				while(pre.right != null && pre.right != cur){
					pre = pre.right;
				}
				
				//threaded pointer not added - add it and go to left subtree to traverse
				if(pre.right == null){
					pre.right = cur;
					cur = cur.left;
				}
				else{
					//we traversed left subtree through threaded pointer and reached cur again
					//so revert the threaded pointer and print out current node before traversing right subtree
					pre.right = null;
					System.out.print(cur.data+", ");
					//now traverse right subtree
					cur = cur.right;
				}
			}
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
	
	public static void print1(TreeNode node)
	{	
		while(node != null)
		{
			System.out.print(node.data + " -> ");
			node = node.right;			
		}
		System.out.print( "null ");
	}
	
	
	public static TreeNode bstToSLL(TreeNode root){		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		TreeNode head =  null;
		TreeNode iterator = null;
		
		while(true){
			if(cur != null){
				stack.push(cur);
				cur = cur.left;
			}
			else{
				if(stack.isEmpty()){
					return head;
				}
				else{
					cur = stack.pop();
					if(head == null){
						head = cur;
						iterator = head;
					}
					else if(iterator != null){
						iterator.right = cur;
						iterator = iterator.right; 
					}
					cur = cur.right;
				}
			}
		}
	}

}
