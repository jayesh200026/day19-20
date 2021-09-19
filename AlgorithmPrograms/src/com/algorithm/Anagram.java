package com.algorithm;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author jayeshkumar This program ask user to enter 2 strings and checks if
 *         they are anagram or not.
 */
public class Anagram {

	static String string1, string2;
	static Scanner scanner = new Scanner(System.in);

	public static void anagram() {
		System.out.println("Enter the first string");
		string1 = scanner.next();
		System.out.println("Enter the second string");
		string2 = scanner.next();

		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		scanner.close();

		int length1 = string1.length();
		int length2 = string2.length();

		if (length1 != length2) {
			System.out.println("Strings are not a anagram");
		} else {
			char array1[] = string1.toCharArray();
			char array2[] = string2.toCharArray();

			array1 = sort(array1);
			array2 = sort(array2);

			if (Arrays.equals(array1, array2)) {
				System.out.println("Strings are Anagram");
			} else {
				System.out.println("Strings are not a anagram");
			}
		}
	}

	/**
	 * @param array is character array
	 * @return sorted character array Used bubble sort technique to sort
	 */
	private static char[] sort(char[] array) {

		char temp;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;

	}

}
