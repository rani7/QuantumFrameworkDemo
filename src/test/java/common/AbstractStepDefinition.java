package common;

import driver.DriverFactory;
import pages.PageDetails;

public class AbstractStepDefinition extends DriverFactory {
	
	public PageDetails pageDetails;
	
	public AbstractStepDefinition(){
		pageDetails=new PageDetails();
	}
}
