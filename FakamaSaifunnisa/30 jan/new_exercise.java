package demowedbdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_exercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		register.click();
		Thread.sleep(5000);
		
		driver.close();

	}

}
