package pages;

import java.util.Map;
import org.openqa.selenium.By;

import driver.DriverFactory;

public class PageDetails extends DriverFactory{

	By firstName=By.id("tooltip-1");
	By lastName=By.id("sname");
	By address=By.id("yaddress");
	By town=By.name("town");
	By country=By.name("country");

	public PageDetails() {

	}

	public void fillPageDetails(Map<String, String> testData) {
		getDriver().findElement(firstName).sendKeys(testData.get("firstName"));
		getDriver().findElement(lastName).sendKeys(testData.get("lastName"));
		getDriver().findElement(address).sendKeys(testData.get("address"));
		getDriver().findElement(town).sendKeys(testData.get("town"));
		getDriver().findElement(country).sendKeys(testData.get("country"));		
	}

	public void userVerifiesPage() {
		System.out.println("verified");
	}
}
