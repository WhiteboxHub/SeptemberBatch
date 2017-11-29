package com.wbl.page;

import org.openqa.selenium.WebDriver;

public class SearchItemPage {
	
	WebDriver driver;
	
	public SearchItemPage(WebDriver driver) {
		this.driver = driver;
	}

	public String searchResultsTitle() {
		return driver.getTitle();
	}	
	
}
