package com.simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static void main(String[] args) {
		//set the driver Property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		String expc="Google";
		String actual=driver.getTitle();
		if(expc.equals(actual))
			System.out.println("Test Passed..!");
		else
			System.out.println("Test Failed");
	}
}
