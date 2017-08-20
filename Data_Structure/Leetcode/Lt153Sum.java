package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lt153Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        if(nums.length < 3) return result;
	        Arrays.sort(nums);
	        int i = 0;
	        while(i < nums.length - 2) {
	            if(nums[i] > 0) break;
	            int j = i + 1;
	            int k = nums.length - 1;
	            while(j < k) {
	                int sum = nums[i] + nums[j] + nums[k];
	                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                if(sum <= 0) while(nums[j] == nums[++j] && j < k);
	                if(sum >= 0) while(nums[k--] == nums[k] && j < k);
	            }
	            while(nums[i] == nums[++i] && i < nums.length - 2);
	        }
	        return result;
	    }
	}
	
	
	public List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> res = new ArrayList<>();
	    Arrays.sort(nums);
	    for (int i = 0; i + 2 < nums.length; i++) {
	        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
	            continue;
	        }
	        int j = i + 1, k = nums.length - 1;  
	        int target = -nums[i];
	        while (j < k) {
	            if (nums[j] + nums[k] == target) {
	                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                j++;
	                k--;
	                while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
	                while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
	            } else if (nums[j] + nums[k] > target) {
	                k--;
	            } else {
	                j++;
	            }
	        }
	    }
	    return res;
	}

}



