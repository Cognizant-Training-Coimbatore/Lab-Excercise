package demowedbdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_sction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement linkcomputers=driver.findElement(By.linkText("COMPUTERS"));
		Actions action=new Actions(driver);
		action.moveToElement(linkcomputers).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Notebooks")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
