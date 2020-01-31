package demoWebDriver;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String uname;
		Random rand = new Random();
		int random = rand.nextInt(10000);
		uname = "user"+random+"@gmail.com";
		System.out.println(uname);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("firstname1");
		driver.findElement(By.id("LastName")).sendKeys("lastname");
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.name("Password")).sendKeys("122322");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("122322");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.name("Password")).sendKeys("122322");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("firstname1");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(uname);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("wrogn");
		Select product=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		product.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Kochi");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("mekkad");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("666666");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9999999999");
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();
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
		
	}

}
