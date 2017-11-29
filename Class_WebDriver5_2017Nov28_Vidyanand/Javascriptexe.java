package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.seleniumhq.org/");
		
		org.openqa.selenium.JavascriptExecutor jse = (org.openqa.selenium.JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//div[@id='sidebar']/div[@class='ads']//a[@href='/sponsor']")).click();
		
		
		
	}
	
	
}
