package com.simplilearn.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		String name;
		char a;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter list name: ");
			while(true) {
			 name=sc.next();
				set.add(name);
				System.out.println("add name?(y/n) :");
				a=sc.next().charAt(0);
				if(a=='n'||a=='N') break;
			
			}
			set.add("Siba");
			
			System.out.println(set);
			
			System.out.println("Is Empty: "+set.isEmpty());
			
			set.remove("Anil");
			
			System.out.println("Size: "+set.size());
	}

}
