package com.simplilearn.collection;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		String name;
		int id;
		char a;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter ID");
		id=sc.nextInt();
		System.out.println("Enter name: ");
		name=sc.next();
		map.put(id,name);
		System.out.println("add name?(y/n) :");
		a=sc.next().charAt(0);
		if(a=='n'||a=='N') break;
	
	}
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
