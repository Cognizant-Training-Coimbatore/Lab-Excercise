package stepDefenition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.excelReadWrite;
import pages.Adidas_ContactPage;
import pages.Adidas_End;
import pages.Adidas_InstaPage;
import pages.Adidas_NewsLetter;
import pages.Adidas_Search;
import pages.Adidas_SportsPage;
import pages.Adidas_StoreFinder;

public class Adidas_Contact extends wrapperClass
{
	ChromeOptions options;
	excelReadWrite excel;
	Adidas_ContactPage contact;
	Adidas_SportsPage sports;
	Adidas_NewsLetter newsletter;
	Adidas_StoreFinder storefinder;
	Adidas_Search search;
	Adidas_InstaPage insta;
	Adidas_End end;
	
	@Given("^I want to launch application$")
	public void i_want_to_launch_application()
	{
		launchApplication("chrome", "https://www.adidas.co.in");
	}

	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		contact = new Adidas_ContactPage(driver);
		excel = new excelReadWrite();
		
		contact.contactus();
		contact.lanuage();
		TimeUnit.SECONDS.sleep(1);
		contact.firstname(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 0));
		//TimeUnit.SECONDS.sleep(2);
		contact.lastname(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 1));
		//TimeUnit.SECONDS.sleep(2);
		contact.email(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 2));
		//TimeUnit.SECONDS.sleep(2);
		contact.subject(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 3));
		//TimeUnit.SECONDS.sleep(2);
		contact.telephone(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 4));
		//TimeUnit.SECONDS.sleep(2);
		contact.comment(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 5));
		TimeUnit.SECONDS.sleep(2);
		//contact.captcha();
		contact.submit();
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/contactsuss.png");
	}
	*/
	
	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		sports = new Adidas_SportsPage(driver);
		excel = new excelReadWrite();
		
		int i;
		String choice;
		for(i=1; i<=3; i++)
		{
			choice = excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/key.xlsx", i, 0);
			if(choice.equalsIgnoreCase("Sports"))
			{
				sports.select_sports();
				sports.select_football();
				sports.select_allshoe();
				sports.select_shoemodel();
				sports.select_shoesize();
				sports.select_addtobag();
				sports.select_checkout();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/sports.png");
			}
			if(choice.equalsIgnoreCase("ContactUs"))
			{
				contact = new Adidas_ContactPage(driver);
				driver.navigate().to("https://www.adidas.co.in");
				TimeUnit.SECONDS.sleep(2);
				ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(newtab.get(2));
				contact.contactus();
				contact.lanuage();
				TimeUnit.SECONDS.sleep(1);
				contact.firstname(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 0));
				//TimeUnit.SECONDS.sleep(2);
				contact.lastname(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 1));
				//TimeUnit.SECONDS.sleep(2);
				contact.email(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 2));
				//TimeUnit.SECONDS.sleep(2);
				contact.subject(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 3));
				//TimeUnit.SECONDS.sleep(2);
				contact.telephone(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 4));
				//TimeUnit.SECONDS.sleep(2);
				contact.comment(excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx", 1, 5));
				//TimeUnit.SECONDS.sleep(2);
				//contact.captcha();
				//contact.submit();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/contactus.png");
			}
		}
	}
	*/
	
	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		search = new Adidas_Search(driver);
		excel = new excelReadWrite();
		
		search.click_search();
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/search.png");
	}
	*/
	
	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		storefinder = new Adidas_StoreFinder(driver);
		excel = new excelReadWrite();
		
		storefinder.click_storefinder();
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/storefinder.png");
	}
	*/
	
	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		newsletter = new Adidas_NewsLetter(driver);
		excel = new excelReadWrite();
		
		newsletter.sign_in();
		newsletter.click_continue_as_guest();
		newsletter.new_customer();
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/newsletter.png");
	}
	*/
	
	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		insta = new Adidas_InstaPage(driver);
		excel = new excelReadWrite();
		
		insta.click_On_insta();
		TimeUnit.SECONDS.sleep(2);
	  	insta.click_igtv();
	  	TimeUnit.SECONDS.sleep(2);
	  	insta.video_play();
	  	TimeUnit.SECONDS.sleep(2);
	  	insta.click_play();
	  	TimeUnit.SECONDS.sleep(2);
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/insta.png");
	}
	*/
	
	
	/*
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		men = new Adidas_MensPage(driver);
		excel = new excelReadWrite();
		
		if(obj.excelRead(1).equalsIgnoreCase("Shop"))
	  	{
	  		System.out.println("hello 2");
		  	men.select_men();
		  	men.select_SweatShirt();
		  	men.select_hoodie();
		  	men.select_size();
		  	men.select_addToCart();
		  	men.select_chechkOut();
	  	}
	  	else
	  	{
	  		System.out.println("cannot find element");
		}
		screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/insta.png");
	}
	*/
	
	
	@When("^I want to load pages$")
	public void i_want_to_load_pages() throws InterruptedException, IOException
	{
		end= new Adidas_End(driver);
		excel = new excelReadWrite();
		
		int i;
		String choice;
		for(i=0; i<=6; i++)
		{
			choice = excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/key.xlsx", i, 0);
			if(choice.equalsIgnoreCase("End"))
			{
				end.fullscript();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/endone.png");
			}
			if(choice.equalsIgnoreCase("Endtwo"))
			{
				end.fullscript2();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/endtwo.png");
			}
		}
		
		//screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/end.png");
	}
	

	@Then("^I want to exit browser$")
	public void i_want_to_exit_browser() throws IOException
	{
		quit();
	}
}
