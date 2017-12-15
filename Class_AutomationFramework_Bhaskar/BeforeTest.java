package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wbl.utilities.WebdriverUtil;

public class Beforetest {

	protected WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = WebdriverUtil.getDriver("chrome");
		driver.get("https://www.walmart.com");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}
