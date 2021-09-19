package com.ds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.ds.UnOrderedList.Node;

/**
 * @author jayeshkumar This program is used by UnOrderedListMain to read a text
 *         file and write the result to new text file.
 */
public class UnOrderedListDemo {

	UnOrderedList<String> list = new UnOrderedList<>();

	/**
	 * reads the text file and stores the content in array
	 */
	public <T> void readFile() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/jayeshkumar/eclipse-workspace/DataStructure/InputFiles/UnorderedList.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next() + " ";
			}
			T[] array = (T[]) whole.split(" ");
			// add(array);
			for (T t : array) {
				list.add(t);

			}
			System.out.println("Content of the file is stored in linked list as");
			list.display();

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	/**
	 * Ask user to enter a value.If value is present in list then removes it else
	 * adds to the list.
	 */
	public <T> void getUserInput() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter word you wanna search");
		T input = (T) r.next();
		boolean flag = list.search(input);
		if (flag) {
			System.out.println("Found " + input + " now removing it from list");
			list.remove(input);
			list.display();
		} else {
			System.out.println("Not Found " + input + " now adding it to list");
			list.add(input);
			list.display();
		}

	}

	/**
	 * Writes the list after taking user choice to new text file.
	 */
	public void writeFile() {
		try {
			FileWriter writer = new FileWriter(
					"/Users/jayeshkumar/eclipse-workspace/DataStructure/OutputFiles/OutputUnOrderedList.txt");
			Node temp;
			temp = list.getList();
			while (temp.next != null) {
				writer.write(temp.data + " ");
				temp = temp.next;

			}
			writer.write(temp.data + "");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
