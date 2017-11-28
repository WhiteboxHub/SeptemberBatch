package com.OrgangeHRM;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Script2 {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		Thread.sleep(2000);
		
		
		/*driver.findElement(By.xpath("/html//input[@id='txtUsername']")).sendKeys("Admin");// username
		Thread.sleep(2000);
		//driver.findElement(By.id("txtPassword")).sendKeys("admin");//password
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");//password
		*/
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.name("Submit")).click();
		
		System.out.println("title--------"+driver.getTitle());
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
		//driver.quit();
	}

	
	@BeforeMethod
	public void REfresh()
	{
		driver.navigate().refresh();
	}
	
	
	@AfterMethod
	public void navigatetocommonURL() throws InterruptedException
	{
		driver.navigate().refresh();
	}
	
	
	/*@Test
	public void method1() throws InterruptedException
	{
		
		//driver.get("http://opensource.demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		driver.findElement(By.name("cusid")).sendKeys("15");
		driver.findElement(By.name("submit")).click();
		
		/// now handle alert
		
		  // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        
        
        // accept one more time-----
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();		
		
        // Capturing alert message.    
        String alertMessage1= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert1.accept();	
        driver.close();
		driver.quit();
		
		
	}*/
	
	/*@Test
	public void method2()
	{
		 String baseURL = "http://demo.guru99.com/selenium/newtours/register.php";
		    
			driver.get(baseURL);

			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("ANTARCTICA");

			//Selecting Items in a Multiple SELECT elements
			driver.get("http://jsbin.com/osebed/2");
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			fruits.selectByIndex(1);
	}
	*/
	
	
	@Test
	public void method3() throws InterruptedException
	{

        driver = new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL

        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        // Store and Print the name of the First window on the console

        String handle= driver.getWindowHandle();

        System.out.println(handle);
        
        driver.manage().window().maximize();

        // Click on the Button "New Message Window"

        driver.findElement(By.id("button1")).click();

        // Store and Print the name of all the windows open	              

        Set handles = driver.getWindowHandles();

        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

        	System.out.println(handle1);

        	driver.switchTo().window(handle1);

        	}
        
        Thread.sleep(5000);

        // Closing Pop Up window

        /*driver.close();

        // Close Original window

        driver.quit();*/
	}
	
	
	
	
}
