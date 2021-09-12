package com.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.algorithm.Generics;

public class GenericMain {

	public static void main(String[] args) {
		
		String[] arr1= {"Pirates","of","the","caribbean"};
		Integer[] arr2= {3,6,1,90,45,65,76,34};
		Float[] arr3= {12.1f,65.4f,78f,54.8f,65.4f,7.3f,98f};
		
		Generics.bubbleSort(arr1);
		Generics.insertionSort(arr2);
		Generics.bubbleSort(arr3);
		Integer a=GenericMain.getKey();
		Integer b[]=GenericMain.getInput();
		Generics.binarySearch(b,a);
		
	}
	
	private static Integer getKey() {
		Scanner r = new Scanner(System.in);

		System.out.println("Enter the key to search");
		Integer key = r.nextInt();

		return key;

	}
	
	private static <T> Integer[] getInput() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/jayeshkumar/eclipse-workspace/AlgorithmPrograms/InputFiles/BinarySearch.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next()+" ";
			}
			String[] array = whole.split(" ");
			Integer[] a=new Integer[array.length];
			for(int i=0;i<array.length;i++) {
				a[i]=Integer.parseInt(array[i]);
			}
			x.close();
			return a;

			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
