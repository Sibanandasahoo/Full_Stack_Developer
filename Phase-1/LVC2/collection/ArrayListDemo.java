package com.simplilearn.collection;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
		

		
	String name;
	char a;
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter list name: ");
		while(true) {
		 name=sc.next();
			list.add(name);
			System.out.println("add name?(y/n) :");
			a=sc.next().charAt(0);
			if(a=='n'||a=='N') break;
		
		}
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.contains("siba"));
		
		
		System.out.println("Size: "+list.size());
		
		list.add("test");
		System.out.println("Size: "+list.size());
		
		System.out.println("element from index 3: "+list.get(3));
		
		//print elements using for each loop
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}
}
