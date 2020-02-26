import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage
{
	WebDriver driver;
	loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void enterUsername(String s)
	{
		driver.findElement(By.name("Email")).sendKeys(s);
	}
	void enterPassword(String s)
	{
		driver.findElement(By.name("Password")).sendKeys(s);
	}
}
