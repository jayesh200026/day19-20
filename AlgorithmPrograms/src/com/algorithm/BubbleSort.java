package com.algorithm;

import java.util.Scanner;

/**
 * @author jayeshkumar Programs sorts the integer given by user in ascending
 *         order
 */
public class BubbleSort {

	static int array[];
	static int size;
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Asks user to enter the contents and store in array.
	 */
	public static void readArray() {
		System.out.println("Enter the number of elements in the array");
		size = scanner.nextInt();
		array = new int[size];
		System.out.println("Enter the  elements of array");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();

		System.out.println("Before Sorting");
		print();
	}

	/**
	 * Sorts the array using bubble sort technique.After sorting calls print method
	 */
	public static void bubbleSort() {
		int length = array.length;
		int temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}
		System.out.println("After Sorting");
		print();

	}

	/**
	 * Prints the content of array
	 */
	private static void print() {
		for (int i : array) {
			System.out.print(i + " ");

		}
		System.out.println();

	}

}
