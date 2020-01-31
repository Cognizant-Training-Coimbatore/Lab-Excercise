package demowebdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog16_endtoend{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("user557@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Show products in category Notebooks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Select country=new Select(driver.findElement(By.name("CountryId")));
		country.selectByVisibleText("India");
		driver.findElement(By.id("ZipPostalCode")).sendKeys("123456");
		//driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("checkout")).click();
		//driver.quit();
		
		driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(2000);
driver.findElement(By.linkText("Log out")).click();		
Thread.sleep(2000);
driver.quit();
		
		

	}

}