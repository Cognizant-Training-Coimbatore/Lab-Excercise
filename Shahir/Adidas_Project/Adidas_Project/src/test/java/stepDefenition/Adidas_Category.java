package stepDefenition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import baseclass.wrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import excelUtility.excelReadWrite;
import pages.Adidas_HomePage;
import pages.Adidas_InstaPage;
import pages.Adidas_MensPage;
import pages.Adidas_SportsPage;

public class Adidas_Category extends wrapperClass
{
	ChromeOptions options;
	excelReadWrite excel;
	Adidas_SportsPage sports;
	Adidas_InstaPage insta;
	Adidas_MensPage men;
	Adidas_HomePage home;
	
	@Given("^I want to launch application$")
	public void i_want_to_launch_application()
	{
		driver.navigate().to("https://www.adidas.co.in");
	}

	@When("^I want to load Sports menu$")
	public void i_want_to_load_Sports_menu() throws IOException, InterruptedException
	{
		
		sports = new Adidas_SportsPage(driver);
		excel = new excelReadWrite();
		
		int i;
		String choice;
		for(i=0; i<=5; i++)
		{
			choice = excel.excelRead("Keyword", i, 1);
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
			else
		  	{
		  		System.out.println("Cannot find element");
			}
		}
		
		System.out.println("Done");
	}

	@Given("^I want to go to home page$")
	public void i_want_to_go_to_home_page()
	{
		driver.navigate().to("https://www.adidas.co.in");
		System.out.println("Navigated");
	}

	@When("^I want to load Shop menu$")
	public void i_want_to_load_Shop_menu() throws IOException, InterruptedException
	{
		men = new Adidas_MensPage(driver);
		excel = new excelReadWrite();
		
		int i;
		for(i=0; i<=5; i++)
		{
			if(excel.excelRead("Keyword", i, 1).equalsIgnoreCase("Shop"))
			{
				men.select_shop();
				men.select_mens();
				men.select_men();
				men.select_SweatShirt();
				driver.findElement(By.xpath("//*[@id=\"facetBody\"]/div[4]/div")).click();
				men.select_hoodie();
				men.select_size();
				men.select_addToCart();
				men.select_chechkOut();
				screenshot("/Users/shahir/eclipse-workspace/Adidas_Project/src/test/resources/Screenshot/mens.png");
			}
			else
		  	{
		  		System.out.println("Cannot find element");
			}
		}
	}

	@Given("^I want to go to home page again$")
	public void i_want_to_go_to_home_page_again()
	{
		driver.navigate().to("https://www.adidas.co.in");
		System.out.println("Navigated");
	}

	@When("^I want to load Brand menu$")
	public void i_want_to_load_Brand_menu() throws InterruptedException, IOException
	{
		insta = new Adidas_InstaPage(driver);
		excel = new excelReadWrite();
		home = new Adidas_HomePage(driver);
		
		home.select_shop();
		TimeUnit.SECONDS.sleep(1);
		home.select_brands();
		TimeUnit.SECONDS.sleep(1);
		home.select_originals();
		TimeUnit.SECONDS.sleep(1);
		
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
}
