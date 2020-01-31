package demoWebdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class extercise_1_30 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		/*
		 * String username; Random rand=new Random(); int randomnum=rand.nextInt(1000);
		 * username="sowmya_tester_"+randomnum+"@gmail.com" ;
		 * System.out.println(username);
		 */
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("sowmya_tester_682@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("$123abc");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
	
		driver.findElement(By.id("small-searchterms")).sendKeys("computing and internet");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("City")).sendKeys("Coimbatore");
		driver.findElement(By.id("Adress 1")).sendKeys("Thai mookambika pg 2");
		driver.findElement(By.id("Zip / postal code")).sendKeys("576220");
		driver.findElement(By.id("Phone number")).sendKeys("8952025639");
		
	
	
	
	

	}
}