/*
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. 
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
 * You are responsible to gather all the input requirements up front.
 */

public class StringToInteger {
	
	public int atoi(String str){
		if(str.length() < 1 || str.equals(null))
			return 0;
		
		char flag = '+';
		str = str.trim();
		int i = 0;
		
		if(str.charAt(i) == '-'){
			flag = '-';
			i++;
		}else if(str.charAt(i) == '+'){
			i++;
		}
		
		double result = 0;
		
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
			result = (result * 10) + (str.charAt(i) - '0');
			i++;
		}
		
		if(flag == '-')
			result = - result;
		if(result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int) result;
	}
	
}
