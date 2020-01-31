package demoWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class click_link_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login =driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement username =driver.findElement(By.linkText("Email"));
		username.sendKeys("soumya");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit(); 

	}

}
