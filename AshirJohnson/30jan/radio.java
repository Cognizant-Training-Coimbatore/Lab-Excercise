package demoWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		WebElement login=driver.findElement(By.linkText("Register"));
		login.click();
		List<WebElement> gender =driver.findElements(By.className("Gender"));
		gender.get(1).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
