package com.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.algorithm.Generics;

public class GenericMain {

	static List<String> list = new ArrayList<>();

	public static void main(String[] args) {

		String[] arr1 = { "Pirates", "of", "the", "caribbean" };
		Integer[] arr2 = { 3, 6, 1, 90, 45, 65, 76, 34 };
		Float[] arr3 = { 12.1f, 65.4f, 78f, 54.8f, 65.4f, 7.3f, 98f };

		Generics.bubbleSort(arr1);
		Generics.insertionSort(arr2);
		Generics.bubbleSort(arr3);
		String[] mergeArray = Generics.mergeSort(arr1, 0, arr1.length - 1);
		System.out.println("Result of merge sort");
		Generics.printArray(mergeArray);
		GenericMain.getInput();
		String b[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			b[i] = list.get(i);
		}

		Generics<String> g = new Generics<>();
		String key = g.getKey();

		Generics.binarySearch(b, key);

	}

	/**
	 * Reads a text file then stores the words in array.
	 * 
	 * @return returns the array of words read from the file.
	 */
	private static <T> void getInput() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/jayeshkumar/eclipse-workspace/AlgorithmPrograms/InputFiles/BinarySearch.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next() + " ";
			}
			String[] array = whole.split(" ");

			for (int i = 0; i < array.length; i++) {
				list.add(array[i]);
			}
			x.close();
			System.out.println("Input for binary search is");
			printList();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Prints the list content.
	 */
	public static void printList() {
		for (String str : list) {
			System.out.print(str + " ");

		}
		System.out.println();

	}

}
