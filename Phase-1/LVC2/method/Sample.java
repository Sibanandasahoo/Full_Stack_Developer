package com.simplilearn.method;
import java.util.Scanner;
public class Sample {
	public void display() {
		System.out.println("Wellcome to java");
	}
	public int add(int a,int b) {
		return a+b;
		
	}
	public boolean valid(int age){
		if (age>=18)
			return true;
		else return false;
	}
	public String fullName(String fname,String lname) {
		return fname+" "+lname;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sample s=new Sample();
		s.display();
		System.out.println("Enter two number to add : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=s.add(a,b);
		System.out.println("a+b= "+result);
		System.out.println("Enter your age:");
		int c=sc.nextInt();
		System.out.println(s.valid(c));
		System.out.println("Enter your first name");
		String s1=sc.next();
		System.out.println("Enter your last name");
		String s2=sc.next();
		System.out.println("your name is : "+s.fullName(s1,s2));
	}
}
