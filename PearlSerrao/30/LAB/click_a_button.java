import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_a_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.linkText("log in"));
		login.click();
		//System.out.println(driver.getTitle());
	 	WebElement submit=driver.findElement(By.xpath(""));
		submit.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
