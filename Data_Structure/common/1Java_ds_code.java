









============================
============================
���

��ƪ������Ҫ����δ���������������������Щ���Եĵط���ָ������ӭ�����ͽ��顣

Ҫ��

���Ľ�����һ�µļ������

ʲô�Ƕ��������
����������ı���
��������
����������Ķ���

һ��������������Ϊ�����������Ҫ�������������� 
��1��������ڵ�����������գ��������������н���ֵ��С�ڻ�������ĸ�����ֵ�� 
��2��������ڵ����������Ϊ�գ��������������нڵ��ֵ�����ڻ���ڸ��ڵ��ֵ�� 
��3������ڵ����������Ҳ�ֱ�Ϊ�����������

��ͼ��ʾΪһ�ö�������� 
����дͼƬ����

����������ı���

����������ı�������ͨ�Ķ���������û�б����ϵ�����

��1��������������� ��-������-������ ��˳������� 
��2��������������� ������-��-������ ��˳������� 
��3��������������� ������-������-�� ��˳�����

��������

�������飺{20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150} ��Ϊ�ڵ��ϵ�ֵ����δ����Լ���������������أ����Ǵ˴�������ڵ��ֵΪ20������ѡ������һ��ֵ��Ϊ���ڵ�ֵ����

public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void addNode(int num) {
        if (num < this.val) {
            if (this.left != null) {
                this.left.addNode(num);
            } else {
                this.left = new TreeNode(num);
            }
            return;
        }

        if (this.right != null) {
            this.right.addNode(num);
        } else {
            this.right = new TreeNode(num);
        }
        return;
    }
    // Visit the node first, then left and right sub-trees
    public void traversePreOrder() {
        System.out.println(this.val);
        if (this.left != null) {
            this.left.traversePreOrder();
        }
        if (this.right != null) {
            this.right.traversePreOrder();
        }
    }

    // Visit left sub-tree, then node and then, right sub-tree
    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.println(this.val);
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }

    // Visit left sub-tree, then right sub-tree and then the node
    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.println(this.val);
    }
}


======================
======================

BubbleSort



public  bubbleSort(){  
     int a[]={49,38,65,97,76,13,27,49,78,34};  
    int temp=0;  
    for(int i=0;i<a.length-1;i++){  
        for(int j=0;j<a.length-1-i;j++){  
        if(a[j]>a[j+1]){  
            temp=a[j];  
            a[j]=a[j+1];  
            a[j+1]=temp;  
        }  
        }  
    }  
    for(int i=0;i<a.length;i++)  
        System.out.println(a[i]);     
   }  	
}

=========

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
	        //��array.length - 1�ֱȽ�     
	        for (int k = 1; k < end - from + 1; k++) {     
	            //ÿ��ѭ���д����һ��Ԫ�ؿ�ʼ��ǰ���ݣ�ֱ��i=kֹ����i�����ִ�ֹ     
	            for (int i = end - from; i >= k; i--) {     
	                //����һ�ֹ��򣨺���Ԫ�ز���С��ǰ��Ԫ�أ�����     
	                if ((array[i].compareTo(array[i - 1])) < 0) {     
	                    //�������Ԫ��С���ˣ���Ȼ�Ǵ��ڻ���С��Ҫ���Ƚ���ʵ���ˣ�ǰ���Ԫ�أ���ǰ�󽻻�     
	                    swap(array, i, i - 1); 
//	                    System.out.println("i: " +  array[i]);
	                }     
	            }     
	        }    
	   }
	 
	 public static void swap(Integer[] array, int i, int j) {     
	        if (i != j) {//ֻ�в���ͬһλ��ʱ���轻��     
	            Integer tmp = array[i];     
	            array[i] = array[j];     
	            array[j] = tmp;     
	        }     
	    }     
}

======

package dsSort;

import java.sql.Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("per_person_names_f_v".toUpperCase());
		Integer[] c= new Integer[]{6,7,8,4,5};
		bubble(c, 0, 4);
		for(int i = 0; i<c.length; i++){
			System.out.println("i: " +  c[i]);		
		}
		  int[] array={1,3,2,45,65,33,12};
	        bubble1(array);
	        for(int num:array){
	            System.out.print(num+" ");
	        }
	}
	
	        
	 public static void bubble(Integer[] array, int from, int end) {     
	        //��array.length - 1�ֱȽ�     
	        for (int k = 1; k < end - from + 1; k++) {     
	            //ÿ��ѭ���д����һ��Ԫ�ؿ�ʼ��ǰ���ݣ�ֱ��i=kֹ����i�����ִ�ֹ     
	            for (int i = end - from; i >= k; i--) {     
	                //����һ�ֹ��򣨺���Ԫ�ز���С��ǰ��Ԫ�أ�����     
	                if ((array[i].compareTo(array[i - 1])) < 0) {     
	                    //�������Ԫ��С���ˣ���Ȼ�Ǵ��ڻ���С��Ҫ���Ƚ���ʵ���ˣ�ǰ���Ԫ�أ���ǰ�󽻻�     
	                    swap(array, i, i - 1); 
//	                    System.out.println("i: " +  array[i]);
	                }     
	            }     
	        }    
	   }
	 
	 public static void swap(Integer[] array, int i, int j) {     
	        if (i != j) {//ֻ�в���ͬһλ��ʱ���轻��     
	            Integer tmp = array[i];     
	            array[i] = array[j];     
	            array[j] = tmp;   
	        }     
	 }
	 
	 public static void bubble1(int[] array) { 
		        //ѡ��������Ż�
		        for(int a = 0; a < array.length - 1; a++) {// ����i������
		            int k = a;
		            for(int  b= k + 1; b < array.length; b++){// ѡ��С�ļ�¼
		                if(array[b] < array[k]){ 
		                    k = b; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
		                }
		            }
		            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
		            if(a != k){  //����a[i]��a[k]
		                int temp = array[a];
		                array[a] = array[k];
		                array[k] = temp;
		            }    
		        }
		        System.out.println();
		        System.out.println("������");
		        for(int num:array){
		            System.out.print(num+" ");
		        }
		    }
	    
	
		
}

==========================


package dsSort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
	        insertionSort(a);
	        for (int i : a)
	            System.out.print(i + " ");
	}
	
	public static void insertionSort(int[] a) {
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

}

=======================

package dsSort;

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
		        int index = i; // ����������Сֵ������
		 
		        // Ѱ�ҵ�i��С����ֵ
		        for (int j = i + 1; j < list.length; j++) {
		            if (list[index] > list[j]) {
		                index = j;
		            }
		        }
		 
		        // ���ҵ��ĵ�i��С����ֵ���ڵ�i��λ����
		        temp = list[index];
		        list[index] = list[i];
		        list[i] = temp;
		 
		        System.out.println(list[index]);
//		        System.out.println("�� %d ��:\t", i + 1);
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

===========================




