package demoWebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///E:/Zenith/table.html");
		driver.findElement(By.id("b1")).click();
		Thread.sleep(5000);
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
