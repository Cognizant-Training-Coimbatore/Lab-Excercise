import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String username;
		Random rand=new Random();
		int randomnumber=rand.nextInt(1000);
		username="user"+ randomnumber +"@gmail.com";
		System.out.println(username);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("firstname1");
		driver.findElement(By.id("LastName")).sendKeys("lastname1");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys("12345$");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("12345$");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys("12345$");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		WebElement rew=driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
		boolean res=driver.findElement(By.id("termsofservice")).isSelected();
		if(res==true)
		{
			System.out.println("Already Selected");
		}
		else
		{
			System.out.println("Not Selected...Selecting now");
			driver.findElement(By.id("termsofservice")).click();
			Thread.sleep(3000);
			System.out.println("clicked");
		}
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Select product=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		product.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("abc");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("awrssgnb");
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("awrsthgnb");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("614355");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("8976567");
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		System.out.println("Ivde ethi");
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		System.out.println("Ivdeem ethi");
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		System.out.println("Ivde ethi'tta");
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}

		
		
