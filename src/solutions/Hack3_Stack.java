package solutions;

import java.util.Stack;

public class Hack3_Stack {

	public static void main(String[] args) {
		
		// return true if string is balanced

		System.out.println(isBalanced("{}()"));		// t
		System.out.println(isBalanced("{()}"));		// t
		System.out.println(isBalanced("({()})"));	// t

		System.out.println(isBalanced("{}("));		// f
		System.out.println(isBalanced("({)}"));		// f
		System.out.println(isBalanced("(("));		// f
		System.out.println(isBalanced("}{"));		// f
	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c=='}' && !stack.isEmpty() && stack.peek()=='{') {
				stack.pop();
			} else if (c==')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			} else if (c=='{' || c=='(' || c=='}' || c==')') {
				stack.push(c);
			}
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
