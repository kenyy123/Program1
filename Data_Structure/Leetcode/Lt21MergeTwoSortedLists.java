package Leetcode;

import java.util.Iterator;
import java.util.LinkedList;

public class Lt21MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1  = new LinkedList<Integer>();
		LinkedList<Integer> l2  = new LinkedList<Integer>();
		l1.add(1);
		l1.add(3);
		l2.add(2);
		l2.add(4);
		
		LinkedList<Integer> l3  = mergeTwoLists(l1, l2);
//		Iterator i3 = l1.iterator();
		for(Iterator i3 = l1.iterator(); i3.hasNext();){
			int i4 = (int) i3.next();
			System.out.println(i4);
		}
	}
	
//	public class ListNode{
//		int val;
//		ListNode next;
//		ListNode(int x){
//			this.val = x;
//		}
//	}

	public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
       
        LinkedList<Integer> result = new LinkedList<Integer>();
//        LinkedList prev = result;
        Iterator i1 = l1.iterator();
        Iterator i2 = l2.iterator();
        
        
        while (i1.hasNext() && i2.hasNext()) {
//        	int ii1 = (int) i1.next();
//        	int ii2 = (int) i2.next();
        	
            if ((int) i1.next() <= (int) i2.next()) {
                result.add((int) i1.next());
                i1.next();
            } if((int) i1.next() > (int) i2.next())  {
            	 result.add((int) i2.next());
            	i2.next();
                
            }
        }
             
            return result;  
    }
	
}
