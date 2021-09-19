package com.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	final String NAME= "<<name>>";
	final String FULLNAME="<<full name>>";
	final String MOBILE="[x]{10}";
	final String DATE="01/01/2016";
	
	static String text;
	
	static UserDetails user = new UserDetails();
	
	public static void getDeatils() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName=scanner.next();
		user.setFirstName(firstName);
		
		System.out.println("Enter your last name");
		String lastName=scanner.next();
		user.setLastName(lastName);
		
		System.out.println("Enter your phone number");
		String phone=scanner.next();
		user.setMobileNo(phone);
		
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		String formatedDate=sdf.format(date);
		
		user.setDate(formatedDate);
	}
	
	public  void change() {
		Pattern p;
		Matcher m;
		
		
		p=Pattern.compile(NAME);
		m=p.matcher(text);
		text=m.replaceAll(user.getFirstName());
		
		p=Pattern.compile(FULLNAME);
		m=p.matcher(text);
		text=m.replaceAll(user.getFirstName()+" "+user.getLastName());
		
		
		p=Pattern.compile(MOBILE);
		m=p.matcher(text);
		text=m.replaceAll(user.getMobileNo());
		
		p=Pattern.compile(DATE);
		m=p.matcher(text);
		text=m.replaceAll(user.getDate());
		
		System.out.println("after performing regex operartion");
		printText();
		
	}
	
	public static  void readFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/jayeshkumar/eclipse-workspace/AlgorithmPrograms/InputFiles/Regex.txt"));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			text=sb.toString();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printText() {
		System.out.println(text);
	}
	
	
	
	
	

}
