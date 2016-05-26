/*
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Must be able to handle integer overflow as well
 */

public class ReverseInteger {

	public int reverseInteger(int x){
		long result = 0;
		
		while(x != 0){
			result = (result*10) + (x%10);
			if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
				return 0;
			x = x/10;
		}
		
		return (int) result;
	}
	
}
