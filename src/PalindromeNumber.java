/*
 * Determine whether an integer is a palindrome. Do this without extra space.
 */

public class PalindromeNumber {

	public static void main(String[] args){
		System.out.println(isPalindrome(-2147447412));
	}
	
	public static boolean isPalindrome(int x){
		long reverse = 0;
		long original = (long) x;
		
		while(original > 0){
			reverse = (reverse * 10) + (original % 10);
			original = original / 10;
		}
		
		if(reverse == (long) x)
			return true;
		else
			return false;
	}
	
}
