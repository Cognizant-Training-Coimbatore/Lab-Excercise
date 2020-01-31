import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_ddt
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.id("FirstName"));
		fn.sendKeys("Shahir");
		Thread.sleep(2000);
		WebElement ln = driver.findElement(By.id("LastName"));
		ln.sendKeys("Mubarak");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("shahirmubarak22@gmail.com");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("1234");
		Thread.sleep(2000);
		WebElement re_pass = driver.findElement(By.id("ConfirmPassword"));
		re_pass.sendKeys("1234");
		driver.quit();
	}
}