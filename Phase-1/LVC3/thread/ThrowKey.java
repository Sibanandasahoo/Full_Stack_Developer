package com.simplilearn.thread;

import java.util.Scanner;

public class ThrowKey {
	void check(int age) {
		try {
		if (age<18)
			throw new ArithmeticException("Age is not eligible for vote");
		else
			System.out.println("Result :Congratulation.. \n\tYou are eligible for vote");
		}
		catch(ArithmeticException e) {
			System.out.println("Result : "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		ThrowKey thr=new ThrowKey();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
			thr.check(age);
		
		}
}
