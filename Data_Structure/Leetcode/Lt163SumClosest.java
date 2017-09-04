package Leetcode;

import java.util.Arrays;

public class Lt163SumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public int threeSumClosest(int[] num, int target) {
	        int result = num[0] + num[1] + num[num.length - 1];
	        Arrays.sort(num);
	        
	        if (num.length <= 3) {
	            for (int i: num) {
	            	result += i;
	            }
	            return result;
	        }
	        
//	        I think it would be better to break early when sum==target.
	        for (int i = 0; i < num.length - 2; i++) {
	            int start = i + 1, end = num.length - 1;
	            while (start < end) {
	                int sum = num[i] + num[start] + num[end];
	                if (sum > target) {
	                    end--;
	                } else {
	                    start++;
	                }
	                if (Math.abs(sum - target) < Math.abs(result - target)) {
	                    result = sum;
	                }
	            }
	        }
	        return result;
	    }
	}

}



