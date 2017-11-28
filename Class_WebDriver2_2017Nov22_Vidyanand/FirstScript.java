package com.OrgangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");// username
		driver.findElement(By.xpath("/html//input[@id='txtUsername']")).sendKeys("Admin");// username
		Thread.sleep(2000);
		//driver.findElement(By.id("txtPassword")).sendKeys("admin");//password
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");//password
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("title--------"+driver.getTitle());
		
		System.out.println("CurrentURL------"+driver.getCurrentUrl());
		
		
		
		
	}
	

}
