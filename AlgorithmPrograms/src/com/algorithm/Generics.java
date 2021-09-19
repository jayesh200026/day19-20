package com.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jayeshkumar Implements binary search,bubble sort,insertion sort using
 *         generics
 */
public class Generics<T> {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 * @param array array of elements of type T
	 * @return sorted array Implements Bubble sort using generics.
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {

		int length = array.length;
		T temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array using Bubble sort");
		printArray(array);
		return array;

	}

	/**
	 * @param array array of elements of type T
	 * @return sorted array Implements Insertion sort using generics.
	 */
	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
		T item;
		for (int i = 1; i < array.length; i++) {
			item = array[i];
			int j = i - 1;
			while (j >= 0 && array[j].compareTo(item) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = item;
		}
		System.out.println("Sorted array using insertion sort");
		printArray(array);
		return array;
	}

	/**
	 * 
	 * @param array unsorted array
	 * @param key   user value that he wants to search in array. First sort the
	 *              array then searches the key in it.
	 */
	public static <T extends Comparable<T>> void binarySearch(T[] array, T key) {

		T[] sortedArray = bubbleSort(array);
		int left = 0, right = sortedArray.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (sortedArray[mid].compareTo(key) == 0) {
				System.out.println(key + " found at position " + (mid + 1));
				return;
			}
			if (sortedArray[mid].compareTo(key) > 0)
				right = mid - 1;
			else
				left = mid + 1;
		}
		System.out.println("Not found");
	}

	/**
	 * 
	 * @param a=array      to be sorted
	 * @param from=stating index of array
	 * @param to=ending    index of array
	 * @return array after sorting
	 */
	public static <T extends Comparable<T>> T[] mergeSort(T[] array, int from, int to) {
		if (from == to) {
			return array;
		}
		int mid = (from + to) / 2;

		mergeSort(array, from, mid);
		mergeSort(array, mid + 1, to);
		merge(array, from, mid, to);
		return array;
	}

	/**
	 * 
	 * @param a=array      to be sorted
	 * @param from=stating index of array
	 * @param mid=middle   index of the array
	 * @param to=ending    index of array
	 */
	public static <T extends Comparable<T>> void merge(T[] array, int from, int mid, int to) {
		int n = to - from + 1;
		List<T> b = new ArrayList<>();
		int p = from;
		int q = mid + 1;
		int j = 0;

		while (p <= mid && q <= to) {
			if (array[p].compareTo(array[q]) < 0) {
				b.add(array[p]);
				p++;
			} else {
				b.add(array[q]);
				q++;
			}
			j++;
		}

		while (p <= mid) {
			b.add(array[p]);
			p++;
			j++;
		}

		while (q <= to) {
			b.add(array[q]);
			q++;
			j++;
		}

		for (j = 0; j < n; j++) {
			array[from + j] = b.get(j);
		}
	}

	/**
	 * 
	 * @param array elements that needed to be printed
	 */
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.print(element + " ");

		}
		System.out.println();
	}

	/**
	 * Asks user to enter a key to search in a array
	 * 
	 * @return the user key
	 */
	public <T> T getKey() {
		Scanner r = new Scanner(System.in);

		System.out.println("Enter the key to search");
		T key = (T) r.next();

		return key;

	}

}
