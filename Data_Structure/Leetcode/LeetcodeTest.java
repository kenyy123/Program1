package Leetcode;

public class LeetcodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,5,4,3};
		int[] aa1 = {2,2,2,2,2};
//		int a1 = removeDuplicates2a(a);
//		System.out.println(a1);
		
		int a2 = removeElement(aa1, 2);
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
   
   public static int removeElement3(int[] A, int elem) {
	   int len = A.length;    
	   for(int i = 0; i < A.length; i++){	       
	       if(A[i] == elem && i<=len){
	           A[i] = A[--len];
	       }
	   }
	   return len;
   }
   
   
   ////////////////////////
	/*28. Implement strStr()
	Implement strStr().
	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 	
    */

   public int strStr(String haystack, String needle) {
	   for (int i = 0; ; i++) {
	     for (int j = 0; ; j++) {
	       if (j == needle.length()) return i;
	       if (i + j == haystack.length()) return -1;
	       if (needle.charAt(j) != haystack.charAt(i + j)) break;
	     }
	   }
	 }
   
   

	    public int strStr1(String haystack, String needle) {
	        int l1 = haystack.length(), l2 = needle.length();
	        if (l1 < l2) {
	            return -1;
	        } else if (l2 == 0) {
	            return 0;
	        }
	        int threshold = l1 - l2;
	        for (int i = 0; i <= threshold; ++i) {
	            if (haystack.substring(i,i+l2).equals(needle)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public int strStr2(String s, String t) {
	        if (t.isEmpty()) return 0; // edge case: "",""=>0  "a",""=>0
	        for (int i = 0; i <= s.length() - t.length(); i++) {
	            for (int j = 0; j < t.length() && s.charAt(i + j) == t.charAt(j); j++)
	                if (j == t.length() - 1) return i;
	        }
	        return -1;
	    }
	    
   //////////////////////////////
  /*  29. Divide Two Integer
    Divide two integers without using multiplication, division and mod operator.
    If it is overflow, return MAX_INT. 	*/    
	    public int divide(int dividend, int divisor) {
	    	//Reduce the problem to positive long integer to make it easier.
	    	//Use long to avoid integer overflow cases.
	    	int sign = 1;
	    	if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
	    		sign = -1;
	    	long ldividend = Math.abs((long) dividend);
	    	long ldivisor = Math.abs((long) divisor);
	    	
	    	//Take care the edge cases.
	    	if (ldivisor == 0) return Integer.MAX_VALUE;
	    	if ((ldividend == 0) || (ldividend < ldivisor))	return 0;
	    	
	    	long lans = ldivide(ldividend, ldivisor);
	    	
	    	int ans;
	    	if (lans > Integer.MAX_VALUE){ //Handle overflow.
	    		ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
	    	} else {
	    		ans = (int) (sign * lans);
	    	}
	    	return ans;
	    }

	    private long ldivide(long ldividend, long ldivisor) {
	    	// Recursion exit condition
	    	if (ldividend < ldivisor) return 0;
	    	
	    	//  Find the largest multiple so that (divisor * multiple <= dividend), 
	    	//  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
	    	//  Think this as a binary search.
	    	long sum = ldivisor;
	    	long multiple = 1;
	    	while ((sum+sum) <= ldividend) {
	    		sum += sum;
	    		multiple += multiple;
	    	}
	    	//Look for additional value for the multiple from the reminder (dividend - sum) recursively.
	    	return multiple + ldivide(ldividend - sum, ldivisor);
	    }
	    
	    
	 
	    
	  ////// 29 ////////////////////////    
        public int divide1(int dividend, int divisor) {
    		if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
            if(dividend > 0 && divisor > 0) return divideHelper(-dividend, -divisor);
            else if(dividend > 0) return -divideHelper(-dividend,divisor);
            else if(divisor > 0) return -divideHelper(dividend,-divisor);
            else return divideHelper(dividend, divisor);
        }
        
        private int divideHelper(int dividend, int divisor){
            // base case
            if(divisor < dividend) return 0;
            // get highest digit of divisor
            int cur = 0, res = 0;
            while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) cur++;
            res = dividend - (divisor << cur-1);
            if(res > divisor) return 1 << cur-1;
            return (1 << cur-1)+divide(res, divisor);
        }
	    
        ////// 29 ////////////////////////    
        public int divide2(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }

            if (dividend > 0 && divisor > 0) {
                return divideHelper2(-dividend, -divisor);
            } else if (dividend > 0) {
                return -divideHelper2(-dividend, divisor);
            }
            else if(divisor > 0) {
                return -divideHelper2(dividend, -divisor);
            }
            else {
                return divideHelper2(dividend, divisor);
            }
        }


        private int divideHelper2(int dividend, int divisor) {
            int result = 0;
            int currentDivisor = divisor;
            while(true) {
                if(dividend > divisor) {
                    break;
                }
                int temp = 1;
                while(dividend <= currentDivisor << 1 && currentDivisor << 1 < 0) {
                    temp = temp << 1;
                    currentDivisor = currentDivisor << 1;
                }
                dividend -= currentDivisor;
                result += temp;
                currentDivisor = divisor;
            }
            return result;
        }
        
        
        
        
        
   

}
