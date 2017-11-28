package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) {
		
		
			
		 System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		 WebDriver driver;
		 driver=new ChromeDriver();	
		 
		driver .navigate().to("http://www.seleniumeasy.com/selenium-tutorials/scrolling-web-page-with-selenium-webdriver-using-java");
		
		try{
		for(int i=1;i<=6;i++)
		{
			
			
			
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html//footer[@id='footer']//section/div/div[3]/ul//a[@href='/selenium-webdriver-tutorials']")).click();
			
		}
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			((JavascriptExecutor) driver)
		     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.findElement(By.xpath("/html//footer[@id='footer']//section/div/div[3]/ul//a[@href='/selenium-webdriver-tutorials']")).click();
			
		}
		
		
		
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	/*	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");*/
		System.out.println("------done");
	}

}
