package Leetcode;

/**
  * 本代码由九章算法编辑提供Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

Example:

Input: "cbbd"

Output: "bb"*/



public class Lt5LongestPalindromicSubstring1 {

    public static void main(String[] args){
		
	}
	
    /**

     * @param s the maximum length of s is 1000

     * @return the longest palindromic subsequence's length

     */

    public int longestPalindromeSubseq(String s) {

        // Write your code here

        int length = s.length();

        if (length == 0)

            return 0;

        int[][] dp = new int[length][length];

        for (int i = length - 1; i >= 0; i--) {

            dp[i][i] = 1;

            for (int j = i + 1; j < length; j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    dp[i][j] = dp[i + 1][j - 1] + 2;

                } else {

                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);

                }

            }

        }

        return dp[0][length - 1];

    }

}