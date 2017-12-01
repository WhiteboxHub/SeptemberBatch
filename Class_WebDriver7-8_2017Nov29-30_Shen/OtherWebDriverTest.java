package com.wbl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OtherWebDriverTest {

	@Test(enabled=false)
	public void useTables(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.nasdaq.com/");
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 500)");
		//List<WebElement>  tab = driver.findElements(By.cssSelector("#indexTable > thead > tr > th"));
		//body > table > tbody > tr:nth-child(1)
		
		driver.get("file:///C:/Users/WBL/Desktop/Table.html");
		List<WebElement>  tab = driver.findElements(By.cssSelector("body > table > tbody > tr:nth-child(1)"));
		
		for(WebElement e : tab)
			 System.out.println(e.getText());
		Assert.assertEquals(tab.size(),1);
		//  //*[@id="indexTable"]/tbody/tr/td[2]  xpath
		//  #indexTable>tbody>tr>td:nth-child(2)  CSS
		  tab = driver.findElements(By.cssSelector("body > table > tbody > tr > td:nth-child(2)"));
		
		for(WebElement e : tab)
			 System.out.println(e.getText());
		
		Assert.assertNotNull(tab.get(0));
		
		Select sel = new Select(driver.findElement(By.name("cars")));
		
		System.out.println("Multiple selection : "+ sel.isMultiple());
		
		sel.selectByIndex(0);
		sel.selectByVisibleText("Saab");
		sel.selectByValue("opel");
		
		tab = sel.getAllSelectedOptions();
		
		for(WebElement e : tab)
			 System.out.println(e.getText());
		

	}
	
	@Test(enabled=false)
	public void useFrames() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		WebElement frame1 = driver.findElement(By.name("packageListFrame"));
		WebElement frame2 = driver.findElement(By.name("packageFrame"));
		WebElement frame3 = driver.findElement(By.name("classFrame"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("/html/body/div/ul[1]/li[10]/a")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li/dl[2]/dd/a[1]")).click();

	}
	
	

	
	
	
	
}
