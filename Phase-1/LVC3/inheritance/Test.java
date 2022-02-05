package com.simplilearn.inheritance;
class A{
	int i;
	void m1() {
		System.out.println("Value of i= "+i);
	}
}
class B extends A{
	int j;
	void m2() {
		System.out.println("value of j= "+j);
	}
}
public class Test {

	public static void main(String[] args) {
		B b1=new B();
		b1.i=10;
		b1.j=20;
		b1.m1();
		b1.m2();
	}
}
