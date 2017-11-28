package com.OrgangeHRM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/MYPC/Videos/Eclipse_webdriver_jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
		
		String parent =driver.getWindowHandle();
		
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1=s1.iterator();
		
		while(I1.hasNext())
		{
			String child_window=I1.next();
			
			
			if(!parent.equals(child_window))
			{
				
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				
				
				
				
				Thread.sleep(3000);
				//driver.close();
			}
			driver.quit();
			driver.switchTo().window(parent);
			
		}
		
		
		
		
		
		
		
	}

}
