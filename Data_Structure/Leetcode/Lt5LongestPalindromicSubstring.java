
/*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

Example:

Input: "cbbd"

Output: "bb"
*/


package Leetcode;

public class Lt5LongestPalindromicSubstring {

	public static void main(String[] args){
		
	}
	
	private int lo, maxLen;

	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
	
	
	public String longestPalindrome1(String s) {
		String sub = "";
		if(s.length()==1||s==null){
			return s;
		}
		if(s.length()==2){
			if(s.charAt(0)==s.charAt(1)){
				return s;
			}else {
				return s.substring(1);
			}
		}
		
	    for(int i=2;i<s.length();i++){      	
	    	if(s.charAt(i)==s.charAt(i-2)){
	        	int j, k;
	        	for(j=i-2, k=i;j>=0&&k<s.length();j--, k++){
	        		if(s.charAt(j)!=s.charAt(k)){
	        			break;
	        		}
	        	}
	        	if(sub.length()<s.substring(j+1, k-1).length()){
	        		if(k-1==s.length()-1){
	        			sub=s.substring(j+1);
	        		}else {
	        			sub=s.substring(j+1, k-1);
					}
	        			
	        	}       		
	        }        		
	    	
	    }
	    
	    for(int i=1;i<s.length();i++){
	    	if(s.charAt(i)==s.charAt(i-1)){
	    		int j, k;
	    		for(j=i-1, k=i;j>=0&&k<s.length();j--, k++){
	    			if(s.charAt(j)!=s.charAt(k)){
	    				break;
	    			}
	    		}
	    		if(sub.length()<s.substring(j+1, k-1).length()){
	    			if(k-1==s.length()-1){
	    				sub=s.substring(j+1);
	    			}else {
	    				sub=s.substring(j+1, k-1);
	    			}
	    		}
	    	}
	    	
	    }
	    return sub;
	}
}



