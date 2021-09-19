package com.ds;

/**
 * @author jayeshkumar
 *
 *         Prints the prime numbers from 0 to 1000 in 2D array
 */
public class Prime2DArray<T> {

	/**
	 * Stores prime numbers appearing for every 100 values i.e between 0 to 100,100
	 * to 200,200 to 300 etc in one of the dimension and prints the 2d array
	 */
	public void primeArray() {
		int array[][] = new int[10][100];
		int prime[][] = new int[10][100];
		int temp = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = temp;
				temp++;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {

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
					System.out.print(prime[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * @param num=any number between 0 to 1000
	 * @return true if its a prime else false
	 */
	private boolean checkPrime(int num) {

		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

}
