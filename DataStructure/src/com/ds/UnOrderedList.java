package com.ds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;



public class UnOrderedList {
	Node head;
	
	
	private class Node<T>{
		T data;
		Node next;
		
		Node(T data){
			this.data=data;
			next=null;
		}
		
	}
	
	public  <T> void readFile() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/jayeshkumar/eclipse-workspace/AlgorithmPrograms/InputFiles/BinarySearch.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next()+" ";
			}
			T[] array =(T[]) whole.split(" ");
			//add(array);
			for (T t : array) {
				add(t);
				
			}
			

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public <T> void add(T data) {
		
		
		Node newNode = new Node(data);
			
			if(head==null)
				head=newNode;
			else {
				Node temp;
				temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			
		}
		
	
	public <T> void display() {
		Node temp= head;
		while(temp.next!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	

	public  <T> void getUserInput() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter word you wanna search");
		T input=(T) r.next();
		search(input);
		
	}

	private <T> void search(T input) {
		Node temp;
		temp=head;
		while(temp!=null) {
			if(temp.data.equals(input)) {
				//System.out.println("Found");
				remove(input);
				//temp=temp.next;
				break;
			}
			else {
				temp=temp.next;
			}
			
		}
		if(temp==null) {
			add(input);
		}
		
	}

	private <T> void remove(T input) {
		
		
		if(input.equals(head.data)) { //Removing the first element
			head=head.next;
			return;
		}
		Node temp=head.next;
		Node q=head;
		while(temp!=null) {
			
			
			if(temp.data.equals(input)) {
				//System.out.println(temp.data);
				if(temp.next==null) {
					temp=temp.next;
					q.next=null;
				}
				else {
					q.next=temp.next;
					
					temp=temp.next;
				}
			}
			else {
				q=temp;
				temp=temp.next;
			}
		}
		
	}
	
	public void writeFile() {
		try {
			FileWriter writer = new FileWriter("/Users/jayeshkumar/eclipse-workspace/DataStructure/OutputFiles/OutputUnOrderedList.txt");
			Node temp;
			temp=head;
			while(temp.next!=null) {
				writer.write(temp.data+" ");
				temp=temp.next;
				
			}
			writer.write(temp.data+"");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
