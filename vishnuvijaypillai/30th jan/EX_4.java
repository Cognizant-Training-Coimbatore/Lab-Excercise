import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.getTitle();
		WebElement link = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		link.click();
		WebElement x1 = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		x1.sendKeys("vvp@ieee.org");
		WebElement x2 = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		x2.sendKeys("vvp1234");
		WebElement x3 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		x3.click();
		WebElement x20 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
		x20.click();
		Thread.sleep(5000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("vvp");
		Thread.sleep(5000);
	    driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("vvp@ieee.org");
	    Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[6]/div/input[2]")).click();
		 Thread.sleep(5000);
		driver.findElement(By.className("cart-label")).click();
		 Thread.sleep(5000);
		driver.findElement(By.id("termsofservice")).click();
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		 Thread.sleep(5000);
		/*Select country=new Select(driver.findElement(By.className("CountryId")));
		country.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("jodhpur");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("pratyekichu onum illa");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("889902");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9999999999");
		 Thread.sleep(5000);*/
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		 Thread.sleep(5000);
		WebElement x13 = driver.findElement(By.xpath("//*[@id=\"paymentmethod_1\"]"));
		x13.click();
		WebElement x14 = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
		x14.click();
		/*WebElement x15 = driver.findElement(By.xpath("//*[@id=\"CardholderName\"]"));
		x15.sendKeys("woijefdoekjdpwaojs");
		WebElement x16 = driver.findElement(By.xpath("//*[@id=\"CardNumber\"]"));
		x16.sendKeys("9999999999999999");
		Select month=new Select(driver.findElement(By.id("ExpireMonth")));
		month.selectByVisibleText("03");
		Select year=new Select(driver.findElement(By.id("ExpireYear")));
		month.selectByVisibleText("2024");
		WebElement x16 = driver.findElement(By.xpath("//*[@id=\"CardCode\"]"));
		x16.sendKeys("0987");*/
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.quit();
		}
	
	}
