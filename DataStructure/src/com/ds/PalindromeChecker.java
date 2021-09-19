package com.ds;

import java.util.Scanner;

/**
 * @author jayeshkumar Program checks if a string id palindrome or not using
 *         Dequeue.
 */
public class PalindromeChecker {

	static Scanner scanner = new Scanner(System.in);

	static Deque<Character> deque = new Deque<>();

	/**
	 * Ask users to enter a string and checks if string is panindrome or not
	 */
	public static void checkPalindrome() {
		System.out.println("Enter the string");
		String string = scanner.next();
		string = string.toLowerCase();
		char[] charArray = string.toCharArray();
		String reversedString = "";
		for (int i = 0; i < charArray.length; i++) {
			deque.addFront(charArray[i]);
		}

		for (int i = 0; i < charArray.length; i++) {
			reversedString += deque.removeFront();
		}

		if (string.equals(reversedString)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
