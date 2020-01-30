package demoWebDriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jan30_program {

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
		driver.findElement(By.name("estimateshipping")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		Select address= new Select(driver.findElement(By.id("billing-address-select")));
		address.selectByVisibleText("New Address");
		Select country1=new Select(driver.findElement(By.name("BillingNewAddress.CountryId")));
		country1.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Ernakulam");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Thaniyil");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("123456");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("213465");
		driver.findElement(By.xpath("//*[@title='Continue']")).click();
		Thread.sleep(3000);
		Select address1=new Select(driver.findElement(By.name("shipping_address_id")));
		address1.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Click here for order details.")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PDF Invoice")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();

	}

}
