import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class q13_loginpage {
	WebDriver driver;
	WebElement username,password;
	q13_loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	void enterUsername(String s)
	{
		username=driver.findElement(By.name("Email"));
		username.sendKeys(s);
		}
	void enterPassword(String s)
	{
		password=driver.findElement(By.name("Password"));
		password.sendKeys(s);
	}
	void log()
	{
		WebElement log=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
		log.click();
	}
	
}
