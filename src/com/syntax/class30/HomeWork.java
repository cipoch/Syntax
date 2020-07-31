/*
 Homework:
1. go to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
2. Fill out the sign up form
3. Click on register
4. close the browser
 */


package com.syntax.class30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "Users/Konstantin/Desktop/Development/Selenium/drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		//driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("customer.firstName")).sendKeys("Konstantin");
		driver.findElement(By.name("customer.lastName")).sendKeys("Tsypnyatov");
		driver.findElement(By.name("customer.address.street")).sendKeys("3715 Sea Gate Ave");
		driver.findElement(By.name("customer.address.city")).sendKeys("Brooklyn");
		driver.findElement(By.name("customer.address.state")).sendKeys("New York");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("11224");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("917-242-5555");
		driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
		driver.findElement(By.name("customer.username")).sendKeys("Kokoko");
		driver.findElement(By.name("customer.password")).sendKeys("password");
		driver.findElement(By.id("repeatedPassword")).sendKeys("password");
		
		driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.className("button")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}

