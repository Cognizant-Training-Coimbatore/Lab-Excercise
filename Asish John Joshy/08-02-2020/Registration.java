import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
	WebElement loginLink;
	WebDriver driver;
	Registration(WebDriver driver)
	{
		this.driver=driver;
	}
	void LoginPage() throws InterruptedException
	{
		loginLink=driver.findElement(By.linkText("Register"));
		loginLink.click();
		//
		driver.findElement(By.id("FirstName")).sendKeys("ash");
		driver.findElement(By.id("LastName")).sendKeys("josh");
		driver.findElement(By.id("Email")).sendKeys("josh1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}
}
