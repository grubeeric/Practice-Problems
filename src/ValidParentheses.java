import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParentheses {

	public boolean isValidParen(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (stack.isEmpty()) {
					return false;
				} else if (s.charAt(i) == ')') {
					char c = stack.pop();
					if (c != '(')
						return false;
				} else if (s.charAt(i) == '}') {
					char c = stack.pop();
					if (c != '{')
						return false;
				} else if (s.charAt(i) == ']') {
					char c = stack.pop();
					if (c != '[')
						return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
