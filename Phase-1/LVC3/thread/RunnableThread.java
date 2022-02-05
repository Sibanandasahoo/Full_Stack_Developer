package com.simplilearn.thread;

class MyRunnableThread implements Runnable{
	public void run() {
		System.out.println("MyRunnable Thread is Running");
	}
	
}
public class RunnableThread {
	public static void main(String[] args) {
		MyRunnableThread m=new MyRunnableThread();
		Thread t=new Thread(m);
		t.start();
	}
}
