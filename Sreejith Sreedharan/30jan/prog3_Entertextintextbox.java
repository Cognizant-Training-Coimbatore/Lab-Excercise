package demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog3_Entertextintextbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement username=driver.findElement(By.id("Email"));
	username.sendKeys("sreejith0297@gmail.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
       
	}

}
