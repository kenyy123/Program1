package ds_stack;

public class Stack1SequenceStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		System.out.println("Hello World!");
	}
	
	/**
	 * ��������ʵ�ֵ�˳��ջ
	 * @param <E>
	 */
	public class Stack<E> {
	    private Object[] data = null;
	    private int maxSize=0;   //ջ����
	    private int top =-1;  //ջ��ָ��
	    
	    /**
	     * ���캯�������ݸ�����size��ʼ��ջ
	     */
	    Stack(){
	        this(10);   //Ĭ��ջ��СΪ10
	    }
	    
	    Stack(int initialSize){
	        if(initialSize >=0){
	            this.maxSize = initialSize;
	            data = new Object[initialSize];
	            top = -1;
	        }else{
	            throw new RuntimeException("��ʼ����С����С��0��" + initialSize);
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
