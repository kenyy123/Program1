package Leetcode;

import java.util.Arrays;

/*Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 ¡ú 1,3,2
3,2,1 ¡ú 1,2,3
1,1,5 ¡ú 1,5,1*/

public class Lt31NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,5};
//	    int[] b = new int[]{1,2,3};
		nextPermutation(a);
//		for (int x : a){
//			System.out.println(x);
//		}
		
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void nextPermutation(int[] num) {
	    for(int i = num.length-1; i > 1; i--) {
	        if(num[i-1] < num[i]) {
//	            Arrays.sort(num, i, num.length);
	        	swap(num, i-1, i);
	            for(int j = i; j < num.length; j++) {
	                if(num[j] > num[i-1]) {
	                   // swap num[i-1] and num[j]
	                    num[i-1] = num[i-1] + num[j];
	                    num[j] = num[i-1] - num[j];
	                    num[i-1] = num[i-1] - num[j];
	                    return;
	                }
	            }
	        }
//	        for (int x : num){
//				System.out.println(x);
//			}
	    }
//	    Arrays.sort(num);
//	    return num;
//	    for (int x : num){
//			System.out.println(x);
//		}
	    
//	    for (int i=0; i<num.length; i++){
//			System.out.println(num[i]);
//		}	   
	
	}
	
//	public static void swap(int a, int b){
//	    int tmp = a;
//	    a =  b;
//	    b = tmp;
//	 }
		 
	 public static void swap(int[] num, int i, int j){
		    int tmp = num[i];
		    num[i] =  num[j];
		    num[j] = tmp;
		 }

}
