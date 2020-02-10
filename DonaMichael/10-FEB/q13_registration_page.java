import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class q13_registration_page {
	WebDriver driver;
	WebElement gender,firstname,lastname,email,password,confirmpassword,register;
	q13_registration_page(WebDriver driver)
	{
		this.driver=driver;
	}
	void selectGender(int i)
	{
		List<WebElement> gender=driver.findElements(By.name("Gender"));
		gender.get(i).click();
	}
	void FirstName(String s)
	{
		firstname=driver.findElement(By.name("FirstName"));
		firstname.sendKeys(s);
	}
	void lastName(String s)
	{
		lastname=driver.findElement(By.name("LastName"));
		lastname.sendKeys(s);
	}
	
	void Email(String s)
	{
		email=driver.findElement(By.name("Email"));
		email.sendKeys(s);
	}
	void Password(String s)
	{
		password=driver.findElement(By.name("Password"));
		password.sendKeys(s);
	}
	void confirmPassword(String s)
	{
		confirmpassword=driver.findElement(By.name("ConfirmPassword"));
		confirmpassword.sendKeys(s);
	}
	String getvalues()
	{
		WebElement text_field_element=driver.findElement(By.id("Email"));
		String value=text_field_element.getAttribute("value");
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
