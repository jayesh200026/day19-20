package com.algorithm;

import java.util.Scanner;

/**
 * @author jayeshkumar Sorts the array in ascending order using insertion sort
 *         algorithm.
 */
public class InsertionSort {

	static String array[];
	static int size;
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Ask the user to enter the numbers.Stores them in array then calls the print
	 * method before sorting.
	 */
	public static void readArray() {
		System.out.println("Enter the number of elements in the array");
		size = scanner.nextInt();
		array = new String[size];
		System.out.println("Enter the  elements of array");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.next();
		}
		scanner.close();
		System.out.println("Before Sorting");
		print();
	}

	/**
	 * Sorts the array in ascending order.After sorting calls print method to print
	 * the array elements.
	 */
	public static void insertionSort() {

		for (int i = 1; i < size; i++) {
			String item = array[i];
			int j = i - 1;

			while (j >= 0 && array[j].compareTo(item) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = item;
		}
		System.out.println("After Sorting");
		print();
	}

	/**
	 * Prints the array elements
	 */
	private static void print() {
		for (String string : array) {
			System.out.print(string + " ");

		}
		System.out.println();

	}

}
