package com.simplilearn.inner;

public class RegularInnerClass {

	private int a=12;
	class Inner {
		void display() {
			System.out.println("Welcome to Innre Class");
			System.out.println("Value of a: "+a);
		}
		
	}
	public static void main(String[] args) {
		RegularInnerClass outer=new RegularInnerClass();
		RegularInnerClass.Inner inner=outer.new Inner();
		inner.display();

	}

}
