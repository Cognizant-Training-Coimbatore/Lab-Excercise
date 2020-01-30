import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class progran5_radio_button {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		List<WebElement> gender = driver.findElements(By.name("Gender"));
		gender.get(0).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
