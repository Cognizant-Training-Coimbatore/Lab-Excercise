import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn01_enter_the_store {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://jpetstore.cfapps.io/");
		WebElement submit = driver.findElement(By.linkText("Enter the Store"));
		submit.click();
		Thread.sleep(5000);
		String t = driver.getTitle();
		System.out.println(t);
		driver.quit();
				
		
	}

}
