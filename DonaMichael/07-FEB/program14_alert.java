import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program14_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Batch1%20programs/DemoWebDriver/webdriver.html");
		driver.findElement(By.id("b1")).click();
		Thread.sleep(5000);
		Alert alertbox=driver.switchTo().alert();
		alertbox.accept();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
