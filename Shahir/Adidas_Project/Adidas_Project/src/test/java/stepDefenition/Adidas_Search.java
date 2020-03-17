package stepDefenition;

import java.util.concurrent.TimeUnit;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Adidas_HomePage;
import pages.Adidas_SearchPage;

public class Adidas_Search extends wrapperClass
{
	@Given("^I am on the homepage to do a single keyword search$")
	public void i_am_on_the_homepage_to_do_a_single_keyword_search()
	{
		driver.navigate().to("https://www.adidas.co.in");
	}

	@Then("^I do a single keyword search for \\(\\.\\.\\.\\)$")
	public void i_do_a_single_keyword_search_for() throws Throwable {
	    Adidas_SearchPage search = new Adidas_SearchPage(driver);
	    search.click_valid_search();
	    TimeUnit.SECONDS.sleep(5);
	}
	
	@Given("^I navigate back to homepage to do a single keyword search$")
	public void i_navigate_back_to_homepage_to_do_a_single_keyword_search() throws Throwable {
	    Adidas_HomePage home = new Adidas_HomePage(driver);
	    home.select_adidas_logo();
	}

	@Then("^I do an invalid single keyword search for \\(\\.\\.\\.\\)$")
	public void i_do_an_invalid_single_keyword_search_for() throws Throwable {
		 Adidas_SearchPage search = new Adidas_SearchPage(driver);
		 search.click_invalid_search();
	}
}
