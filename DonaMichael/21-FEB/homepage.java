import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
	WebDriver driver;
	homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void clickRegister()
	{
		driver.findElement(By.linkText("Register")).click();;
	}
	void clickLogin()
	{
		driver.findElement(By.linkText("Log in")).click();
	}
}
