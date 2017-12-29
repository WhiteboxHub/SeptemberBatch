package com.wbl.page;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#header-GlobalEyebrowNav-link-0")
	WebElement pickup;
	
	@FindBy(css="#header-GlobalEyebrowNav-link-1")
	WebElement grocerypickup;
	
	@FindBy(css="#header-GlobalEyebrowNav-link-2")
	WebElement weeklyads;
	
	public void clickPickUpLink(WebElement we){
		//pickup = we;
		pickup.click();
	}
	
	public void clickGroceryPickUpLink(WebElement we){
		//grocerypickup = we;
		grocerypickup.click();
	}
	
	public void clickWeeklyAdLink(WebElement we){
		//weeklyads = we;
		weeklyads.click();
	}
	
	
	//#header-GlobalEyebrowNav-button-5
	public void  clickStoreFinder() throws AWTException, InterruptedException {
		System.out.println("in click store finder");
		Thread.sleep(1000);
		WebElement storeFinder = driver.findElement(By.cssSelector("#header-GlobalEyebrowNav-button-5"));
		Actions action = new Actions(driver);
		action.moveToElement(storeFinder).build().perform();
		Thread.sleep(1000);
		action.moveToElement(
				driver.findElement(By.linkText("Store Finder"))).build().perform();
		//driver.findElement(By.partialLinkText("Store Finder")).click();
   }
	
	
	
}
