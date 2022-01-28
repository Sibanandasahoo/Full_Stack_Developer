package com.simplilearn.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();
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
			//no order maintain
			System.out.println(set);
			//no duplicates allowed
			set.add("siba");
			
			System.out.println(set);
			System.out.println("Is Empty: "+set.isEmpty());
			
			set.remove("kruti");
			
			System.out.println("Size: "+set.size());
			set.add(null);
			System.out.println(set);

	}

}
