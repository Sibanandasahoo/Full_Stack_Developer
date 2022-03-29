package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest2 {

	public static void main(String[] args) {
		// set the driver property
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Selenium\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				WebElement email= driver.findElement(By.id("email"));
				WebElement pass= driver.findElement(By.id("pass"));
				
				email.sendKeys("sibanandasahoo130@gmial.com");
				pass.sendKeys("Siba143sahoo@");
				
				WebElement login= driver.findElement(By.name("login"));
				login.submit();
				//driver.close();

	}

}
