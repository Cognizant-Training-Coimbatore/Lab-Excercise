import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard_functions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Asish/table.html");
		driver.findElement(By.id("text1")).sendKeys("123 dhim");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("text2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(1500);
		driver.quit();
	}

}
