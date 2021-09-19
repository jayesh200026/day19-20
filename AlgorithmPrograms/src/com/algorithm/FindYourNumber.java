package com.algorithm;

import java.util.Scanner;

/**
 * @author jayeshkumar This program takes a command line argument(number) which
 *         is a power of 2,then ask user to think of a number between 0 and
 *         number-1. Uses binary search method to find the number and it takes
 *         exactly number
 */
public class FindYourNumber {

	static int num;
	static Scanner r = new Scanner(System.in);

	/**
	 * @param number is command line argument which is power of 2. Ask user to guess
	 *               a number.Then calls find method.
	 */
	public static void getInput(int number) {
		System.out.println("Think of a number between 0 and " + (number - 1));
		num = r.nextInt();
		find(0, number - 1);
	}

	/**
	 * @param low  will be 0 always
	 * @param high is number-1 Uses binary search method to find users number
	 */
	private static void find(int low, int high) {
		if (low == high) {
			System.out.println("Your number is " + low);
			System.out.println("Intermediary numbers is " + (low - 1) + " and " + (low + 1));
			return;
		}

		int mid = (low + high) / 2;
		String choice; // "yes" or "no"
		System.out.println("Is your number between " + low + " and " + mid + " ?");
		choice = r.next();
		if (choice.equalsIgnoreCase("yes")) {
			find(low, mid);
		} else {
			find(mid + 1, high);
		}

	}

}
