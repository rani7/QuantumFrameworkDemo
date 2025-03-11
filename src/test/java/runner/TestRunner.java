package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"/QuantumFWDemo/src/test/resources/features"},
			glue = {"com.demo.steps"},
			tags = "@UserSubmitDetails",
	        publish = true,
	        plugin = {"json:target/cucumber-reports/CucumberTestReport.json"}
	        )

public class TestRunner extends AbstractTestNGCucumberTests {
		
	@DataProvider(parallel=true)
    public Object[][] Scenarios() {
        return super.scenarios();
    }

}


