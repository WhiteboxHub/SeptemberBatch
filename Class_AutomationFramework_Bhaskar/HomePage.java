package com.wbl.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.wbl.base.CommonPage;

public class HomePage extends CommonPage {
	@FindBy(how=How.CSS,using=" .TempoCategoryTileV2-tile-overlay")
	List<WebElement> imagesList;
	@FindBy(how=How.CSS,using=(".ClickThroughImage"))
	List<WebElement> sliderimages;
	

//page classes are dependent on driver object and we need to
//inject driver to all page classes
// dependendency injection in java
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
public int imagesList(){
	return imagesList.size();
	//1.//       return driver.findElements(By.cssSelector(".TempoCategoryTileV2-tile-overlay")).size();
	}
public int sliderimages(){
	//return driver.findElements(By.xpath("/html/body/div/div/div/div/div[3]/div/div/div[1]/span[2]/div/div/div[4]/ul/li")).size();
	//return driver.findElements(By.cssSelector(".MultiStoryPOVResponsive .carousel-paginator-list-mini li")).size();
	//1.//  return driver.findElements(By.cssSelector(".ClickThroughImage")).size();
	return sliderimages.size();
}
	
}
