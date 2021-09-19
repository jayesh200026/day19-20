package com.ds;

/**
 * @author jayeshkumar 
 * This program gives the number of binary search tree that can be formed using n nodes.
 */
public class NumberOfBST {

	
	/**
	 * @param num=numbers whose factorial is required
	 * @return the factorial of number
	 * Uses recursion to find factorail
	 */
	public static int factorial(int num) {

		int fact = 1;
		if (num == 0)
			return 1;

		return (num * factorial(num - 1));

	}

	/**
	 * numOfBST= (2n)! / n! *(n+1)!
	 * n=number of nodes
	 */
	public static void numOfBST(int numOfNode) {
		int catalanNumber = factorial(2 * numOfNode) / (factorial(numOfNode) * factorial(numOfNode + 1));
		System.out.println("Number of binary search tree with " + numOfNode + " node is " + catalanNumber);
	}

	

}
