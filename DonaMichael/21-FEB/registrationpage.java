import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage
{
	WebDriver driver;
	registrationpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void enterFirstName(String s)
	{
		driver.findElement(By.name("FirstName")).sendKeys(s);
	}
	void enterLastName(String s)
	{
		driver.findElement(By.name("LastName")).sendKeys(s);
	}
}