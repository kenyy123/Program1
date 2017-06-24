package ds_stack;

import java.io.Serializable;

public class Stack2<T> implements StackInterface<T>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int top = -1;
	private int capacity=10;
	
	private T[] array;

    private int size;
    
    public Stack2(int capacity){
    	array = (T[]) new Object[capacity];
    }

    public Stack2(){
    	array = (T[]) new Object[this.capacity];
    }
    
    public  int size(){
        return size;
    }

    
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.top == -1;
	}

	@Override
	public void push(T data) {
		// TODO Auto-generated method stub
		array[++top]=data;
        size++;
	}
	
	 @Override
	public T pop() {
		// TODO Auto-generated method stub
		 if(isEmpty())
		        new Exception();
		size--;
		return array[top--];
	}

	public static void main(String[] args){
	        Stack2<String> s = new Stack2<String>();
//	        s.push("A");
//	        s.push("B");
//	        s.push("C");
	        s.push("A");
	        s.push("B");
	        s.push("C");
	        System.out.println("size->"+s.size());
	        int l = s.size();//size 在减少,必须先记录
	        for (int i=0;i<l;i++){
	            System.out.println("s.pop->"+s.pop());
	        }

//	        System.out.println("s.peek->"+s.peek());
	    }	

}
