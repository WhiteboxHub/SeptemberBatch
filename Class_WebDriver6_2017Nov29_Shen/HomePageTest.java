package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.SearchResultPage;

public class HomePageTest  extends BaseTest{
	
	HomePage hm;
	
	@Test
	public void clickSearchButtonTest() {
		hm = new HomePage(driver);
		SearchResultPage srp = hm.clickSearchButton();
		Assert.assertEquals(srp.searchResultsTitle(), "laptop - Walmart.com");
	}
	
	

}
