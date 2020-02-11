import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registration_page
{
	WebDriver driver;
	WebElement gender,firstname,lastname,username,password;
	registration_page(WebDriver driver)
	{
		this.driver=driver;
	}
	void selectgender(int i)
	{
		List<WebElement>gender=driver.findElements(By.name("gender"));
		gender.get(1).click();
	}
	void enterfirstname(String s)
	{
		firstname=driver.findElement(By.id("FirstName"));
		firstname.sendKeys(s);
	}
	void enterlastname(String s)
	{
		lastname=driver.findElement(By.id("LastName"));
		lastname.sendKeys(s);
	}
	void enterusername(String s)
	{
		username=driver.findElement(By.name("Email"));
		username.sendKeys(s);
	}
	void enterPassword(String s)
	{

		password =driver.findElement(By.name("password"));
		password.sendKeys(s);
	}
	void ConfirmPassword(String s)
	{
		WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassword.sendKeys(s);
	}
	String getvalues()
	{
		WebElement text_field_element = driver.findElement(By.id("Email"));
		String value = text_field_element.getAttribute("value");
		return(value);
	}
	String getPass()
	{
		WebElement getpassword=driver.findElement(By.id("Password"));
		String pass=getpassword.getAttribute("value");
		return(pass);
	}
	void clickRegister()
	{
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
		
	}
	void logout()
	{
		WebElement logout=driver.findElement(By.linkText("Log out"));
		logout.click();
	}
	void login()
	{
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
	}
	


	void clickRegisterLink() throws InterruptedException
	{
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
		Thread.sleep(5000);
	}
	
}
