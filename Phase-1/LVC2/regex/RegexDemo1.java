package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="([a-z0-9]+)@gmail.com";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher("123siba@gmail.com");
		System.out.println(m.matches());
		System.out.println(m.equals(m));
		
		String s = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p1 = Pattern.compile(s);
		Matcher c = p1.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );

	}

}
