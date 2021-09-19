package com.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.ds.OrderedList.Node;

/**
 * @author jayeshkumar This class used by OrderedListMain to print the list and
 *         write the ordered ist to file.
 */
public class OrderedListDemo<T> {

	/**
	 * 
	 * @param a=array to be printed Prints the elements of array
	 */
	public static <T extends Comparable<T>> void printArray(T[] a) {
		for (T t : a) {
			System.out.print(t + " ");

		}
		System.out.println();
	}

	/**
	 * @param list=ordered list Write the ordered list to text file.
	 */
	public void write(OrderedList list) {
		try {

			FileWriter fWriter = new FileWriter(
					"/Users/jayeshkumar/eclipse-workspace/DataStructure/OutputFiles/OrderedList.txt");

			String text = "";

			Node temp;
			temp = list.getHead();
			while (temp.next != null) {
				text = text + temp.data + "----->";
				temp = temp.next;
			}
			text = text + temp.data;
			fWriter.write(text);

			fWriter.close();

			System.out.println("File is created successfully with the content.");
		}

		catch (IOException e) {

			System.out.print(e.getMessage());
		}
	}

}
