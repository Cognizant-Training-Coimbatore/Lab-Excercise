package demowebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog_demo_Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedirver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com");
WebElement register=driver.findElement(By.linkText("Register"));
register.click();
List<WebElement> gender=driver.findElements(By.name("Gender"));
gender.get(0).click();
Thread.sleep(5000);
driver.quit();	}

}
