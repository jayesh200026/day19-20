package com.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Generics {
	static Scanner r = new Scanner(System.in);
	
	public static <T extends Comparable<T>> T[] bubbleSort(T[] a) {
		
		int len=a.length;
		T temp;
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		printArray(a);
		return a;
		
	}
	public static <T extends Comparable<T>> T[] insertionSort(T[] a) {
		T item;
		for(int i=1;i<a.length;i++) {
			item=a[i];
			int j=i-1;
			while(j>=0 && a[j].compareTo(item)>0) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=item;
		}
		System.out.println("Sorted array");
		printArray(a);
		return a;
	}
	
	public static <T extends Comparable<T>> void binarySearch(T[] b,T key) {
		
		System.out.println("Input for binary search is");
		printArray(b);
	
		T[] a=bubbleSort(b);
		int l=0,r=a.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid].compareTo(key)==0) {
				System.out.println(key+" found at position "+(mid+1));
				return;
			}
			if(a[mid].compareTo(key)>0)
				r=mid-1;
			else
				l=mid+1;
		}
		System.out.println("Not found");
	}
	
	private static <T> T[] getInput() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/jayeshkumar/eclipse-workspace/AlgorithmPrograms/InputFiles/BinarySearch.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next()+" ";
			}
			T[] array = (T[]) whole.split(" ");
			x.close();
			return array;

			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return null;
		
	}
	public static <T> void printArray(T[] a) {
		for (T t : a) {
			System.out.print(t+" ");
			
		}
		System.out.println();
	}
	
	private static<T> T getKey() {

		System.out.println("Enter the key to search");
		T key = (T)r.next();

		return key;

	}
	
	
	
	

}
