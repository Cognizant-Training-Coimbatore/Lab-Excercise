import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_login {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		   WebElement login=driver.findElement(By.linkText("Login"));
		 WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		 username.sendKeys("9536897654");
		 Thread.sleep(2000);
		 WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		 password.sendKeys("della123");
		 Thread.sleep(2000);
		 WebElement submit=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		 submit.click();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
