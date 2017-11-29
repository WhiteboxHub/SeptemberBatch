package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

}
