package com.lvl.assistedProject;

public class TypeCasting {

	public static void main(String[] args) {
		// implicitly
		char c='A';
		int i=c;
		System.out.println(i);
		
		int i3=23;
		double d1=i3;
		System.out.println(d1);
		
		
		// explicitly
		int i1=65;
		char c1=(char)i;
		System.out.println(c1);
		
		double d=12.345;
		int i2=(int)d;
		System.out.println(i2);
		
	}

}
