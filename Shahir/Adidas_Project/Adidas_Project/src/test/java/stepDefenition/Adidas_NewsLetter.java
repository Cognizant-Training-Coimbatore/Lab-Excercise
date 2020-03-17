package stepDefenition;

import java.io.IOException;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import excelUtility.excelReadWrite;
import pages.Adidas_NewsLetterPage;

public class Adidas_NewsLetter extends wrapperClass
{
	Adidas_NewsLetterPage newsletter;
	excelReadWrite excel;
	
	@Given("^I want to go to home page next$")
	public void i_want_to_go_to_home_page_next()
	{
		driver.navigate().to("https://www.adidas.co.in");
	}
	
	@Then("^I want test muliple login credentials$")
	public void i_want_test_muliple_login_credentials() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		newsletter = new Adidas_NewsLetterPage(driver);
		
		newsletter.sign_in();
		newsletter.click_continue_as_guest();
		newsletter.new_customer();
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/newsletter.png");
	}
}
