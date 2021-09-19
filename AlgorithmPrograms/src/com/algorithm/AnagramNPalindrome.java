package com.algorithm;

/**
 * @author jayeshkumar
 *This program will print all the prime numbers between 0 to 1000 that are both anagram and palindrome.
 */
public class AnagramNPalindrome {

	/**
	 *  Searches the prime number.
	 *  If found calls palindrome method to check if its palindrome or not.
	 */
	public static void primeNumber() {

		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				palindrome(i);
			}
		}

	}

	/**
	 * @param prime prime number
	 * To check for both palindrome and anagram we have to check for palindrome that is sufficient.
	 */
	private static void palindrome(int prime) {
		int remainder, number, reversedNum = 0;
		number = prime;
		int count = 0;
		while (prime != 0) {
			remainder = prime % 10;
			reversedNum = reversedNum * 10 + remainder;
			prime = prime / 10;
			count++;

		}
		if (number == reversedNum && count > 1) {
			System.out.print(number + " ");
		}

	}

}
