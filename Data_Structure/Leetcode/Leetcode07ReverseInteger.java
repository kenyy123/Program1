package Leetcode;

public class Leetcode07ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a = reverse(123);
         System.out.println(a);
         
	} 
	
	public static int reverse(int x) {
        long result =0;
        while(x != 0)
        {
            result = (result*10) + (x%10);
            if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
            x = x/10;
        }
      return (int)result;  
    }
	
}
