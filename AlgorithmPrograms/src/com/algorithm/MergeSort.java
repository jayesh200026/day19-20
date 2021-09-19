package com.algorithm;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author jayeshkumar
 *Program sorts the string in ascending order using merge sort algorithm
 */
public class MergeSort {
	static Scanner scanner = new Scanner(System.in);

	public static void getArray() {
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		String values[] = new String[size];
		System.out.println("Enter the array");
		for (int i = 0; i < size; i++) {
			values[i] = scanner.next();
		}
		scanner.close();

		System.out.println("Before sorting");
		printArray(values);
		mergeSort(values, 0, values.length - 1);
		System.out.println("After sorting");
		printArray(values);
	}

	/**
	 * @param values array of strings
	 * Print the array
	 */
	private static void printArray(String[] values) {
		for (String string : values) {
			System.out.print(string + " ");

		}
		System.out.println();

	}

	/**
	 * @param a= array of string
	 * @param from=stating index of array 
	 * @param to=last index of array 
	 * Divides the array a into 2 parts.
	 */
	public static void mergeSort(String[] array, int from, int to) {
		if (from == to) {
			return;
		}
		int mid = (from + to) / 2;

		mergeSort(array, from, mid);
		mergeSort(array, mid + 1, to);
		merge(array, from, mid, to);
	}

	/**
	 * @param a= array of string
	 * @param from=stating index of array a
	 * @param mid=middle index of array
	 * @param to=last index of array a
	 * merges the divided array in sorted order
	 */
	public static void merge(String[] array, int from, int mid, int to) {
		int n = to - from + 1;
		String[] b = new String[n];
		int p = from;
		int q = mid + 1;
		int j = 0;

		while (p <= mid && q <= to) {
			if (array[p].compareTo(array[q]) < 0) {
				b[j] = array[p];
				p++;
			} else {
				b[j] = array[q];
				q++;
			}
			j++;
		}

		while (p <= mid) {
			b[j] = array[p];
			p++;
			j++;
		}

		while (q <= to) {
			b[j] = array[q];
			q++;
			j++;
		}

		for (j = 0; j < n; j++) {
			array[from + j] = b[j];
		}
	}

}
