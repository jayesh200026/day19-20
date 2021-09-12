package com.main;

import com.ds.UnOrderedList;

public class UnOrderedListMain {

	public static void main(String[] args) {
		
		UnOrderedList o = new UnOrderedList();
		o.readFile();
		o.display();
		o.getUserInput();
		o.display();
		o.writeFile();
	}

}
