package demoWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		System.out.println(driver.getTitle());
		WebElement login1=driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/div[1]/div/a[1]/img"));
		login1.click();
		Thread.sleep(5000);
		WebElement log=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		log.click();
		Thread.sleep(5000);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		fish.click();
		Thread.sleep(5000);
		WebElement no=driver.findElement(By.id("lines0.quantity"));
		no.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();
	}

}
