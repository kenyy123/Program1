package ds_stack;

public class Stack1SequenceStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		System.out.println("Hello World!");
	}
	
	/**
	 * 基于数组实现的顺序栈
	 * @param <E>
	 */
	public class Stack<E> {
	    private Object[] data = null;
	    private int maxSize=0;   //栈容量
	    private int top =-1;  //栈顶指针
	    
	    /**
	     * 构造函数：根据给定的size初始化栈
	     */
	    Stack(){
	        this(10);   //默认栈大小为10
	    }
	    
	    Stack(int initialSize){
	        if(initialSize >=0){
	            this.maxSize = initialSize;
	            data = new Object[initialSize];
	            top = -1;
	        }else{
	            throw new RuntimeException("初始化大小不能小于0：" + initialSize);
	        }
	    }  
	    
	    
	    
	 	    
	}
	
//	 public class Stack1<T>{
//	    	private Object[] data = null;
//	    	private int maxSize = 0;
//	    	private int top = -1;
//	    	
//	    	public Stack1(int initializeSize){
//	    		if (initializeSize >= 0){
//	    			this.maxSize = initializeSize;
//	    			data = new Object[initializeSize];
//	    			top = -1;
//	    		}else{
//	    			throw new RuntimeException();
//	    		}
//	    	}
//	    	
//	    	public Stack1(){
//	    		this(10);
//	    	}
//	    	
	    	    	
//	    }
	

}
