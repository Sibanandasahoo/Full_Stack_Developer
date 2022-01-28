package com.simplilearn.collection;

import java.util.Vector;
import java.util.Scanner;
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		String name;
		char a;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter list name: ");
			while(true) {
			 name=sc.next();
				vector.add(name);
				System.out.println("add name?(y/n) :");
				a=sc.next().charAt(0);
				if(a=='n'||a=='N') break;
			}

				System.out.println(vector.get(2));
				
				System.out.println("Size: "+vector.size());
				
				System.out.println(vector);
	}
}
