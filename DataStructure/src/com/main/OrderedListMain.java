package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.OrderedList;

public class OrderedListMain {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner r = new Scanner(System.in);
		OrderedList o = new OrderedList();
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
		Integer[] array = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(array.getClass());
		o.bubbleSort(array);
		
		System.out.println("Enter the element");
		Integer user=r.nextInt();
		boolean b = o.search(user);
		if(b) {
			o.add(user);
		}
		o.write();		
		
		
	
		//Integer a=o.userInput();
		
	//	boolean b = o.search(a);
		//if(b) {
		//	o.add(a);
		//}

		// o.readFile();
		 o.display();
		// o.userInput();
		// o.display();

	}

}
