import java.util.HashSet;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubStringWithoutRepeatingCharacters {
	
	public static void main(String[] args){
		System.out.println(lengthOfLongestSubString("abcdaefaghij"));
	}

	public static int lengthOfLongestSubString(String s){
		int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();

	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j));
	            max = Math.max(max, set.size());
	            j++;
	        } else {
	            set.remove(s.charAt(i));
	            i++;
	        }
	    }

	    return max;
	}
}
