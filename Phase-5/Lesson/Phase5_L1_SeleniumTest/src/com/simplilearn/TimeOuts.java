package com.simplilearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOuts {

	public static void main(String[] args) {
		// set the driver property
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Selenium\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				WebDriver driver1 = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver1.get("https://www.google.co.in/");
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver1.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
				
				driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
				
				driver.close();

	}

}
