package demowedbdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		int i;
		for(i=0;i<5;i++) {
		String username;
		Random rand=new Random();
		int randomnumber=rand.nextInt(1000);
		username="user"+randomnumber+"@gmail.com";
		System.out.println(username);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Fakama");
		driver.findElement(By.id("LastName")).sendKeys("saifunnisa");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys("12345$");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("12345$");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		}
		driver.quit();
		
	}

}
