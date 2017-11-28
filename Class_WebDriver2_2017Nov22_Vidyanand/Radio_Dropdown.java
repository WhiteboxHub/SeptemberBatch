package com.OrgangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");// navigate to the URl
		
		driver.manage().window().maximize();// maximizing the window
		
		driver.findElement(By.name("firstname")).sendKeys("John");//for first name parameter
		driver.findElement(By.name("lastname")).sendKeys("Dev");// surname lastname/surmane parameter
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_l")).sendKeys("9000000000");//Mobile no/email
		driver.findElement(By.name("reg_passwd__")).sendKeys("john"); //passowrd field
		
		/// one approach to work on Drop down by using Select class-----By VisibleText
		Select sel1=new Select(driver.findElement(By.id("day")));
		sel1.selectByVisibleText("10");
		Thread.sleep(2000);
		
		/// one approach to work on Drop down by using Select class-----ByIndex
		Select sel2=new Select(driver.findElement(By.id("month")));
		sel2.selectByIndex(5);
		Thread.sleep(2000);
		

		/// one approach to work on Drop down by using Select class-----ByValue
		Select sel3=new Select(driver.findElement(By.id("year")));
		sel3.selectByValue("2000");
		
		Thread.sleep(4000);
		
		
		// handle radio  button--
		
		driver.findElement(By.id("u_0_7")).click();// selecting  Male
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("websubmit")).click();
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
