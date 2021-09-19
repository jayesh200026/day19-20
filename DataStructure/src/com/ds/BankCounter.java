package com.ds;

import java.util.Scanner;

/**
 * @author jayeshkumar Program simulates the bank counter using queue data
 *         structure.
 */
public class BankCounter {
	Scanner r = new Scanner(System.in);
	long minimumBalance = 5000;

	Queue<Integer> queue = new Queue<>();

	/**
	 * Asks user to provide number of people waiting in queue at bank.
	 */
	public void addPerson() {

		System.out.println("How many people you wanna add");
		int n = r.nextInt();
		for (int i = 0; i < n; i++) {
			queue.enqueue(i);
		}
		getOption(n);

	}

	/**
	 * @param n=number of people at bank who are waiting in queue. Perform banking
	 *                 operations like deposit and withdrawal of money for each of
	 *                 customer.
	 */
	private void getOption(int n) {
		int num = 0;

		while (num != n) {
			long cash = minimumBalance;

			int option = 0;
			boolean done = false;
			while (!done) {
				System.out.println("Person " + (num + 1) + " at the counter");
				System.out.println("Available cash " + cash);
				System.out.println("You want to \n1: Withdraw \n2: Deposit");
				option = r.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter the required amount to withdraw");
					long amount = r.nextInt();
					if (amount > cash) {
						System.out.println("Not enough money to withdraw");
					} else
						cash = cash - amount;
					done = true;
					queue.dequeue();
					num++;
					System.out.println("Available cash" + cash);
					System.out.println("--------THANKYOU VISIT AGAIN-------");
					break;
				case 2:
					System.out.println("Enter the required amount to deposit");
					long amount1 = r.nextInt();
					System.out.println("amount deposited successfully");
					queue.dequeue();
					cash = cash + amount1;
					done = true;
					System.out.println("Available cash " + cash);
					num++;
					System.out.println("--------THANKYOU VISIT AGAIN-------");
					break;
				default:
					System.out.println("Invalid input");

				}
			}

		}

	}

}
