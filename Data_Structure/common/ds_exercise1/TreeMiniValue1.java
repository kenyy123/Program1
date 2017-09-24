package ds_exercise1;

import java.util.Stack;

//http://www.zrzahid.com/
//http://www.zrzahid.com/transformflatten-binary-tree-tofrom-linked-list/

public class TreeMiniValue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMiniValue1 tree = new TreeMiniValue1();
		
		tree.root = new TreeNode(4);		 
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        
        LinkedListNode head = tree.bstToDLL(tree.root);
        tree.print(head);
        
        int len = tree.countNodes(head);
        int[] a = new int[len];
        int i= 0;
        while(head.next != null){        
        	a[++i] = head.val;
        	head = head.next;
        }
        
//        int len1 = a.length;
        int min = 10;
        int v;
        for(int j=1; j<len; j++){
        	v = Math.abs(a[i-1] -a[i]);
        	min = Math.min(min, v);
        }
        System.out.println(min);
        
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
	
	 /* UTILITY FUNCTIONS */
    /* A utility function that returns count of nodes in a 
       given Linked List */
    public int countNodes(LinkedListNode head) 
    {
        int count = 0;
        LinkedListNode temp = head;
        while (temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
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
	
//	public static int minValue(){
//		LinkedListNode head = tree.bstToDLL(tree.root);
//		
//		return 0;
//				
//	}
	
	
}
