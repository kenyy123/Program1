package ds_mshundred;

import java.awt.List;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;


public class Ds01ListToBSTree {

	public Node root;
	
//	public Ds01ListToBSTree()
//	{ root = null; }
	
	public Node returnRoot()
	{
		return root;
	}
	
	
	public void insert(int id)
	{	  
		Node newNode = new Node();
		newNode.item = id;
		if(root==null)
			root = newNode;
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				if(id < current.item)
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				} 
				else
				{
					current = current.rightChild;
					if(current == null) 
					{
						parent.rightChild = newNode;
						return;
					}
				} 
			} 
		} 
	} 
	
	public void preOrder(Node Root)
	{
		if(Root != null)
		{	
			System.out.print(Root.item + " ");
			preOrder(Root.leftChild);
			preOrder(Root.rightChild);
		}
	}
	public void inOrder(Node Root)
	{
		if(Root != null)
		{
			inOrder(Root.leftChild);
			System.out.print(Root.item + " ");
			inOrder(Root.rightChild);
		}
	}
	public void postOrder(Node Root)
	{
		if(Root != null)
		{
			postOrder(Root.leftChild);
			postOrder(Root.rightChild);
			System.out.print(Root.item + " ");
		}
	}
	
	public void byLevel(Node root){
		 Queue<Node> level	= new LinkedList<>();
		 level.add(root);
		 
		 while(!level.isEmpty()){
			 Node node = level.poll();
			 System.out.print(node.item + " ");
			 if(node.leftChild!= null)
			 level.add(node.leftChild);
			 if(node.rightChild!= null)
			 level.add(node.rightChild);
		 }
	}
	
	public void displayTree()
	{
		Stack globalStack = new Stack();
		globalStack.push(root);	
		int emptyLeaf = 32;
		boolean isRowEmpty = false;
		System.out.println("****......................................................****");
		while(isRowEmpty==false)
		{

			Stack localStack = new Stack();
			isRowEmpty = true;
			for(int j=0; j<emptyLeaf; j++)
				System.out.print(' ');
			while(globalStack.isEmpty()==false)
			{
				Node temp = globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.item);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild != null ||temp.rightChild != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<emptyLeaf*2-2; j++)
					System.out.print(' ');
			}
			System.out.println();
			emptyLeaf /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push( localStack.pop() );
		}
	System.out.println("****......................................................****");
	} 
	
	
	
	public static void main(String[] args) throws IOException
	{
		int value;
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);       
        
        Ds01ListToBSTree tree = new Ds01ListToBSTree();
       
        for (int lll: ll) {  
            tree.insert(lll);
        } 
        
        
		System.out.println("Displaying the tree");
		tree.displayTree();

//		System.out.println("Inorder traversal");
//		theTree.inOrder(theTree.returnRoot());
//		System.out.println(" ");
//
//		System.out.println("Preorder traversal");
//		theTree.preOrder(theTree.returnRoot());
//		System.out.println(" ");
//			
//		System.out.println("Postorder traversal");
//		theTree.postOrder(theTree.returnRoot());
//		System.out.println(" ");
//		
//		System.out.println("By Level");
//		theTree.byLevel(theTree.returnRoot());
//		System.out.println(" ");
		
//		Ds01ListToBSTree list = new Ds01ListToBSTree();
		
		
		
		
	} 
	
	class Node
	{
		public int item;
		public Node leftChild;
		public Node rightChild;
		
		public void displayNode()
		{
			System.out.print("[");
			System.out.print(item);
			System.out.print("]");
		}
	}
	class StackNode
	{
		public Node item;
		public StackNode next;
		public StackNode(Node val)
		{
			item = val;
		}

	}
	class LinkedListStack
	{
		private StackNode first;
		public LinkedListStack()
		{
			first = null;
		}
		public boolean isEmpty()
		{
			return (first==null);
		}
		public void insert(Node key)//inserts at beginning of list
		{
			StackNode newLLNode = new StackNode(key);
			newLLNode.next = first;
			first = newLLNode;
		}
		public Node delete()//deletes at beginning of list
		{
			StackNode temp = first;
			first = first.next;
			return temp.item;
		}
	}
	class Stack
	{
		private LinkedListStack list;
		public Stack()
		{
			list = new LinkedListStack();
		}
		public void push(Node num)
		{
			list.insert(num);
		}
		public Node pop()
		{
			return list.delete();
		}
		public boolean isEmpty()
		{
			return list.isEmpty();
		}
	}
	
//	public class ListNode{
//		int data;
//		ListNode prev;
//		ListNode next;
//		
//		public ListNode(int data){
//			this.data = data;
//		    this.prev = null;
//		    this.next = null;
//		}
//	}
//	
//	public ListNode head;
//    public int pos = 0;
//	
//	public Ds01ListToBSTree(){
//		this.head = null;
//	}
	
	//////////////////////
	int data;
	Ds01ListToBSTree prev;
	Ds01ListToBSTree next;
	
	public Ds01ListToBSTree head;
    public int pos = 0;
	
	public Ds01ListToBSTree(){
		this.head = null;
	}
	
	public Ds01ListToBSTree(int data){
		this.data = data;
	    this.prev = null;
	    this.next = null;
	}
	

}
