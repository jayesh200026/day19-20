package com.ds;

/**
 * @author jayeshkumar This program checks if an infix expression is balanced or
 *         not.
 * 
 */
public class BalancedParenthesis<T> {

	Stack<Character> stack = new Stack<>();

	/**
	 * @param expr=infix expression provided by user
	 */
	public void isBalanced(String expr) {

		for (int i = 0; i < expr.length(); i++) {
			if (expr.charAt(i) == '(') {

				stack.push(expr.charAt(i));
				stack.display();

			} else if (expr.charAt(i) == ')') {
				stack.pop();
				System.out.println("after poping");
				stack.display();
			}
		}

		if (stack.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}

	}

}
