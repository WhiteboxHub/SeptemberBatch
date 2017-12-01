package com.wbl.page;

import java.util.Set;

//import org.apache.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Cookie;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public SearchResultPage clickSearchButton() {
		driver.findElement(By.id("global-search-input")).sendKeys("laptop");
		driver.findElement(By.cssSelector("#global-search-form > div > div:nth-child(3) > button")).click();
		return new SearchResultPage(driver);
	}
	
	public void mouseHoverDepartment() {
		WebElement dept = driver.findElement(By.id("header-GlobalLefthandNav-toggle-1"));
		Actions action = new Actions(driver);
		action.moveToElement(dept).perform();//mouse hover  build().perform()
		dept = driver.findElement(By.id("superDeptId-0"));
		//WebDriverWait wait = new WebDriverWait(driver,10);
		// dept = wait.until(ExpectedConditions.visibilityOfElementLocated(dept));
		action.moveToElement(dept).perform();
	}
	
	public void useScrolling() {
		// javascript code to check if the page is completely loaded
		((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1200)");
		// document.getElementsByClassName("   ");
		// document.getElementsById("   ");
		
	}
	
	public void learnCookie() {
		    Set <Cookie> set = driver.manage().getCookies();
		    System.out.println("set size "+set.size());
		    for(Cookie e : set)
		    	System.out.println("name="+e.getName() + "#" + e.getExpiry());
		    Cookie cookie = new Cookie("key","value");
		    driver.manage().addCookie(cookie);
		     set = driver.manage().getCookies();
		    System.out.println("set size after adding "+set.size());
		    
		    driver.manage().deleteCookieNamed("key");
		    set = driver.manage().getCookies();
		    System.out.println("set size after deletion "+set.size());
		    
	}
	

}
