package Leetcode;

public class Lt08StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int myAtoi(String str) {
	    int index = 0, sign = 1, total = 0;
	    //1. Empty string
	    if(str.length() == 0) return 0;

	    //2. Remove Spaces
	    while(str.charAt(index) == ' ' && index < str.length())
	        index ++;

	    //3. Handle signs
	    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
	        sign = str.charAt(index) == '+' ? 1 : -1;
	        index ++;
	    }
	    
	    //4. Convert number and avoid overflow
	    while(index < str.length()){
	        int digit = str.charAt(index) - '0';
	        if(digit < 0 || digit > 9) break;

	        //check if total will be overflow after 10 times and add digit
	        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
	            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

	        total = 10 * total + digit;
	        index ++;
	    }
	    return total * sign;
	}
	
	/*
	i think something is wrong if you input -13&4,the result is -13,but if you change to,that will be correct and the new leetcode i think is hard to use
	while(i < len) {
		int digit = str.charAt(i++) - '0';
		if(digit <= 0 || digit >= 9) continue;
		boolean overlow = (num == bound && digit >= 8) || num > bound;
		if(overlow) return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		num = num * 10 + digit;
		}*/

}


