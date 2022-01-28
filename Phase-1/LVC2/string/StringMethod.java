package com.simpillearn.string;
import java.util.Scanner;
public class StringMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str =new String(" Welcome to Mphasis ");
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("S"));
		System.out.println(str.replace("Mphasis","HelloWorld"));
		System.out.println(str.trim());
		
		System.out.println(str.equals("     Welcome to Mphasis      "));
		System.out.println(str.stripLeading().length());
		System.out.println(str.trim().length());
	}

}
