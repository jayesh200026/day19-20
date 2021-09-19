package com.main;

import com.ds.BalancedParenthesis;

/**
 * @author jayeshkumar Uses infix expression and checks if its balanced or not
 *         using stack
 */
public class BalancedParenthesisMain {

	public static void main(String[] args) {

		String expr = "((5+6)∗(7+8))/(4+3)(5+6)∗(7+8)/(4+3)";
		BalancedParenthesis obj = new BalancedParenthesis();
		obj.isBalanced(expr);

	}

}
