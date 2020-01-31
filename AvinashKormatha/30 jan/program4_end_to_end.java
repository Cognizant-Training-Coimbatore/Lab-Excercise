import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program4_end_to_end {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Random r = new Random();
		int random= r.nextInt(1000);
		String s = "user"+random+"@gmail.com";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
	/*	driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("firstname1");
		driver.findElement(By.id("LastName")).sendKeys("lastname");
		driver.findElement(By.id("Email")).sendKeys("abccba123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();*/
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abccba123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		Select country = new Select(driver.findElement(By.name("CountryId")));
		country.selectByVisibleText("India");
		driver.findElement(By.id("ZipPostalCode")).sendKeys("500010");
		driver.findElement(By.name("estimateshipping")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Select bill = new Select(driver.findElement(By.name("billing_address_id")));
		bill.selectByVisibleText("New Address");
		Select country1 = new Select(driver.findElement(By.name("BillingNewAddress.CountryId")));
		country1.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("aaa");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("bbb");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("500000");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("paymentmethod_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here for order details.")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PDF Invoice")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}

}
