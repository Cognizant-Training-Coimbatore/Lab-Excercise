import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class register_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_java\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			int i;
			ChromeDriverService service= ChromeDriverService.CreateDefaultService(DRIVER_PATH);
			service.Port = <>;
			IWebDriver WebDriver = new ChromeDriver(service);
			for(i=0;i<5;i++) {
				String username;
				Random r=new Random();
				int ranno=r.nextInt(1000);
				username="user"+ranno+"@gmail.com";
				System.out.println(username);
			
				driver.findElement(By.linkText("register")).click();
				driver.findElement(By.id("First name")).click();
				driver.findElement(By.id("Last name")).click();
				driver.findElement(By.id("Email")).click();
				driver.findElement(By.name("Password")).click();
				driver.findElement(By.name("register-button")).click();
				driver.findElement(By.linkText("Log out")).click();
			}
					
	}

}
