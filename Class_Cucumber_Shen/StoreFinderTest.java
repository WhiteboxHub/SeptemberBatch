package com.wbl.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.wbl.page.HomePage;
import com.wbl.page.StoreFinderPage;

import cucumber.api.DataTable;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class StoreFinderTest {
	
	HomePage hm;
	StoreFinderPage sf;
	WebDriver driver;
	
	@Given("^User is able to access Walmart and click store finder$")
	public void user_is_able_to_access_Walmart_and_click_store_finder() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside the Given method");
/*		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		hm = new HomePage(driver);
		Thread.sleep(2000);
		hm.clickStoreFinder();*/
	}

	@When("^User enters zipcode and press enter$")
	public void user_enters_zipcode_and_press_enter(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside the When method");
		//sf = hm.enterZipCode();
		List<String> userdata = data.asList(String.class);
		for(int i=0; i<userdata.size();i++){
			  System.out.println(userdata.get(i));
			  //hm.enterZipCode(userdata.get(i));
		}
		
	}

	@Then("^User should navigate to store finder page$")
	public void user_should_navigate_to_store_finder_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside the Then method");
		//Assert.assertEquals("Store Finder - Walmart.com",sf.getTitle());
		
	}

}
