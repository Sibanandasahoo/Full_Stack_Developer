package com.simpililearn.array;

public class AdditionTwoTDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{2,6},{4,9}};
		int b[][]= {{4,0},{3,1}};
		int result[][]=new int[2][2];
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				 result[i][j]= a[i][j]+b[i][j];
			}
		}
		System.out.println("Result :");
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
