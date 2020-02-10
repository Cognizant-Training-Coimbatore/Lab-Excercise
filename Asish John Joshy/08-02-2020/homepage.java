import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage 
{
	WebDriver driver;
	WebElement registerLink;
	homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	void clickRegisterLink()
	{
		registerLink=driver.findElement(By.linkText("Log in"));
		registerLink.click();
	}
}
