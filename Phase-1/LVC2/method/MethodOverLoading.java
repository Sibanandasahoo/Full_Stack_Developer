package com.simplilearn.method;
import java.util.Scanner;
public class MethodOverLoading {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public float add(float a,float b,float c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(20,10,39));
		System.out.println(obj.add(21.4,23.3));
		System.out.println(obj.add(21.4,23.3,43.45));
		System.out.println(obj.add(21.45,23.3));
		System.out.println(obj.add(21.4,23.3,45.678));


	}
}
