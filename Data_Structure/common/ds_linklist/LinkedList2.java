package ds_linklist;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList2 list = new LinkedList2();  
         list.headInsert(1);  
         list.headInsert(2);  
         list.headInsert(3);  
         list.printNodes();
	}
	
	
	public class Node{
		int data;
		Node next;
	    
		public Node(int data){
			this.data = data;
		}
		
		public void printNode(){
			 System. out.print( data + " ");  
		}
	}
	
   
	public Node head;
	public int pos = 0;
	
	public LinkedList2(){
		this.head = null;
	}
	
	public Node headInsert(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
		
		return head;
	}
	
	
	public Node rearInsert(int data){
		Node p = head;
		Node node = new Node(data);
		
		if(p == null){
			node.next = head;
			head = node;
		}else{
			while(p.next != null){
				p = p.next;
			}
			node.next = p.next;
			p.next = node;
		}
		
		return head;
	}
	
	//Insert in index site
	public void add(int index, int data) {  
        Node node = new Node(data);  
        Node current = head;  
        Node previous = head;  
         while ( pos != index) {  
            previous = current;  
            current = current. next;  
             pos++;  
        }  
        node. next = current;  
        previous. next = node;  
         pos = 0;  
   }  
	
	 public void printNodes() {  
         Node current = head;  
          while (current != null) {  
        	 current.printNode(); 
             current = current. next; 
             System.out.println();
//             System.out.print("\n");
         }
         System.out.println();         
    }  
	 
	public Node deleteFirst(){
		Node tmp = head;
		head.next = head;
	    return tmp;
	}
	
	public Node findByData(int data){
		Node tmp = head;
		while(tmp.data != data){
			if(tmp.next == null){
				return null;
			}
			tmp = tmp.next;		
		}
		return tmp;
	}

}
