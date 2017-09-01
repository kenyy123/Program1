package ds_order;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimpleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stuby
//		ArrayList a = new ArrayList();
//		a.add(1);
//		a.add(1);
//		a.add(1);
//		a.add(1);
//		a.add(1);
	
		int[] list = {1,2,6,5,4,3};
		
		selectionSort(list);
		
		selectSort1();
	    }
	
	
	
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
		        int temp = 0;
		        int index = i; // 用来保存最小值得索引
		 
		        // 寻找第i个小的数值
		        for (int j = i + 1; j < list.length; j++) {
		            if (list[index] > list[j]) {
		                index = j;
		            }
		        }
		 
		        // 将找到的第i个小的数值放在第i个位置上
		        temp = list[index];
		        list[index] = list[i];
		        list[i] = temp;
		 
		        System.out.println(list[index]);
//		        System.out.println("第 %d 趟:\t", i + 1);
//		        printAll(list);
		 }
	}
	
	
	 public static void selectSort1(){  
		  
	       int a[]={1,54,6,3,78,34,12,45};  
	  
	       int position=0;  
	  
	       for(int i=0;i<a.length;i++){  
	  
	             
	  
	           int j=i+1;  
	  
	           position=i;  
	  
	           int temp=a[i];  
	  
	           for(;j<a.length;j++){  
	  
	           if(a[j]<temp){  
	  
	              temp=a[j];  
	  
	              position=j;  
	  
	           }  
	  
	           }  
	  
	           a[position]=a[i];  
	  
	           a[i]=temp;  
	  
	       }  
	  
	       for(int i=0;i<a.length;i++)  
	  
	           System.out.println(a[i]);  
	  
	    }  

}
