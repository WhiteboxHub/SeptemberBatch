package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.page.SearchItemPage;

public class SearchResultPage {
	WebDriver driver;
	String itemSelected;
	
	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String searchResultsTitle() {
		return driver.getTitle();
	}
	public String getItemSelected() {
		return itemSelected;
	}

	public SearchItemPage searchResultsMessage() {
		WebElement web = driver.findElement(By.cssSelector("#searchProductResult > div.search-result-listview-items > div:nth-child(1) > div > div.tile-content > div.search-result-product-title.listview > span:nth-child(2) > a"));
		//#searchProductResult > div.search-result-listview-items > div:nth-child(1) > div > div.search-result-productimage.listview > div > a
		//#searchProductResult > div.search-result-listview-items > div:nth-child(1) > div > div.tile-content > div.search-result-product-title.listview > span:nth-child(2) > a
		System.out.println(web.getText());
		itemSelected = web.getText();
		web.click();
		return new SearchItemPage(driver);
		
	}

	
	
}
