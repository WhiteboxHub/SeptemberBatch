package com.wbl.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.wbl.base.CommonPage;

public class SearchResultsPage extends CommonPage{
	
	
	@FindBy(how=How.CSS,using=".chooser-option-current")
	WebElement sortDropDown;
	@FindBy(how=How.CSS,using="[class$='chooser-option']")
	List<WebElement> sortDropDownValues;
	
	@FindBy(how=How.CSS,using=".price-group")
	List<WebElement> prices;
	
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		
	}
public void selectValueFromSortDropDown(String Value){
	sortDropDown.click();
	for(WebElement Val:sortDropDownValues){
		if(Val.getText().equals(Value)){
			Val.click();
			break;
		}
	}
}
public void priceInSearchResults(){
	for(WebElement elm:prices){
		System.out.println(elm.getText());
	}
}
}
