package com.simplilearn.inner;

public class MethodLocalInnerClass {
	private String s="What is your name ?";
	public void display() {
		class Inner{
			void myMethod() {
				System.out.println(s+"\n My name is Sibananda.");
			}
		}
		Inner inner=new Inner();
		inner.myMethod();
	}
	public static void main(String[] args) {
		MethodLocalInnerClass mlic=new MethodLocalInnerClass();
		mlic.display();
	}
}
