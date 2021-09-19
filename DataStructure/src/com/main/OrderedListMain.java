package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.OrderedList;
import com.ds.OrderedListDemo;

/**
 * @author jayeshkumar Program creates ordered list from input taken from text
 *         file
 */
public class OrderedListMain {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner r = new Scanner(System.in);
		OrderedList<Integer> list = new OrderedList<>();
		OrderedListDemo<Integer> listDemo = new OrderedListDemo<>();

		File file = new File("/Users/jayeshkumar/eclipse-workspace/DataStructure/InputFiles/OrderedList.txt");
		Scanner sc = new Scanner(file);

		String str;
		String s = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			s = s + str;
		}
		sc.close();
		String[] arr = s.split(" ");// to split the string array
		System.out.println("File content is");
		listDemo.printArray(arr);
		Integer[] array = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
			list.add(array[i]);
		}

		System.out.println("Ordered list is");
		list.display();

		System.out.println("Enter the element");
		Integer user = r.nextInt();
		boolean b = list.search(user);
		if (!b) {
			System.out.println("Not found " + user + " so adding to list");
			list.add(user);
		} else {
			System.out.println("Found " + user + " so removing from list");
			list.pop(user);
		}
		listDemo.write(list);

		list.display();

	}

}
