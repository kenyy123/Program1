package ds_stack;

import javax.xml.soap.Node;

public class Stack1LinkStack<E> {
	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		System.out.println("Hello World!");
	}

	private class LinkList<E>{
		E e;
		LinkList<E> next;
		
		public LinkList(){};
		
		public LinkList(E e, LinkList next){
			this.e = e;
			this.next = next;
			
		}	
	}
	 	 
	private LinkList<E> top;
	private int size = -1;
	
	public boolean isEmpty(){
		return size==-1 ? true : false;
	}


}
