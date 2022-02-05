package com.simplilearn.thread;

 class MyThread extends Thread{
	public void run() {
		System.out.println("My thread is running");
	}
}
public class ExtendThread {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
	}
}
