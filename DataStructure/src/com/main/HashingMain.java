package com.main;

import java.io.*;
import java.util.*;
import com.ds.Hashing;

/**
 * @author jayeshkumar This program reads a file and store the data of file in
 *         hash table.
 */
public class HashingMain {

	public static void main(String[] args) throws Exception {
		Hashing<Integer> hash = new Hashing<Integer>();

		File file = new File("/Users/jayeshkumar/eclipse-workspace/DataStructure/InputFiles/Hashing.txt");
		Scanner sc = new Scanner(file);
		String str;
		String s = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			s = s + str;
		}
		System.out.println(s);
		sc.close();
		String[] arr = s.split(" ");// to split the string array
		int[] arr2 = new int[arr.length];

		// for converting any String type in file to integer type
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}

		for (int i : arr2) {
			hash.add(i);

		}

		hash.write();

		hash.display();

	}

}
