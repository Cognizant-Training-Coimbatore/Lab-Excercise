package excersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html");
		WebElement text=driver.findElement(By.id("t1"));
		text.sendKeys("hello revathy");
		WebElement text1=driver.findElement(By.id("t2"));
		text1.sendKeys("hello revathy");
	}

}
