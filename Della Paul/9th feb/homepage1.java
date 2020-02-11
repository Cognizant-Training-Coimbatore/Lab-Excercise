import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class homepage1
{
	WebDriver driver;
	WebElement registerLink;
	homepage1(WebDriver driver)
	{
		this.driver=driver;
	}
	void enterUsername(String s)
	{
		WebElement username = driver.findElement(By.name("Email"));
		username.sendKeys(s);
	}
	void enterPassword(String s)
	{
		 WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys(s);
	}
	void log()
	{
		WebElement log=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
		log.click();
	}

}
