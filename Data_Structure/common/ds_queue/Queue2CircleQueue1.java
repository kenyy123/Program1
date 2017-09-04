package ds_queue;

import java.util.Arrays;

public class Queue2CircleQueue1<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public Object[] data = null;
	    private int maxSize; // ��������
	    private int rear;// ����β���������
	    private int front;// ����ͷ������ɾ��
	    private int size=0; //���е�ǰ����

	    public Queue2CircleQueue1() {
	        this(10);
	    }

	    public Queue2CircleQueue1(int initialSize) {
	        if (initialSize >= 0) {
	            this.maxSize = initialSize;
	            data = new Object[initialSize];
	            front = rear = 0;
	        } else {
	            throw new RuntimeException("��ʼ����С����С��0��" + initialSize);
	        }
	    }

	    // �п�
	    public boolean empty() {
	        return size == 0;
	    }

	    // ����
	    public boolean add(E e) {
	        if (size == maxSize) {
	            throw new RuntimeException("�����������޷������µ�Ԫ�أ�");
	        } else {
	            data[rear] = e;
	            rear = (rear + 1)%maxSize;
	            size ++;
	            return true;
	        }
	    }

	    // ���ض���Ԫ�أ�����ɾ��
	    public E peek() {
	        if (empty()) {
	            throw new RuntimeException("�ն����쳣��");
	        } else {
	            return (E) data[front];
	        }
	    }

	    // ����
	    public E poll() {
	        if (empty()) {
	            throw new RuntimeException("�ն����쳣��");
	        } else {
	            E value = (E) data[front]; // �������е�front�˵�Ԫ�ص�ֵ
	            data[front] = null; // �ͷŶ��е�front�˵�Ԫ��
	            front = (front+1)%maxSize;  //����ָ���1
	            size--;
	            return value;
	        }
	    }

	    // ���г���
	    public int length() {
	        return size;
	    }

	    //���ѭ������
	    public void clear(){
	        Arrays.fill(data, null);
	        size = 0;
	        front = 0;
	        rear = 0;
	    }
	

}
