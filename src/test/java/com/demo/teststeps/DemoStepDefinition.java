package com.demo.teststeps;

import com.demo.utilities.ExcelUtility;
import com.demo.common.AbstractStepDefinition;
import com.demo.common.PropertyManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.io.IOException;
import java.util.Map;

public class DemoStepDefinition extends AbstractStepDefinition {

	private Map<String, String> pageData;
	PropertyManager propertyManager;
	
	@Given("with {string} user is on the testing blog site")
	public void userOnTestingSite(String testData) throws IOException {
		propertyManager=new PropertyManager();
		String filePath = propertyManager.getFilePath();
        pageData = ExcelUtility.getColumnData(filePath, "Sheet1", testData);
        String url=propertyManager.getURL();
        pageDetails.goToURL(url);
	}
	
	@When("user fills the details in the page")
	public void userFillsPageDetails() throws IOException {
		pageDetails.fillPageDetails(pageData);
	}
	
	@Then("user closes the browser")
	public void userClosesBrowser() throws IOException {
		pageDetails.closeBrowser();
	}
}
