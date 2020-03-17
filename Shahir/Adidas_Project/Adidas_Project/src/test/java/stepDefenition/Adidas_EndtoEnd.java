package stepDefenition;

import java.io.IOException;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.excelReadWrite;
import pages.Adidas_End;

public class Adidas_EndtoEnd extends wrapperClass
{
	Adidas_End end;
	excelReadWrite excel;
	
	@Given("^I want to go to home page now$")
	public void i_want_to_go_to_home_page_now()
	{
		driver.navigate().to("https://www.adidas.co.in");
	}

	@When("^I want to automate the login and shopping$")
	public void i_want_to_automate_the_login_and_shopping() throws IOException, InterruptedException
	{
		end= new Adidas_End(driver);
		excel = new excelReadWrite();
		
		int i;
		String choice;
		for(i=0; i<=4; i++)
		{
			choice = excel.excelRead("Keyword", i, 1);
			if(choice.equalsIgnoreCase("End"))
			{
				end.fullscript();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/endone.png");
				end.logout();
			}
			if(choice.equalsIgnoreCase("Endtwo"))
			{
				end.fullscript2();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/endtwo.png");
				end.logout2();
			}
		}
		
		//screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/end.png");
	}

	@Then("^I want to exit browser$")
	public void i_want_to_exit_browser()
	{
	    quit();
	}
	
}
