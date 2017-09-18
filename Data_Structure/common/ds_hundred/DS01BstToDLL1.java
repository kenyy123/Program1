package ds_hundred;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class DS01BstToDLL1 {

	public Node root;
	public DS01BstToDLL1()
	{ root = null; }
	public Node returnRoot()
	{
		return root;
	}
	
	// 'head' - reference to head node of created
    //double linked list
    Node head;
 
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
	          root=avlInsert(newNode, root);	
	          }
     }  // end insert()

   
	  
	  public Node avlInsert(Node newNode, Node par)
	   {
	   Node newpar = par;  // root of subtree par
	   if (newNode.data < par.data)
	   {
	     if (par.leftChild == null)
	       {

	         par.leftChild = newNode;  //attach new node as leaf

	       }
	     else {

	         par.leftChild = avlInsert(newNode, par.leftChild);   // branch left

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

	           par.rightChild = avlInsert(newNode, par.rightChild);  // branch right

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
	
	
//	public static Node bstToDLL(Node root){
//		if(root == null){
//			return null;
//		}
//		
//		//convert left subtree to DLL and connect last node (=predecessor of current root) to current root 
//		if(root.leftChild != null){
//			//convert left subtree
//			Node left = bstToDLL(root.leftChild);
//			
//			//find last node of the left DLL
//			while(left.rightChild != null){
//				left = left.rightChild;
//			}
//			
//			//connect left DLL to root
//			left.rightChild = root;
//			root.leftChild = left;
//		}
//		//convert right subtree to DLL and connect root to the first node (=successor of current root)
//		if(root.rightChild != null){
//			//convert left subtree
//			Node right = bstToDLL(root.rightChild);
//			
//			//find first node of the right DLL
//			while(right.rightChild != null){
//				right = right.leftChild;
//			}
//			
//			//connect left DLL to root
//			right.leftChild = root;
//			root.rightChild = right;
//		}
//		
//		return root;
//		
//	}
	
 // Utility function for printing double linked list.
//    public static void printList(Node head) 
//    {
//        System.out.println("Extracted Double Linked List is : ");
//        while (head != null) 
//        {
//            System.out.print(head.data + " ");
////            head = head;
//        }
//    }
 
	private static class PreviousDLLNode{
		DLLNode val;
	 }
	
    private static DLLNode convert(Node t){
    	DLLNode d =convert(t,new PreviousDLLNode());
        while(d.prev!=null){
            d = d.prev;
        }
        return d;
    }
    private static DLLNode convert(Node t, PreviousDLLNode d){
        if(t==null) return null;
        convert(t.leftChild,d);
        DLLNode dn = new DLLNode(t.data);
        if(d.val!=null){
            d.val.setNext(dn);
        }
        dn.setPrev(d.val);
        d.val = dn;
        convert(t.rightChild,d);
        return dn; // this node will be in the middle of the dll.    }
   
    } 
	
  
    public DoublyListNode bstToDoublyList(Node root) {  
        if (root == null) {
            return null;
        }
        //Init stack
        Stack stack = new Stack();
        
        Node node = root;    
        stack.push(node);
        //Create DoublyListNode header
        DoublyListNode dummy = new DoublyListNode(0);
        DoublyListNode dNode = dummy;
        
            
        while(!stack.isEmpty()) {
            while (node != null && node.leftChild != null) {
                stack.push(node.leftChild);
                node = node.leftChild;
            }
            //add node
            node = stack.pop();
            DoublyListNode curr = new DoublyListNode(node.data);
            dNode.next = curr;
            curr.prev = dNode;
            dNode = dNode.next;
            
            //check right node and add to stack
            node = node.rightChild;
            if (node != null) {
                stack.push(node);
            }  
        }
        
        return dummy.next;
        
    }
    
	
	public static void main(String[] args) throws IOException
	{
		int value;
		DS01BstToDLL1 theTree = new DS01BstToDLL1();
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
		
//		Node root = null;
//		theTree.root = Node(5);
//		Node head = bstToDLL(theTree.root);
////		theTree.displayTree();
//		printList(head);
		
		
		DLLNode dll = convert(theTree.root);
        dll.print();
        System.out.println();
        
        DoublyListNode d1 = theTree.bstToDoublyList(theTree.root);
		d1.print();
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
		public Node data;
		public StackNode next;
		public StackNode(Node val)
		{
			data = val;
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
			return temp.data;
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
	
	public class DoublyListNode {
	     int val;
	     DoublyListNode prev;
	     DoublyListNode next;
	     DoublyListNode(int val) {
	         this.val = val;
	         this.prev = null;
	         this.next = null;
	     }
	     
	     public void print() {
	    	 DoublyListNode tmpNode = this;

	         while (tmpNode != null) {
	             System.out.print(tmpNode.val + " -> ");
	             tmpNode = tmpNode.next;
	         }

	         System.out.print("null");
	 }
	}
	
	  static class DLLNode{
	        int data;
	        DLLNode next;
	        DLLNode prev;
	 
	        public DLLNode(int data) {
	            this.data = data;
	        }
	        public DLLNode() {
	        }
	        public int getData() {
	            return data;
	        }
	        public DLLNode getPrev() {
	            return prev;
	        }
	        public void setPrev(DLLNode prev) {
	            this.prev = prev;
	        }
	 
	        public void setData(int data) {
	            this.data = data;
	        }
	        public DLLNode getNext() {
	            return next;
	        }
	        public void setNext(DLLNode next) {
	            this.next = next;
	        }
	        public void print(){
	        	DLLNode t = this;
	            while(t!=null){
	                System.out.print(t.getData()+"->");
	                t = t.getNext();
	            }
	        }
	    }
	  
//	  public class DLLNode {
//		    int data;
//		    DoublyListNode next, prev;
//		    DLLNode(int val) {
//		        this.data = val;
//		        this.next = this.prev = null;
//		   }
//	  }

}
