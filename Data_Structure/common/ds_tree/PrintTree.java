package printTree;


public class PrintTree {
	
	public static class Node
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
	
	public static class StackNode
	{
		public Node item;
		public StackNode next;
		public StackNode(Node val)
		{
			item = val;
		}
	}
	
	public static class LinkedListStack
	{
		public StackNode first;
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
	
	public static class Stack
	{
		public LinkedListStack listObj;
		public Stack()
		{
			listObj = new LinkedListStack();
		}
		public void push(Node num)
		{
			listObj.insert(num);
		}
		public Node pop()
		{
			return listObj.delete();
		}
		public boolean isEmpty()
		{
			return listObj.isEmpty();
		}
	}
	
	public static void displayTree(Node root)
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
	
}
