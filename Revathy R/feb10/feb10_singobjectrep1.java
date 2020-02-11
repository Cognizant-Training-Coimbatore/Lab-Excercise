package demoWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb10_singobjectrep1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(3000);
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream("C:\\Users\\Admin\\Desktop\\batch 1 programs\\demoWebDriver\\src\\demoWebDriver\\obj.properties");
		obj.load(objfile);
		Thread.sleep(3000);
		driver.findElement(By.linkText(obj.getProperty("login"))).click();
		driver.findElement(By.name(obj.getProperty("username"))).sendKeys("sample user1");
		driver.findElement(By.name(obj.getProperty("password"))).sendKeys("user123$");
		Thread.sleep(3000);
		driver.quit();
		}

}
