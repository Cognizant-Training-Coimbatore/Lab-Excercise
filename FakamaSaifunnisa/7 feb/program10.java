package demowedbdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/table.html");
		Thread.sleep(5000);
		driver.findElement(By.id("b1")).click();
		Alert alertbox=driver.switchTo().alert();
		alertbox.accept();
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
