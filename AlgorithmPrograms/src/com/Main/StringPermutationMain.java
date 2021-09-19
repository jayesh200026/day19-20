package com.Main;

import com.algorithm.StringPermutation;

public class StringPermutationMain {

	public static void main(String[] args) {

		String str = StringPermutation.readString();

		System.out.println("Number of permutations of string " + str + " is " + StringPermutation.count);
	}

}
