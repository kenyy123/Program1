package ds_queue;

import java.util.Queue;

public class Queue4QueueList<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 private Queue<E> queue = (Queue<E>) new Queue4QueueList<E>();
	    
	    // ��ָ����Ԫ�ز���˶��У�������������Ҳ���Υ���������ƣ����ڳɹ�ʱ���� true��
	    //�����ǰû�п��õĿռ䣬���׳� IllegalStateException��
	    public boolean add(E e){
	        return queue.add(e);
	    }
	    
	    //��ȡ�����ǲ��Ƴ��˶��е�ͷ��
	    public E element(){
	        return queue.element();
	    }
	    
	    //��ָ����Ԫ�ز���˶��У�������������Ҳ���Υ���������ƣ�����ʹ�����������ƵĶ���ʱ��
	    //�˷���ͨ��Ҫ���� add(E)�����߿����޷�����Ԫ�أ���ֻ���׳�һ���쳣��
	    public boolean offer(E e){
	        return queue.offer(e);
	    }
	    
	    //��ȡ�����Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null
	    public E peek(){
	        return queue.peek();
	    }
	    
	    //��ȡ���Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null
	    public E poll(){
	        return queue.poll();
	    }
	    
	    //��ȡ���Ƴ��˶��е�ͷ
	    public E remove(){
	        return queue.remove();
	    }
	    
	    //�п�
	    public boolean empty() {
	        return queue.isEmpty();
	    }

}
