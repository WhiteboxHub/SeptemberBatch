package com.testng;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutor {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("http://www.seleniumhq.org/");  or
		
		driver.navigate().to("http://www.seleniumhq.org/");
		
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		
		
		String xpath="//li[@id='menu_download']/a[@title='Get Selenium']";
		
		
		//explicit wait----
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		
		
		
		
		//Fleuent Wait------
		
		Wait wait1 =new FluentWait(driver).withTimeout(05, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement foo=(WebElement) wait.until(new Function()
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id("foo"));
			}
		});
		
		
		
		
		
		
		
		WebElement element=driver.findElement(By.xpath("//li[@id='menu_download']/a[@title='Get Selenium']"));
		element.click();
	
		
		
		
			  
	//driver.findElement(By.xpath("//li[@id='menu_download']/a[@title='Get Selenium']")).click();
	
	//or 
	
	
		
			
		
	}

}
