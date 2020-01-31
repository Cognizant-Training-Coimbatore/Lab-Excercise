import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program10_register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		for(int i=0;i<5;i++)
		{
		String uname;
		Random rand = new Random();
		int random = rand.nextInt(1000);
		uname = "user"+random+"@gmail.com";
		System.out.println(uname);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("firstname1");
		driver.findElement(By.id("LastName")).sendKeys("lastname");
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.name("Password")).sendKeys("122322");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("122322");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		}
	driver.quit();
	}

}
