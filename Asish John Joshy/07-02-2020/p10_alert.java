import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Asish/table.html");
		driver.findElement(By.id("b1")).click();
		Thread.sleep(3000);
		Alert alertbox=driver.switchTo().alert();
		alertbox.accept();
		Thread.sleep(1500);
		driver.quit();
	}

}
