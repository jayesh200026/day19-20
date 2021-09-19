package com.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * @author jayeshkumar
 *
 *   This class reads a input text file, store the words in the file to an
 *   array,then sorts that array and then searches the user key in that
 *   sorted array using binary search method.
 */
public class BinarySearch {
	static Scanner r = new Scanner(System.in);

	/**
	 * Reads the txt file and then stores each word in an array with space being the
	 * delimiter
	 */
	public static void readFile() {
		String key = getKey();

		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/jayeshkumar/eclipse-workspace/AlgorithmPrograms/InputFiles/BinarySearch.txt"));

			String allWords = "";
			while (x.hasNext()) {
				allWords = allWords + x.next() + " ";
			}
			String[] array = allWords.split(" ");
			sort(array, key);

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @return a String which user want to search
	 */
	private static String getKey() {

		System.out.println("Enter the key to search");
		String key = r.nextLine();

		return key;

	}

	/**
	 * @param unsorted array
	 * @param key      user input
	 * 
	 *  This function sorts the array in ascending order
	 * 
	 *  After sorting it calls the binarySearch method by passing sorted array
	 *  
	 */
	private static void sort(String[] array, String key) {

		System.out.println("UnSorted array");

		for (String string : array) {
			System.out.print(string+" ");

		}
		int scanner = array.length;
		String temp;

		for (int i = 0; i < scanner - 1; i++) {
			for (int j = 0; j < scanner - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}

		System.out.println("\nSorted array");

		for (String string : array) {
			System.out.print(string+" ");

		}
		System.out.println();
		binarysearch(array, key);

	}

	/**
	 * @param array   sorted array
	 * @param key user search key
	 * 
	 * Searches the key in sorted array a
	 */
	private static void binarysearch(String[] array, String key) {
		int left = 0, right = array.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;

			if (key.compareTo(array[mid]) == 0) {
				System.out.println(key + " found at position " + (mid + 1));
				System.exit(0);
			}
			if (key.compareTo(array[mid]) > 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		System.out.println("Not found");

	}

}
