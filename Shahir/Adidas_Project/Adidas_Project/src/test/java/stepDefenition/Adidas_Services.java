package stepDefenition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import excelUtility.excelReadWrite;
import pages.Adidas_ContactPage;
import pages.Adidas_StoreFinder;

public class Adidas_Services extends wrapperClass
{
	@Given("^I am on the homepage to click on Contact Us$")
	public void i_am_on_the_homepage_to_click_on_Contact_Us()
	{
		launchApplication("chrome", "https://www.adidas.co.in");
	}

	@Then("^I enter the details$")
	public void i_enter_the_details() throws InterruptedException, IOException  {
		Adidas_ContactPage contact = new Adidas_ContactPage(driver);
		excelReadWrite excel = new excelReadWrite();
		
		contact.contactus();
		contact.lanuage();
		TimeUnit.SECONDS.sleep(1);
		contact.firstname(excel.excelRead("ContactUs", 1, 1));
		//TimeUnit.SECONDS.sleep(2);
		contact.lastname(excel.excelRead("ContactUs", 1, 2));
		//TimeUnit.SECONDS.sleep(2);
		contact.email(excel.excelRead("ContactUs", 1, 3));
		//TimeUnit.SECONDS.sleep(2);
		contact.subject(excel.excelRead("ContactUs", 1, 4));
		//TimeUnit.SECONDS.sleep(2);
		contact.telephone(excel.excelRead("ContactUs", 1, 5));
		//TimeUnit.SECONDS.sleep(2);
		contact.comment(excel.excelRead("ContactUs", 1, 6));
		TimeUnit.SECONDS.sleep(2);
		//contact.captcha();
		//contact.submit();
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/contactsuss.png");
	}

	@Given("^I am on the homepage to click on Store Finder$")
	public void i_am_on_the_homepage_to_click_on_Store_Finder()
	{
		driver.navigate().to("https://www.adidas.co.in");
	}

	@Then("^I do a search for a store in a location$")
	public void i_do_a_search_for_a_store_in_a_location() throws InterruptedException, IOException {
	    Adidas_StoreFinder store = new Adidas_StoreFinder(driver);
	    store.click_storefinder();
	}
}
