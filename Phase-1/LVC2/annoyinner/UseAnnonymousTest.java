package com.simplilearn.annoyinner;

public class UseAnnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Car Start");
				
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("Car stop");
			}
			
		};
		c.start();
		c.stop();
		
	}

}
