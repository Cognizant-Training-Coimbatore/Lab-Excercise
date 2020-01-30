import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program10_buying_a_product {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("user654@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
	driver.findElement(By.linkText("Computers")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@title='Show products in category Notebooks']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@value='Add to cart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Shopping cart")).click();
	Select country=new Select(driver.findElement(By.id("CountryId")));
	country.selectByVisibleText("India");
	driver.findElement(By.id("ZipPostalCode")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@class='button-2 estimate-shipping-button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("termsofservice")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("India");
	driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Kottayam");
	driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Pala");
	driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Pala");
	driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("123456");
	driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9876543210");
	driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
	Thread.sleep(1000);
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
