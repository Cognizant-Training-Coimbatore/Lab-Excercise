package excersice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrationPage {
	WebDriver driver;
	WebElement Gender,Firstname,Lastname,Email,Password,ConfirmPassword,register;
	registrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	void selectgender(int i)
	{
		List<WebElement> gender=driver.findElements(By.name("Gender"));
		gender.get(i).click();
	}
	void Firstname(String s)
	{
		Firstname=driver.findElement(By.id("FirstName"));
		Firstname.sendKeys(s);
		
	}
	void Lastname(String s)
	{
		Lastname=driver.findElement(By.id("LastName"));
		Lastname.sendKeys(s);
	}
	void Email(String s)
	{
		Email=driver.findElement(By.id("Email"));
		Email.sendKeys(s);
	}
	void Password(String s)
	{
		Password=driver.findElement(By.id("Password"));
		Password.sendKeys(s);
	}
	void ConfirmPassword(String s)
	{
		ConfirmPassword=driver.findElement(By.id("ConfirmPassword"));
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
		register=driver.findElement(By.id("register-button"));
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
	

}
