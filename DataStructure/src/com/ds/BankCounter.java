package com.ds;

import java.util.Scanner;

public class BankCounter {
	Scanner r =new Scanner(System.in);
	long minimumBalance=5000;
	
	class Queue<T>{
		int queue[]= new int[100];
		int front;
		int rear;
		int size;
		
		public void enqueue(T data) {
			queue[rear]=(int) data;
			rear++;
			size++;
		}
		public int dequeue() {
			int a= queue[front];
			front++;
			size--;
			
			return a;
			
		}
		public int size() {
			return size;
		}
		public boolean isEmpty() {
			return size==0;
		}
		public boolean isFull(){
			return size==100;
		}
	}
	
	Queue queue= new Queue();
	public void addPerson() {
		
		System.out.println("How many people you wanna add");
		int n=r.nextInt();
		for(int i=0;i<n;i++) {
			queue.enqueue(i);
		}
		getOption(n);
		
	}


	private void getOption(int n) {
		
while(n!=0) {
	long cash=minimumBalance;
	System.out.println("Available cash"+cash);
	int option =0;
	boolean done=false;
	while(!done) {
		System.out.println("You want to \n1: Withdraw \n2: Deposit");
		option = r.nextInt();
		switch(option) {
		case 1:System.out.println("Enter the required amount to withdraw");
				long amount = r.nextInt();
				if(amount>cash) {
					System.out.println("Not enough");
				}
				else
					cash=cash-amount;
				done=true;
				queue.dequeue();
				n--;
				System.out.println("Available cash"+cash);
				System.out.println("--------THANKYOU VISIT AGAIN-------");
				break;
		case 2:System.out.println("Enter the required amount to deposit");
				long amount1 = r.nextInt();
				System.out.println("amount deposited successfully");
				queue.dequeue();
				cash = cash + amount1;
				done=true;
				System.out.println("Available cash " + cash);
				n--;
				System.out.println("--------THANKYOU VISIT AGAIN-------");
				break;
		default:System.out.println("Invalid input");
				
		}
	}
	
}
		
	}

}
