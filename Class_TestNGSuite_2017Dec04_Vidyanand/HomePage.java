package com.walmart;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.walmart.com/");
		
	}
	
	
	
	
	@Test
	public void Homepage()
	{
		
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Logovalidate() throws InterruptedException
	{
		String beforeclick=driver.getCurrentUrl();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html//a[@id='header-Logo']")).click();///clicking on logo
		String after_click=driver.getCurrentUrl();
		if(beforeclick!=after_click)
		{
			System.out.println("Walmart Logo is working");
		}
		
	}
	
	
	
	@Test(priority=3)
	public void All_dropdown() throws InterruptedException
	{
		
		WebElement element=driver.findElement(By.id("listboxActive"));
		element.click();
		Thread.sleep(3000);
		List <WebElement> elements=driver.findElements(By.xpath("/html//form[@id='global-search-form']/div/div[1]/div/div"));
		int size_box=elements.size();
		System.out.println("========"+size_box);
		Thread.sleep(2000);
		for(int i=1;i<=9;i++)
		{
			///html//form[@id='global-search-form']//div[@role='menu']/div[1]/button[1]
			driver.findElement(By.xpath("/html//form[@id='global-search-form']//div[@role='menu']/div[1]/button["+i+"]")).click();
			Thread.sleep(3000);
			try{
				
				driver.findElement(By.id("listboxActive")).click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Issue in list");
				
			}
			
			
		}
	
	}
	
	/*@Test
	public void Catogry_test() throws InterruptedException
	{
		
		//int element=driver.findElement(By.xpath("/html//form[@id='global-search-form']/div/div[1]/div/div"));
		//int size=driver.findElement(By.xpath("/html//form[@id='global-search-form']/div/div[1]/div/div")).getSize();
		
		List <WebElement> elements=driver.findElements(By.xpath("/html//form[@id='global-search-form']/div/div[1]/div/div"));
		int size_box=elements.size();
		System.out.println("========"+size_box);
		Thread.sleep(2000);
		for(int i=1;i<=9;i++)
		{
			///html//form[@id='global-search-form']//div[@role='menu']/div[1]/button[1]
			driver.findElement(By.xpath("/html//form[@id='global-search-form']//div[@role='menu']/div[1]/button["+i+"]")).click();
			Thread.sleep(3000);
			try{
				
				driver.findElement(By.id("listboxActive")).click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Issue in list");
				
			}
			
			
		}
	*/	
		
		
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	
	
	
	

}
