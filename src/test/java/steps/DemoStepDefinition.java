package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Constants;
import utilities.ExcelUtility;
import utilities.PropertyManager;
import io.cucumber.java.en.Then;
import java.io.IOException;
import java.util.Map;

import common.AbstractStepDefinition;

public class DemoStepDefinition extends AbstractStepDefinition {

	private Map<String, String> testData;
	PropertyManager propertyManager;
	
	@Given("^{string} user is on the testing blog site$")
	public void userOnTestingSite(String testCol) throws IOException {
        testData = ExcelUtility.getColumnData(Constants.FILEPATH,Constants.SHEET_NAME, testCol);
		propertyManager=new PropertyManager();
        getDriver().get(propertyManager.getURL());
	}
	
	@When("^user fills the details in the page with data$")
	public void userFillsPageDetails() throws IOException {
		pageDetails.fillPageDetails(testData);
	}
	
	@Then("^user verifies the page title$")
	public void userVerifiesPage() throws IOException {
		pageDetails.userVerifiesPage();
	}
}
