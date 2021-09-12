package com.ds;

import java.util.Arrays;

public class PrimeAnagram<T> {
	int array[][] = new int[10][100];
	int prime[][] = new int[10][100];
	int anagram[][] = new int[10][100];
	int nonanagram[][] = new int[10][100];
	
	public void primeArray() {
		
		int temp = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = temp;
				temp++;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				// System.out.print(array[i][j]+" ");
				if (checkPrime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else {
					prime[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != 0) {
					//System.out.print(prime[i][j] + " ");
				}
			}
			//System.out.println();
		}
	}
	
	public void isAnagram() {
		
		for(int i = 0 ; i<10 ; i++) {
			for(int j = 0 ; j<100;j++) {
				if(prime[i][j]!=0) {
				for(int k = j+1 ; k <100;k++ ) {
				if(prime[i][k]!=0&& anagram(String.valueOf(prime[i][j]),String.valueOf(prime[i][k]))) {
					anagram[i][j]=prime[i][j];
					anagram[i][k]=prime[i][k];
					
				}
				}
				}
			}
		}
		
		
		

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				
					if(prime[i][j]!=anagram[i][j]) {
						nonanagram[i][j]=prime[i][j];
						

					}
			}
		

		}
		
		
		
	}
	
	public void printAnagrams() {
		System.out.println("Anangrams are");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (anagram[i][j] != 0) {
					System.out.print(anagram[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}
	
	public void printnonAnagram() {
		System.out.println("Non Anangrams are");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (nonanagram[i][j] != 0) {
					System.out.print(nonanagram[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}
	
	


	/*public String[] primeNumbers(int range) {
		int position = 0;
		String[] array = new String[1000];
		for(int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for(int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}*/
	
	
	private boolean checkPrime(int num) {

		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		/*
		 * if(flag) { return true; } else { return false; }
		 */

		return flag;
	}
	
	public boolean anagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
				
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	

}
