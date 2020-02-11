import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home_page
{
	WebDriver driver;
	WebElement registerLink;
	home_page(WebDriver driver)
	{
		this.driver=driver;
	}
	void clickRegisterLink()
	{
		registerLink= driver.findElement(By.linkText("Register"));
		registerLink.click();
	}
}
