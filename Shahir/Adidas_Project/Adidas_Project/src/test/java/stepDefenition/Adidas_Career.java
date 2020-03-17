package stepDefenition;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Adidas_CareerPage;

public class Adidas_Career extends wrapperClass
{
	@Given("^I am on the homepage to click on careers$")
	public void i_am_on_the_homepage_to_click_on_careers()
	{
		driver.navigate().to("https://www.adidas.co.in");
	}

	@Then("^I do a search for a job$")
	public void i_do_a_search_for_a_job() throws Throwable {
	  Adidas_CareerPage career = new Adidas_CareerPage(driver);
	  career.select_career();
	}
}
