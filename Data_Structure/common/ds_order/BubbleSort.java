package dsSort;

import java.sql.Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("per_person_names_f_v".toUpperCase());
		Integer[] a = new Integer[]{6,7,8,4,5};
		bubble(a, 0, 4);
		for(int i = 0; i<a.length; i++){
			System.out.println("i: " +  a[i]);
		}
	}
	
	 public static void bubble(Integer[] array, int from, int end) {     
	        //需array.length - 1轮比较     
	        for (int k = 1; k < end - from + 1; k++) {     
	            //每轮循环中从最后一个元素开始向前起泡，直到i=k止，即i等于轮次止     
	            for (int i = end - from; i >= k; i--) {     
	                //按照一种规则（后面元素不能小于前面元素）排序     
	                if ((array[i].compareTo(array[i - 1])) < 0) {     
	                    //如果后面元素小于了（当然是大于还是小于要看比较器实现了）前面的元素，则前后交换     
	                    swap(array, i, i - 1); 
//	                    System.out.println("i: " +  array[i]);
	                }     
	            }     
	        }    
	   }
	 
	 public static void swap(Integer[] array, int i, int j) {     
	        if (i != j) {//只有不是同一位置时才需交换     
	            Integer tmp = array[i];     
	            array[i] = array[j];     
	            array[j] = tmp;     
	        }     
	    }     
}
