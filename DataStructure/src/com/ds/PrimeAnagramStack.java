package com.ds;

import java.util.Arrays;

class Stack1<T> {
	Node<T> head;
	int count = 0;

	@SuppressWarnings("hiding")
	class Node<T> {
		public T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	/**
	 * Constructor creates an object of MyLinkedList and initializes linked list
	 */
	public Stack1() {
		this.head = null;
	}

	/**
	 * element to be added into the list
	 * 
	 */
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		node.next = head;
		head = node;
		count++;
	}

	/*
	 * to pop the data
	 */
	public void pop() {
		if (head == null) {
			System.out.println("Stack UnderFlow");
			return;
		}
		Node<T> temp = head;
		head = temp.next;
		temp = null;
		count--;
	}

	/*
	 * peek the data
	 */
	public T peek() {
		if (head == null) {
			System.out.println("no data present");
		}
		T temp = head.data;
		return temp;
	}

	public boolean isEmpty() {
		return count == 0 ? true : false;
	}

	public int size() {
		return count;
	}

	public String[] display() {
		Node<T> node = head;
		String temp = "";

		while (node.next != null) {
			temp += node.data + " ";
			node = node.next;
		}
		temp += node.data;
		String[] array=temp.split(" ");
		
		return array;
	}

}

public class PrimeAnagramStack {
	Stack1<String> stack = new Stack1<>();
	OrderedList obj = new OrderedList();
	public void anagramStack() {

		String[] primeNumbers = prime(1000);

		/*for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				// String v1=String.valueOf(list.get(i));
				// String v2=String.valueOf(list.get(j));
				if (anagram(primeNumbers[i], primeNumbers[j])) {
					stack.push(primeNumbers[i]);
					stack.push(primeNumbers[j]);
				}
			}
		}*/
		obj.display();
		for (int i = 0; i <=obj.getSize(); i++) {
			for (int j = i + 1; j <obj.getSize(); j++) {
				 String v1=String.valueOf(obj.get(i));
				 String v2=String.valueOf(obj.get(j));
				if (anagram(v1, v2)) {
					stack.push(v1);
					stack.push(v2);
				}
			}
		}
		
		System.out.println("Prime Anagrams in reverse order is");
		String[] anagrams = stack.display();
		int[] anagram = new int[anagrams.length];
		
		for(int i=0;i<anagram.length;i++) {
			anagram[i]=Integer.parseInt(anagrams[i]);
		}
		/*
		 * for(int i=anagrams.length()-1;i>0;i--) {
		 * System.out.print(anagrams.charAt(i)); }
		 */
		int count=0;
		for (int i = anagram.length-1; i >=0;i--) {
			
			if(count%2==0) {
				System.out.println();
				
			}
			System.out.print(anagram[i]+" ");
			count++;
		}

	}

	public String[] prime(int range) {
		int position = 0;
		String[] array = new String[1000];
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				obj.add(i);
				array[position] = String.valueOf(i);
				position++;
				// list.add(i);

			}
		}
		String[] returnArray = new String[position];
		for (int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;

	}

	public boolean anagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

}
