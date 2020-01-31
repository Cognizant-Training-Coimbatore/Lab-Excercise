package demowebdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog15_register {

	public static void main(String[] args) {
String username;

System.setProperty("webdriver.chromedriver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();

for(int i=0;i<5;i++)
{Random rand=new Random();
int randomnumber=rand.nextInt(1000);
	username="user"+randomnumber+"@gmail.com";
System.out.println(username);

driver.get("http://demowebshop.tricentis.com");
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.id("gender-male")).click();
driver.findElement(By.id("FirstName")).sendKeys("firstname1");
driver.findElement(By.id("LastName")).sendKeys("lastname1");
driver.findElement(By.id("Email")).sendKeys(username);
driver.findElement(By.name("Password")).sendKeys("123$Ab");
driver.findElement(By.name("ConfirmPassword")).sendKeys("123$Ab");
driver.findElement(By.name("register-button")).click();
driver.findElement(By.linkText("Log out")).click();
	}driver.quit();
	}
}