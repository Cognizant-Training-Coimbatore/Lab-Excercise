import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn03_buy_a_item {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		driver.findElement(By.id("Email")).sendKeys("user477@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123$456");
		WebElement login1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		login1.click();
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("Laptop");
		WebElement search1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		search1.click();
		WebElement cart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
		cart.click();
		WebElement shopping = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
		shopping.click();
		WebElement agree = driver.findElement(By.id("termsofservice"));
		agree.click();
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		continue1.click();
		Thread.sleep(2000);
		WebElement continue2 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		continue2.click();
		Thread.sleep(2000);
		WebElement continue3 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
		continue3.click();
		Thread.sleep(2000);
		WebElement continue4 = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
		continue4.click();
		Thread.sleep(4000);
		WebElement continue5 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
		continue5.click();
		Thread.sleep(4000);
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
		confirm.click();
		Thread.sleep(2000);
		WebElement acknowledge = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input"));
		acknowledge.click();
		driver.quit();
		
	}

}
