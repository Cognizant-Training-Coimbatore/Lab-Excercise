import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p4_shopping
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shahirm509@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		WebElement rememberme = driver.findElement(By.id("termsofservice"));
		boolean res = rememberme.isSelected();
		rememberme.click();
		driver.findElement(By.id("checkout")).click();
		try
		{
		Select product = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		product.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Coimmbatore");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("G2 Technologies");
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Saravanampatty");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("678013");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567980");
		}
		catch (Exception e)
		{
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();	
	}
}