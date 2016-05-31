/*
 *Write a function that takes a string as input and reverse only the vowels of a string.
 *Example 1:
 *Given s = "hello", return "holle".
 *Example 2:
 *Given s = "leetcode", return "leotcede". 
 */

public class ReverseVowels {

	public String reverseVowels(String s){
		String vowels = "aeiouAEIOU";
		StringBuilder vowelsInString = new StringBuilder();
		char[] arr = s.toCharArray();
		int j = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(vowels.indexOf(s.charAt(i)) >= 0){
				vowelsInString.append(s.charAt(i));
			}
		}
		
		String vowelsString = vowelsInString.reverse().toString();
		
		for(int i = 0; i < s.length(); i++){
			if(vowels.indexOf(s.charAt(i)) >= 0){
				arr[i] = vowelsString.charAt(j);
				j++;
			}
		}
		
		String result = String.valueOf(arr);
		
		return result;
	}
	
}
