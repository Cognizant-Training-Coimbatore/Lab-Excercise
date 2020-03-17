package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src/test/resources/Features/A_Services.feature", "src/test/resources/Features/B_CompanyInfo.feature",
				"src/test/resources/Features/C_Search.feature", "src/test/resources/Features/D_Category.feature",
				"src/test/resources/Features/E_NewsLetter.feature", "src/test/resources/Features/F_EndtoEnd.feature"},
		glue = "stepDefenition")
public class Adidas_Home_Runner
{
	
}