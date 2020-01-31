package demoWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
