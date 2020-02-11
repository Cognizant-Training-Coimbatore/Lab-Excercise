import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class feb08_prg01_registeration_page 
{
	WebDriver driver;
	WebElement uname, pword, Firstname, Lastname, ConfirmPassword, registerbutton, gender;
	
	feb08_prg01_registeration_page (WebDriver driver)
	{
		this.driver = driver;
	}
	void selectgender()
	{
		List<WebElement> gender = driver.findElements(By.name("Gender"));
		gender.get(1).click();
	}
	void enterFirstname(String p)
	{
		Firstname = driver.findElement(By.name("FirstName"));
		Firstname.sendKeys("Ellen");
	}
	void enterLastname(String p)
	{
		Lastname = driver.findElement(By.name("LastName"));
		Lastname.sendKeys("John");
	}
	void enterUname(String p)
	{
		uname = driver.findElement(By.name("Email"));
		uname.sendKeys("athi123ww@gmail.com");
	}
	void enterPword(String p)
	{
		pword = driver.findElement(By.name("Password"));
		pword.sendKeys("athi123mbttt");
	}
	void enterConfirmPassword(String p)
	{
		ConfirmPassword = driver.findElement(By.name("ConfirmPassword"));
		ConfirmPassword.sendKeys("athi123mbttt");
	}
	void clickregisterbutton()
	{
		registerbutton = driver.findElement(By.id("register-button"));
		registerbutton.click();
	}
	
}
