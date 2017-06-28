package ds_queue;

import java.io.Serializable;

import ds_stack.StackInterface;

public class Queue2CircleQueue<E> implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2CircleQueue<String> q = new Queue2CircleQueue<String>(4);
		q.enqueue("1");
		q.enqueue("2");
		System.out.println(q.size);
		System.out.println(q.len());
		for (int i=0; i<=q.len(); i++){
			System.out.println(q.dequeue());
		}
	}
	
	E[] a;
	public static final int size = 10;
	
	public int front;
	public int rear;
	
//	public Queue2CircleQueue(){
//		this(size);
//	}
//	
//	public Queue2CircleQueue(E[] a){
//		this.a  = a;
//	}
	
	public Queue2CircleQueue(int size){
		a = (E[])(new Object[size]); 
		front = 0;
		rear = 0;
	}
	
    public boolean enqueue(E val){
    	if((rear+1)%a.length==front){
    		throw new RuntimeException();
    	}else{
    		a[rear] = val;
    		rear = (rear+1)%a.length;
    		return true;
    	}
    	
    }
    
    public E dequeue(){
    	 if(rear==front)  
             return null;  
         else{  
             E obj =a[front];  
             front=(front+1)%a.length;  
             return obj;  
         }  
    }
    
    public int len(){
    	return (rear-front)%(a.length-1);   	
    }

    public boolean isEmpty(){  
        return rear==front;  
    }  

}



