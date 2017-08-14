package Leetcode;

public class Lt21MergeTwoSortedListsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub        
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
//        l2.next.next = new ListNode(5);
  	
        ListNode l3 = mergeTwoLists( l1,  l2);
        
        while(l3 != null){
        	System.out.println(l3.val);
        	l3 = l3.next;
        }
	}
	

	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        ListNode result = new ListNode(0);
        ListNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return result.next;
    }
	
}
