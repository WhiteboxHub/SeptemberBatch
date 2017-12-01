package com.wbl.main;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstWebDriverCode {

	public void test(){
		System.setProperty("webdriver.driver.chrome", 
				"C:/Users/WBL/MedhaWorkspace/JulyWebDriver/resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://whiteboxqa.com/");
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("Tittle on page : " +driver.getTitle());
		
	}
	
	public static void main(String args[])  {
		usePhantomJSDriver();
	}
	public static void desiredCapabilities() {
				
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(chromeOptions);
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability("javascriptEnabled", false);
		System.out.println(dc.getCapability("javascriptEnabled"));
		driver.get("http://www.google.com");
		
		
	}
	
	public static void usePhantomJSDriver() {
	   System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"\\resource\\phantomjs.exe");	
	   WebDriver driver = new PhantomJSDriver();
	   driver.get("http://www.google.com");
	   System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

	}
	
	
	public static void htmlUnitDriver() {
		WebDriver driver = new HtmlUnitDriver();
		//driver.get("https://walmart.com");
		driver.get("http://www.nasdaq.com/");
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 500)");
		List<WebElement>  tab = driver.findElements(By.cssSelector("#indexTable > thead > tr > th"));
		for(WebElement e : tab)
			 System.out.println(e.getText());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

	}
}
