package com.ds;

/**
 * @author jayeshkumar This program Implements the Queue operations like
 *         enqueue,dequeue,isEmpty etc
 * 
 */
class Queue<T> {
	Node<T> front;
	Node<T> rear;
	int count = 0;

	@SuppressWarnings("hiding")
	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * Queue constructor
	 */
	public Queue() {
		this.front = null;
		this.rear = null;
	}

	/*
	 * Add the new data with value=item
	 */
	public void enqueue(T item) {
		Node<T> temp = new Node<T>(item);
		if (rear == null) {
			front = temp;
			rear = temp;
			count++;
			return;
		}
		rear.next = temp;
		rear = temp;
		count++;
	}

	/**
	 * Removes the first element added to queue
	 */
	public void dequeue() {
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}
		front = front.next;
		if (front == null) {
			rear = null;
		}
		count--;
	}

	/**
	 * @return number of elements in queue
	 */
	public int size() {
		return count;
	}

	/**
	 * @return true if queue is empty else returns false
	 */
	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}

	/*
	 * Display the content of Queue
	 */
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is emepty");
			return;
		} else {
			Node<T> temp = this.front;
			while (temp.next != null) {
				System.out.print(temp.data + "---->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
