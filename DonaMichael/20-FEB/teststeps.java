package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps 

{
	WebDriver driver;
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
	   System.out.println("Firefox opened");
	   driver.get("http://demowebshop.tricentis.com");
	}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password() throws Throwable 
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("Dona");
		driver.findElement(By.name("Password")).sendKeys("pas123");
	   
	}

	@Then("^the user is able to go to the HOME page$")
	public void the_user_is_able_to_go_to_the_HOME_page() throws Throwable
	{
		System.out.println("User goes to the HOME page");
		driver.quit();
	}

}
