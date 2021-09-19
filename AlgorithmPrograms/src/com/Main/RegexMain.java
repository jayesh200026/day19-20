package com.Main;

import com.regex.Regex;

public class RegexMain {

	public static void main(String[] args) {
		Regex regex = new Regex();
		Regex.getDeatils();
		Regex.readFile();
		System.out.println("Normal file");
		Regex.printText();
		regex.change();

	}

}
