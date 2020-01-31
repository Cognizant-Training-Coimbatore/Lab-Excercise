import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e6_register_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username;
		Random rand = new Random();
		int randomnumber = rand.nextInt(1000);
		username = "shahirm" + randomnumber + "@gmail.com";
		System.out.println(username);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Mr");
		driver.findElement(By.id("LastName")).sendKeys("M");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}

}
