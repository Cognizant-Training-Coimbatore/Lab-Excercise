import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(3000);
		WebElement reg=driver.findElement(By.linkText("Register"));
		reg.click();
		//System.out.println(driver.getTitle());
		
	 	List<WebElement> submit=driver.findElements(By.name("Grnder"));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
