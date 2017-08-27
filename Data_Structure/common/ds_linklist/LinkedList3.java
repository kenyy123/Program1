package ds_linklist;
 
public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public class Node1{
    	int data;
    	Node1 next;
    	public Node1(int data){
    		this.data = data;
    	}
    }
    
    public Node1 head;
    private int pos = 0;
    public LinkedList3(){
    	this.head = null;
    }
    
    public void addHead(int data){
    	Node1 n1 = new Node1(data);
    	n1.next = head;
    	head = n1;    	
    }
    
    public Node1 removeHead(){
    	Node1 tmp = head;
    	head = head.next;
    	return head;
    }
    
    
    public void addRear(int data){
    	Node1 p = head;
    	Node1 node = new Node1(data);
    	if(p == null){
    		node.next = head;
    	    head = node;
    	}else{
    		while(p != null){
    			p = p.next;
    		}
    		node.next = p.next;
    		p.next = node;
    	}
    } 
    
    public void addSite(int index, int data){
    	
    } 
    
}
