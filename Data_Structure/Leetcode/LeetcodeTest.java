package Leetcode;

public class LeetcodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,5,4,3};
//		int a1 = removeDuplicates2a(a);
//		System.out.println(a1);
		
		int a2 = removeElement(a, 2);
		System.out.println(a2);
	}
	
	
//	10
//	
//	Implement regular expression matching with support for '.' and '*'.
//
//	'.' Matches any single character.
//	'*' Matches zero or more of the preceding element.
//
//	The matching should cover the entire input string (not partial).
//
//	The function prototype should be:
//	bool isMatch(const char *s, const char *p)
//
//	Some examples:
//	isMatch("aa","a") ? false
//	isMatch("aa","aa") ? true
//	isMatch("aaa","aa") ? false
//	isMatch("aa", "a*") ? true
//	isMatch("aa", ".*") ? true
//	isMatch("ab", ".*") ? true
//	isMatch("aab", "c*a*b") ? true

//	1, If p.charAt(j) == s.charAt(i) :  dp[i][j] = dp[i-1][j-1];
//	2, If p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1];
//	3, If p.charAt(j) == '*': 
//	   here are two sub conditions:
//	               1   if p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2]  //in this case, a* only counts as empty
//	               2   if p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.':
//	                              dp[i][j] = dp[i-1][j]    //in this case, a* counts as multiple a 
//	                           or dp[i][j] = dp[i][j-1]   // in this case, a* counts as single a
//	                           or dp[i][j] = dp[i][j-2]   // in this case, a* counts as empty	
//	
	
//	This Solution use 2D DP. beat 90% solutions, very simple.

//	Here are some conditions to figure out, then the logic can be very straightforward.
	
	
   public boolean isMatch(String s, String p) {

	    if (s == null || p == null) {
	        return false;
	    }
	    boolean[][] dp = new boolean[s.length()+1][p.length()+1];
	    dp[0][0] = true;
	    for (int i = 0; i < p.length(); i++) {
	        if (p.charAt(i) == '*' && dp[0][i-1]) {
	            dp[0][i+1] = true;
	        }
	    }
	    for (int i = 0 ; i < s.length(); i++) {
	        for (int j = 0; j < p.length(); j++) {
	            if (p.charAt(j) == '.') {
	                dp[i+1][j+1] = dp[i][j];
	            }
	            if (p.charAt(j) == s.charAt(i)) {
	                dp[i+1][j+1] = dp[i][j];
	            }
	            if (p.charAt(j) == '*') {
	                if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.') {
	                    dp[i+1][j+1] = dp[i+1][j-1];
	                } else {
	                    dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
	                }
	            }
	        }
	    }
	    return dp[s.length()][p.length()];
	}   
   
   
   
   
////////////////// 
//   26. Remove Duplicates from Sorted Array 
  /* Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

		   Do not allocate extra space for another array, you must do this in place with constant memory.

		   For example,
		   Given input array nums = [1,1,2],

		   Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
		   It doesn't matter what you leave beyond the new length.
   */
   public int removeDuplicates(int[] A) {
	    if (A.length==0) return 0;
	    int j=0;
	    for (int i=0; i<A.length; i++)
	        if (A[i]!=A[j]) A[++j]=A[i];
	    return ++j;
	}
   

   public int removeDuplicates1(int[] nums)
   {
       int dupes = 0;
       
       for (int i = 1; i < nums.length; i++)
       {
           if (nums[i] == nums[i - 1])
               dupes++;
           
           nums[i - dupes] = nums[i];
       }
       
       return nums.length - dupes;
   }
  
   
   public static int removeDuplicates2(int[] nums) {
	    int i = 0;
	    for (int n : nums)
	        if (i == 0 || n > nums[i-1])
	            nums[i++] = n;
	    return i;
	}
   
   public static int removeDuplicates2a(int[] nums) {
	    int i = 1;
	    for (int n : nums)
	        if (n != nums[i-1])
	            nums[i++] = n;
	    return i;
	}
   
   public int removeDuplicates3(int[] nums) {
	    int i = nums.length > 0 ? 1 : 0;
	    for (int n : nums)
	        if (n > nums[i-1])
	            nums[i++] = n;
	    return i;
	}
   
   
   
   /////////////////////////
   /*27. Remove Element 
   Given an array and a value, remove all instances of that value in place and return the new length.

		   Do not allocate extra space for another array, you must do this in place with constant memory.

		   The order of elements can be changed. It doesn't matter what you leave beyond the new length.

		   Example:
		   Given input array nums = [3,2,2,3], val = 3

		   Your function should return length = 2, with the first two elements of nums being 2.
		   */
	
    
		   
   public static int removeElement(int[] nums, int val) {
       int len = 0;
       int i = 1;
       for(int a1 : nums){
    	   if(a1 != val ){
    		   len++;
    	    }
    	   }
        return len;
   }	   
   
   public int removeElement2(int[] A, int elem) {
	   int m = 0;    
	   for(int i = 0; i < A.length; i++){	       
	       if(A[i] != elem){
	           A[m] = A[i];
	           m++;
	       }
	   }
	   return m;
   }
   
   public int removeElement3(int[] A, int elem) {
	   int len = A.length;    
	   for(int i = 0; i < A.length; i++){	       
	       if(A[i] == elem && i<len){
	           A[i] = A[--len];
	       }
	   }
	   return len;
   }
   
   
   

}
