
/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode01TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,5,6,7};
		int[] a1 = twoSum(a, 4);
//		for (int x : a1){
//			System.out.println(x);
//		}
		for (int i=0; i<a1.length; i++){
			System.out.println(a1[i]);
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
		    if (map.containsKey(numbers[i])) {
		        return new int[]{map.get(numbers[i]) + 1, i + 1};
		    } else {
		        map.put(target - numbers[i], i);
		    }
		}
		return new int[]{0, 0};
	}
	
	
	public static int[] lt01(int[] nums, int sum1){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++){
			if(m.containsKey(nums[i])){
				return new int[]{m.get(nums[i]) + 1, i+1};
			}else{
				m.put(sum1 - nums[i], i);
			}
		}
		
		return new int[]{0, 0};
	}

}
