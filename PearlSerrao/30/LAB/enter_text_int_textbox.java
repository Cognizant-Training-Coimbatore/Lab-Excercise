import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enter_text_int_textbox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Selenium_java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("log in"));
		login.click();
		//System.out.println(driver.getTitle());
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Pearl");
		Thread.sleep(5000);
		driver.quit();
	}
}
