package com.ds;

import java.io.*;

/**
 * @author jayeshkumar
 *
 *         Implements hashing and one of the collision resolution method called
 *         chaining.
 */
public class Hashing<T> {

	Node<T>[] array = new Node[11];
	Node<T> next;

	class Node<T> {
		T data;

		Node next;

		Node(T data) {
			this.data = data;

			next = null;
		}
	}

	/**
	 * @param data=new data to be added to hash table. First gets the index by
	 *                 calculating modulus and then ads to that index.
	 */
	public void add(int data) {
		Node<T> new_Node = new Node(data);
		int index = data % 11;
		if (array[index] == null) {
			array[index] = new_Node;
		} else {
			Node<T> temp = array[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_Node;
		}
	}

	/**
	 * Prints the hash table -----> at the end means it points to null
	 */
	public void display() {

		System.out.println("Remainder " + "values:-");
		for (int i = 0; i < array.length; i++) {
			Node<T> temp = array[i];
			if (temp != null) {
				System.out.print(" [" + i + "] ----->{");
				while (temp != null) {
					System.out.print(temp.data + "  ");
					temp = temp.next;
				}
				System.out.println("}");
			}

			else {
				System.out.println(" [" + i + "]----->");
			}
		}
	}

	/**
	 * Writes the hash table to file.
	 */
	public void write() {
		try {

			FileWriter fWriter = new FileWriter(
					"/Users/jayeshkumar/eclipse-workspace/DataStructure/OutputFiles/Hashing.txt");

			String text = "";
			text = "Remainder " + "values:-\n";
			fWriter.write(text);

			for (int i = 0; i < array.length; i++) {
				text = "";
				Node<T> temp = array[i];
				if (temp != null) {

					text = " [" + i + "] ------->";
					while (temp != null) {
						text = text + temp.data + "------>";
						// System.out.print(temp.data + " ");
						temp = temp.next;
					}
					text = text + "\n";
					fWriter.write(text);
				} else if (temp == null) {
					text = " [" + i + "] ------->\n";
					fWriter.write(text);
				}

			}

			fWriter.close();

			System.out.println("File is created successfully with the content.");
		}

		// Catch block to handle if exception occurs
		catch (IOException e) {
			// Print the exception
			System.out.print(e.getMessage());
		}
	}

}
