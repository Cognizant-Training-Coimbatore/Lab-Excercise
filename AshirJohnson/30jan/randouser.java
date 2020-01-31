package demoWebDriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class randouser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username;
		Random rand=new Random();
		int randomnumber=rand.nextInt(1000);
		username ="user"+randomnumber+"@gmail.com";
		System.out.println(username);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		WebElement login=driver.findElement(By.linkText("Register"));
		login.click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.quit();
		Thread.sleep(5000);
	}

}
