package Leetcode;

import java.util.Iterator;
import java.util.LinkedList;

public class Lt21MergeTwoSortedLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l1 = {1,3};
		int[] l2 = {2,4};
		LinkedList<Integer> l3  = mergeTwoLists(l1, l2);
//		Iterator i3 = l1.iterator();
		for(Iterator i3 = l3.iterator(); i3.hasNext();){
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

	public static LinkedList<Integer> mergeTwoLists(int[] l1, int[] l2) {
       
//        int[] result = new int[]{};
	      LinkedList<Integer> result = new LinkedList<Integer>();
//        int i1 = l1[0];
//        int i2 = l2[0];
        int size1 = l1.length;
        int size2 = l2.length;
           
        for(int i1 = 0; i1<size1; i1++) {
        	for(int i2 = 0; i2<size2; i2++) {
            if (l1[i1] < l2[i2]) {
                result.add(l1[i1]);
                break;
            }  if (l1[i1] > l2[i2]) {
                result.add(l2[i2]);
               
            }
          } 
        }
             
            return result;  
    }
	
}
