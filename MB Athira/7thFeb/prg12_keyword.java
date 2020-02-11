import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg12_keyword 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/MBAthira/javascript/webdriverexp1.html");
		driver.findElement(By.id("text1")).sendKeys("123");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("text2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
	}

}
