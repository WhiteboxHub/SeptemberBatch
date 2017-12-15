package com.wbl.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wbl.page.SearchResultsPage;


public class CommonPage {

	protected WebDriver driver;
	@FindBy(how=How.ID,using="global-search-input")
	WebElement searchBox;	
	@FindBy(how= How.CSS,using="[type=submit]")
       WebElement submitButton;
	@FindBy(how= How.CSS,using=".header-GlobalEyebrowNav-link")
    List< WebElement> navLinks;
	
	@FindBy(how= How.XPATH,using="/html//div[@class='js-content']/div[@class='page-wrapper']/div[@class='body-wrapper']//header[@class='header-Header']//nav[@class='header-HeaderPrimary-eyebrowNavWrapper hide-content-max-l']/div/div/button[@type='button']")
    List< WebElement> headerDropdown;
	@FindBy(how= How.CSS,using=".header-GlobalEyebrowNav-link")
    List< WebElement> dropDownList;
	
	public CommonPage(WebDriver driver) {
		this.driver = driver;
	}

	public SearchResultsPage search(String searchdata){
		searchBox.sendKeys(searchdata);
	       submitButton.click();
	       return PageFactory.initElements(driver, SearchResultsPage.class);
	}
	
	
	
	
	/*public String search(String searchdata) {
       searchBox.sendKeys(searchdata);
       submitButton.click();
		return driver.getTitle();
	}*/

	public int headerNavLinks() {
		return navLinks.size();
		//return driver.findElements(By.cssSelector(".header-GlobalEyebrowNav-link")).size();

	}

	public void headerModerDropDown() {
			List<WebElement> elements = driver.findElements(By.xpath("/html//div[@class='js-content']/div[@class='page-wrapper']/div[@class='body-wrapper']//header[@class='header-Header']//nav[@class='header-HeaderPrimary-eyebrowNavWrapper hide-content-max-l']/div/div/button[@type='button']"));
		Actions act = new Actions(driver);
		for (WebElement elm : elements) {
			act.moveToElement(elm).perform();
		List<WebElement> elms = driver.findElements(By.cssSelector(".header-GlobalEyebrowNav-flyout-listItem font-normal"));
			for (WebElement elmt : elms) {
				System.out.println(elmt.getText());
			}
		}
	}

	public int footerLinks() {
		return driver.findElements(By.cssSelector(".heading-f.footer-GlobalFooterItems-heading")).size();
	}
public String getTitle(){
	return driver.getTitle();
}
}
