package demoWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jan30_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		List<WebElement> gender=driver.findElements(By.name("Gender"));
		gender.get(1).click();
		Thread.sleep(4000);
		driver.quit();
		
				
	}

}
