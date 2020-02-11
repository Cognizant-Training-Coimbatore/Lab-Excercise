import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage
{
	WebDriver driver;
	WebElement username,password;
	loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	void enterusername(String s)
	{
		username=driver.findElement(By.name("Email"));
		username.sendKeys("della123");
	}
	void enterPassword(String s)
	{
		password =driver.findElement(By.name("password"));
		password.sendKeys("della123");
	}
}
