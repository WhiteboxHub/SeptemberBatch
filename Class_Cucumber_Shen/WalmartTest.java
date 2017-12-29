package com.wbl.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import com.wbl.helper.ConfigUtils;
import com.wbl.helper.Constants;
import com.wbl.helper.WebDriverUtil;
import com.wbl.page.HomePage;
import com.wbl.page.StoreFinderPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WalmartTest {
	
	HomePage hm;
	StoreFinderPage sf;
	WebDriver driver;
	static String url, browser;
	
	@Given("^User is able to access Walmart and click store finder$")
	public void user_is_able_to_access_Walmart_and_click_store_finder() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside the Given method");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://www.walmart.com/store/finder");
	}

	@When("^User enters zipcode and press enter$")
	public void user_enters_zipcode_and_press_enter(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside the When method");
		sf = new StoreFinderPage(driver);
		List<List<String>> userdata=data.asLists(String.class);
		System.out.println(userdata.size());
		for(int i=0;i<userdata.size();i++){
			String s = userdata.get(i).get(0);
			sf.enterZipCode(s);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			System.out.println(sf.getTitle());
			driver.navigate().back();
		}
		
		
	}

	@Then("^User should navigate to store finder page$")
	public void user_should_navigate_to_store_finder_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside the Then method");
		//Assert.assertEquals("Store Finder - Walmart.com",sf.getTitle());
		
		
	}
	

	@Given("^User is able to access Walmart Home Page$")
	public void user_is_able_to_access_Walmart_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("given home page header link");
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
	//	driver = new ChromeDriver();
	  //* driver.get("https://www.walmart.com");
	   hm = new HomePage(driver);
	}

	@When("^User click on \"([^\"]*)\" link$")
	public void user_click_on_link(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when home page header link :: " + link);
		WebElement we;
		switch (link) {
		case "PickupToday":
			we = driver.findElement(By.cssSelector("#header-GlobalEyebrowNav-link-0")); //.click();
			hm.clickGroceryPickUpLink(we);
			break;
		case "GroceryPickUp":
			we = driver.findElement(By.cssSelector("#header-GlobalEyebrowNav-link-1")); //.click();
			hm.clickGroceryPickUpLink(we);
			break;
		
		 case "WeeklyAds":
			 we = driver.findElement(By.cssSelector("#header-GlobalEyebrowNav-link-2")); //.click();
			 hm.clickWeeklyAdLink(we);
			 break;
		
		default:
			System.out.println("No option selected");
		}
	}

	@Then("^User should navigate to \"([^\"]*)\" window$")
	public void user_should_navigate_to_window(String linkWindow) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then home page header link :: "+ linkWindow);
		switch (linkWindow) {
		case "PickupWindow":
			Assert.assertNotNull(driver.getTitle());
			break;
		case "GroceryWindow":
			Assert.assertNotNull(driver.getTitle());
			break;
		
		 case "WeeklyAdWindow":
			 Assert.assertNotNull(driver.getTitle());
			 break;
		
		default:
			System.out.println("No option selected in then");
		}
	}

	@When("^User enters search item and clicks search$")
	public void user_enters_search_item_and_clicks_search(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> userdata=data.asLists(String.class);
		System.out.println(userdata.size());
		for(int i=0;i<userdata.size();i++){
			String s = userdata.get(i).get(0);
		driver.findElement(By.id("global-search-input")).sendKeys(s);
		driver.findElement(By.cssSelector("#global-search-form > div > div:nth-child(3) > button")).click();
		driver.navigate().back();
		}
	}

	@Then("^User should navigate search result page$")
	public void user_should_navigate_search_result_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertTrue(driver.getTitle().contains("Walmart"));
	}
	
	static {
		ConfigUtils configUtils = new ConfigUtils(Constants.RESOURCES_PATH + "config.properties");
		url = configUtils.getProperty("url");
		browser = configUtils.getProperty("browser");
	}
	
	@Before(order=0)
	public void before() {
		System.out.println("In BEFORE METHOD!!!");
		// *System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		//* driver = new ChromeDriver();
		
		driver = WebDriverUtil.getDriver(browser);
		driver.get(url);
	}
	
	@Before(order=1)
	public void before_intialise() {
		System.out.println("In BEFORE initialise METHOD!!!");
		// *System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		//* driver = new ChromeDriver();
		//logic to initialise dependent objects
		
	}

	@After
	public void after() {
		System.out.println("In AFTER METHOD!!!");
		driver.quit();
	}


}
