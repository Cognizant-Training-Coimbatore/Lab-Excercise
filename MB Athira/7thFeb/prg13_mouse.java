import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prg13_mouse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement linkComputers = driver.findElement(By.linkText("COMPUTERS"));
		Actions action = new Actions(driver);
		action.moveToElement(linkComputers).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Notebooks")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
