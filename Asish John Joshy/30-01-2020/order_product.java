import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class order_product {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("user235@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456!");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Music");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		driver.findElement(By.id("termsofservice")).click();//name and id are same. Can use By.name("RememberMe") also
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("billing-address-select")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		try
		{
		driver.findElement(By.id("BillingNewAddress_CountryId")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[99]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Thiruvalla");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Chakkara House");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("686564");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("944623459");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.id("paymentmethod_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
	}

}
