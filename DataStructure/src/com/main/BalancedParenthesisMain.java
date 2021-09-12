package com.main;

import com.ds.BalancedParenthesis;

public class BalancedParenthesisMain{

	public static void main(String[] args) {
		String  expr= "(5+6∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		
		BalancedParenthesis obj = new BalancedParenthesis();
		obj.isBalanced(expr);

	}

}
