package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.page.HomePage;
import com.wbl.page.SearchItemPage;
import com.wbl.page.SearchResultPage;
import com.wbl.base.BaseTest;

public class SearchResultPageTest extends BaseTest{

	HomePage hm;
	
	@Test
	public void searchResultTest() {
		
		hm = new HomePage(driver);
		SearchResultPage sp = hm.clickSearchButton();
		SearchItemPage page = sp.searchResultsMessage();
		Assert.assertTrue(page.searchResultsTitle().contains(sp.getItemSelected()));
	}

	
}
