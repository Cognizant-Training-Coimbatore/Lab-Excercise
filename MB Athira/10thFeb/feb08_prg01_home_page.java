import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class feb08_prg01_home_page 
{
	WebDriver driver;
	WebElement registerLinks;
	
	feb08_prg01_home_page(WebDriver driver)
	{
		this.driver = driver;
	}
	void clickRegisterLinks()
	{
		registerLinks = driver.findElement(By.linkText("Register"));
		registerLinks.click();
	}
	
}