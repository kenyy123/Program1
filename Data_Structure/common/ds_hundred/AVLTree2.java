package ds_mshundred;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class AVLTree2 {

	public Node root;
	public AVLTree2()
	{ 
		root = null; 
	}
	
	public Node returnRoot()
	{
		return root;
	}
	
//	public void insert(int id)
//	{
//		Node newNode = new Node();
//		newNode.item = id;
//		if(root==null)
//			root = newNode;
//		else
//		{
//			Node current = root;
//			Node parent;
//			while(true)
//			{
//				parent = current;
//				if(id < current.item)
//				{
//					current = current.leftChild;
//					if(current == null)
//					{
//						parent.leftChild = newNode;
//						return;
//					}
//				} 
//				else
//				{
//					current = current.rightChild;
//					if(current == null) 
//					{
//						parent.rightChild = newNode;
//						return;
//					}
//				} 
//			} 
//		} 
//	} 
	
//	public void insert(int id)
//	{
//		Node newNode = new Node();
//		newNode.item = id;
//		if(root==null)
//			root = newNode;
//		else
//		{
//			Node current = root;
//			Node parent;
//			while(true)
//			{
//				parent = current;
//				if(id < current.item)
//				{
//					current = current.leftChild;
//					if(current == null)
//					{
//						parent.leftChild = newNode;
//						return;
//					}
//					
//				} 
//				else
//				{
//					current = current.rightChild;
//					if(current == null) 
//					{
//						parent.rightChild = newNode;
//						return;
//					}
//				} 
//			} 
//		} 
//	} 
	
//	 public void insert(int data){
//			Node newNode = new Node();
//			newNode.item = data;
////			Node currentNode;
//			if(root == null){
//				root = newNode;
//				return;
//			}
//			else{
//				Node current= root;
//				Node parent;
//				
//				while (true){ 
//					parent = current;
//				if(data < current.item){
////					current = current.leftChild ;
////					if(current == null){
////						parent.leftChild =	newNode; 
////					  return;
////					}
////					
//					if(current.leftChild == null){
//						current.leftChild =	newNode; 
//						return;
//					}else{
//						current = current.leftChild;
//					}
//					
//												
//				}else{
////					current = current.rightChild;
////					if(current == null){
////						parent.rightChild = newNode;
////					  return;
////					}
//									
//					if(current.rightChild == null){
//						current.rightChild =	newNode; 
//						return;
//					}else{
//						current = current.rightChild;
//					}
//					
//				 }
//				}
//			}		
//		}
//	
	   public Node rotatewithleft(Node c)
	   {
	     Node p;  // left child of c

	     p = c.leftChild;
	     c.leftChild = p.rightChild;
	     p.rightChild = c;

	     c.height = Math.max(height(c.leftChild), height(c.rightChild)) + 1;
	     p.height = Math.max(height(p.leftChild), height(p.rightChild)) + 1;

	     return p;

	   }

	   public Node rotatewithright(Node c)
	   {

	     Node p;  // right child of c

	     p = c.rightChild;
	     c.rightChild = p.leftChild;
	     p.leftChild = c;

	     c.height = Math.max(height(c.leftChild), height(c.rightChild)) + 1;
	     p.height = Math.max(height(p.leftChild), height(p.rightChild)) + 1;

	     return p;

	   }

	   public Node doublerotatewithleft(Node c)
	   {

	     Node tmp;

	     c.leftChild = rotatewithright(c.leftChild);
	     tmp = rotatewithleft(c);

	     return tmp;

	   }

	   public Node doublerotatewithright(Node c)
	   {

	    Node tmp;

	    c.rightChild = rotatewithleft(c.rightChild);
	    tmp = rotatewithright(c);

	    return tmp;

	   }

	
	  public void insert(int data) // Recursive insert
      {
	      Node newNode = new Node(data);    // make new node	
	      if(root==null)
	            root = newNode;
	      else
	         {	
	          root=avlinsert(newNode, root);	
	          }
       }  // end insert()

     
	  
	  public Node avlinsert(Node newNode, Node par)
	   {
	   Node newpar = par;  // root of subtree par
	   if (newNode.data < par.data)
	   {
	     if (par.leftChild == null)
	       {

	         par.leftChild = newNode;  //attach new node as leaf

	       }
	     else {

	         par.leftChild = avlinsert(newNode, par.leftChild);   // branch left

	         if ((height(par.leftChild) - height(par.rightChild)) == 2) {

	            if (newNode.data < par.leftChild.data) {

	              newpar=rotatewithleft(par);

	            }
	            else {

	              newpar=doublerotatewithleft(par);

	            } //else
	         } //if
	      } // else
	   } // if

	   else if (newNode.data > par.data)  // branch right
	   {
	        if (par.rightChild == null)
	       {

	         par.rightChild = newNode;   // attach new node as leaf

	       }
	     else {

	           par.rightChild = avlinsert(newNode, par.rightChild);  // branch right

	           if ((height(par.rightChild) - height(par.leftChild)) == 2) {

	            if (newNode.data > par.rightChild.data) {

	              newpar=rotatewithright(par);


	            } //if
	            else {

	              newpar=doublerotatewithright(par);

	            } //else
	           } //if
	        } //else
	   }  // else if

	   else System.out.println("Duplicate Key");

	 // Update the height, just in case

	   if ((par.leftChild == null) && (par.rightChild != null))
	      par.height = par.rightChild.height + 1;
	   else if ((par.rightChild == null) && (par.leftChild != null))
	      par.height = par.leftChild.height + 1;
	   else
	      par.height = Math.max(height(par.leftChild), height(par.rightChild)) + 1;

	   return newpar; // return new root of this subtree

	 }  // end avlinsert

	  
	  public int height(Node x)  // return height of tree rooted at x
     {
      if (x == null) return -1;
         else return x.height;
     }  

	public void preOrder(Node Root)
	{
		if(Root != null)
		{	
			System.out.print(Root.data + " ");
			preOrder(Root.leftChild);
			preOrder(Root.rightChild);
		}
	}
	public void inOrder(Node Root)
	{
		if(Root != null)
		{
			inOrder(Root.leftChild);
			System.out.print(Root.data + " ");
			inOrder(Root.rightChild);
		}
	}
	public void postOrder(Node Root)
	{
		if(Root != null)
		{
			postOrder(Root.leftChild);
			postOrder(Root.rightChild);
			System.out.print(Root.data + " ");
		}
	}
	
	public void byLevel(Node root){
		 Queue<Node> level	= new LinkedList<>();
		 level.add(root);
		 
		 while(!level.isEmpty()){
			 Node node = level.poll();
			 System.out.print(node.data + " ");
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
					System.out.print(temp.data);
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
		AVLTree2 theTree = new AVLTree2();
//		theTree.insert(42);
//		theTree.insert(25);
//		theTree.insert(65);
//		theTree.insert(12);
//		theTree.insert(37);
//		theTree.insert(13);
//		theTree.insert(30);
//		theTree.insert(43);
//		theTree.insert(87);
//		theTree.insert(99);
//		theTree.insert(9);

//		theTree.insert(1);
//		theTree.insert(2);
//		theTree.insert(3);
//		theTree.insert(4);
//		theTree.insert(5);
		
		theTree.insert(5);
		theTree.insert(4);
		theTree.insert(3);
		theTree.insert(2);
		theTree.insert(1);
		
		System.out.println("Displaying the tree");
		theTree.displayTree();

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
	} 
	
	class Node
	{
		public int data;
		public int height;
		public Node leftChild;
		public Node rightChild;
		
		public Node(int data){
			this.data = data;			
		}
		
			
		public void displayNode()
		{
			System.out.print("[");
			System.out.print(data);
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

}
