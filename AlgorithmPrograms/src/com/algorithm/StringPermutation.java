package com.algorithm;

import java.util.Scanner;

/**
 * @author jayeshkumar
 * Prints all the permutations of a users input string.
 * Note:If String of length n,then number of permutation=n!.
 */
public class StringPermutation {
	
	public static int count=0;
	
	public static String readString() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= scanner.next();
		permutation(str,"");
		scanner.close();
		return str;
		
		
	}
	 /**
	 * Recursively finds all permutation by removing one character at a time and attaching it to last.
	 */
	static void permutation(String str, String ans)
	    {
		 
	  
	        // If string is empty
	        if (str.length() == 0) {
	        	 count++;
	            System.out.println(ans);
	            return;
	        }
	  
	        for (int i = 0; i < str.length(); i++) {
	  
	            // ith character of str
	            char ch = str.charAt(i);
	  
	            // Rest of the string after excluding 
	            // the ith character
	            String ros = str.substring(0, i) + 
	                         str.substring(i + 1);
	  
	            // Recurvise call
	           
	            permutation(ros, ans + ch);
	        }
	    }

}
