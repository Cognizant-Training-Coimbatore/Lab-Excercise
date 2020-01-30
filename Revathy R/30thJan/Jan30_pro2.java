package demoWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan30_pro2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement link=driver.findElement(By.linkText("Enter the Store"));
		link.click();
		String s=driver.getTitle();		
		System.out.println(s);
		WebElement link2=driver.findElement(By.xpath("//*[@href='/catalog/categories/FISH']"));
		link2.click();
		Thread.sleep(3000);
		WebElement link3=driver.findElement(By.xpath("//*[@href='/catalog/products/FI-SW-01']"));
		link3.click();
		Thread.sleep(3000);
		WebElement link4=driver.findElement(By.linkText("Add to Cart"));
		link4.click();
		WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.clear();
		quantity.sendKeys("10");
		Thread.sleep(3000);
		driver.quit();

	}

}
