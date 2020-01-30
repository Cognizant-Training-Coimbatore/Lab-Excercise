import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		for(i=0;i<5;i++)
		{
		String username;
		Random rand=new Random();
		int randno=rand.nextInt(1000);
		username="user"+randno+"@gmail.com";
		System.out.println(username);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Firstname");
		driver.findElement(By.id("LastName")).sendKeys("Lastname");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys("123456!");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456!");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		}
		driver.quit();
	}

}
