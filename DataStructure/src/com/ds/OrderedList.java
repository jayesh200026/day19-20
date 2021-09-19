package com.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.ds.Hashing.Node;

/**
 * @author jayeshkumar Implemented Ordered list where elements are in ascending
 *         order.
 * 
 */
public class OrderedList<T> {

	Node head;
	int count = 0;

	class Node<T extends Comparable<T>> {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			next = null;
		}

	}

	public OrderedList() {
		this.head = null;
	}

	/**
	 * 
	 * @param index=position in list whose data we need.
	 * @return the value of node at position=index
	 */
	public <T extends Comparable<T>> T get(int index) {
		Node<T> temp = head;
		Node<T> prev = null;

		for (int i = 0; i <= index; i++) {
			prev = temp;
			temp = temp.next;
		}
		return (T) prev.data;
	}

	/**
	 * 
	 * @param data=value of new Node Adds the new node at correct position by
	 *                   comparing with rest of the nodes
	 */
	public <T extends Comparable<T>> void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null || head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
			count++;
		} else {
			Node<T> temp = head;
			while (temp.next != null && temp.next.data.compareTo(data) < 0) {
				temp = temp.next;

			}
			newNode.next = temp.next;
			temp.next = newNode;
			count++;
		}

	}

	/**
	 * 
	 * @param input=value user want to seach in list
	 * @return true if found else false
	 */
	public <T extends Comparable<T>> boolean search(T input) {
		boolean flag = false;
		Node temp;
		temp = head;
		while (temp != null) {
			if (temp.data.equals(input)) {

				flag = true;
				// pop(input);

				break;
			} else {
				temp = temp.next;
			}

		}
		return flag;

	}

	/**
	 * Display the ordered list
	 */
	public <T extends Comparable<T>> void display() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	/**
	 * @return true if empty else false
	 */
	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	/**
	 * @return number of elements in the list.
	 */
	public int size() {
		return count;
	}

	/**
	 * @return the last node of the list
	 */
	public Node pop() {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		if (head.next == null) {
			Node temp = head;
			head = null;
			return temp;
		}
		Node temp = head;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		return temp;
	}

	/**
	 * @param pos=position of a node whom we want to remove
	 * @return the removed node at index=pos
	 */
	public Node pop(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		if (pos == 1) {
			Node temp = head;
			head = null;
			return temp;
		}
		int index = 1;
		Node temp = head;
		Node prev = null;
		while (index < pos) {
			prev = temp;
			temp = temp.next;
			index++;
		}
		prev.next = temp.next;
		return temp;

	}

	/**
	 * @return the entire list.
	 */
	public Node getHead() {
		return head;
	}

}
