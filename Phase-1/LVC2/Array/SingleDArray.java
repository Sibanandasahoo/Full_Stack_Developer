package com.simpililearn.array;

import java.util.Scanner;

public class SingleDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {11,23,23,43,53};
		System.out.println("Length: "+array.length);
		System.out.println(array[4]);
		System.out.println("\nprint array :");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//Another way to create Array:
		
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter number :");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print number :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
