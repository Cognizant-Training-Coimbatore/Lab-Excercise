package testngDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
		Select countries=new Select(driver.findElement(By.id("country")));
		int total=countries.getOptions().size();
		String s=Integer.toString(total);
		driver.findElement(By.id("t1")).sendKeys(s);
		Thread.sleep(3000);
	}

}
