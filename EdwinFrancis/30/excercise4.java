import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("user49@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456$");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"CountryId\"]/option[99]")).click();
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("680003");
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[99]")).click();
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("Kerala");
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("Mayura Apartments");
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("Thrissur");
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("680002");
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("987654321");
		//driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("6012002");
		//driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"PickUpInStore\"]")).click();
	   //driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
	
	
		
		
		
		
		

		
		
		
		
		
		
	

		

	}

}
