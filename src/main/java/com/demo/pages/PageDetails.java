package com.demo.pages;

import java.util.Map;
import org.openqa.selenium.By;
import com.demo.base.BasePage;

public class PageDetails extends BasePage{

	By firstName=By.id("tooltip-1");
	By lastName=By.id("sname");
	By address=By.id("yaddress");
	By town=By.name("town");
	By country=By.name("country");
	
	public void goToURL(String url) {
		driver.get(url);
	}
	
	public void fillPageDetails(Map<String, String> pageData) {
		driver.findElement(firstName).sendKeys(pageData.get("firstName"));
		driver.findElement(lastName).sendKeys(pageData.get("lastName"));
		driver.findElement(address).sendKeys(pageData.get("address"));
		driver.findElement(town).sendKeys(pageData.get("town"));
		driver.findElement(country).sendKeys(pageData.get("country"));		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
