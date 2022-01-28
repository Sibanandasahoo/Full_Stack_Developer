package com.simplilearn.collection;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
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
		System.out.println("Size "+list.size());
		list.add("siba");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.add(2,"anil");
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}
