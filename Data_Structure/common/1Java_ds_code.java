









============================
============================
简介

这篇文章主要讲如何创建二叉查找树。如果有哪些不对的地方请指正，欢迎批评和建议。

要点

本文将依照一下的几点介绍

什么是二叉查找数
二叉查找树的遍历
代码例子
二叉查找树的定义

一个二叉树如果想成为二叉查找树需要满足以下条件： 
（1）若任意节点的左子树不空，则左子树上所有结点的值均小于或等于它的根结点的值； 
（2）若任意节点的右子树不为空，则右子树上所有节点的值均大于或等于根节点的值； 
（3）任意节点的左、右子树也分别为二叉查找树。

下图所示为一棵二叉查找树 
这里写图片描述

二叉查找树的遍历

二叉查找树的遍历和普通的二叉树遍历没有本质上的区别。

（1）先序遍历：按照 根-左子树-右子树 的顺序遍历； 
（2）中序遍历：按照 左子树-根-右子树 的顺序遍历； 
（3）后序遍历：按照 左子树-右子树-根 的顺序遍历

代码例子

给出数组：{20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150} 作为节点上的值，如何创建以及遍历二叉查找数呢？我们此处假设根节点的值为20（可以选择任意一个值作为根节点值）。

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
	 
	 public static void bubble1(int[] array) { 
		        //选择排序的优化
		        for(int a = 0; a < array.length - 1; a++) {// 做第i趟排序
		            int k = a;
		            for(int  b= k + 1; b < array.length; b++){// 选最小的记录
		                if(array[b] < array[k]){ 
		                    k = b; //记下目前找到的最小值所在的位置
		                }
		            }
		            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
		            if(a != k){  //交换a[i]和a[k]
		                int temp = array[a];
		                array[a] = array[k];
		                array[k] = temp;
		            }    
		        }
		        System.out.println();
		        System.out.println("交换后：");
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

===========================




