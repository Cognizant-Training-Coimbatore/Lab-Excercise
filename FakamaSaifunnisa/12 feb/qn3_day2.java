package demowedbdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class qn3_day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/testcase3.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Select se=new Select(driver.findElement(By.xpath("//*[@id=\"country1\"]")));
		se.selectByVisibleText("India");
		Thread.sleep(5000);
		Select se1=new Select(driver.findElement(By.id("country2")));
		se1.selectByVisibleText("India");
		String f=se.getFirstSelectedOption().getText();
		String f1=se1.getFirstSelectedOption().getText();
		System.out.println(f1);
		if(f1.equals(f)) {
			js.executeScript("alert('source and destination should not be same');");
			Thread.sleep(5000);
		}
		
		driver.quit();
		
		
	}

}
