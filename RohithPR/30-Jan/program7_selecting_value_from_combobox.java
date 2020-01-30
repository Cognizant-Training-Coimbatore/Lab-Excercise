import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program7_selecting_value_from_combobox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product = new Select(driver.findElement(By.className("catagory_id")));
		product.deselectByVisibleText("Databases");
		Thread.sleep(5000);
		driver.quit();

		

	}

}
