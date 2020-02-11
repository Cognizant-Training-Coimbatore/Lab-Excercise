package demoWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb2_keyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("file:///E:/Revathy/table.html");
		driver.findElement(By.id("text1")).sendKeys("123");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("text2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
	}

}
