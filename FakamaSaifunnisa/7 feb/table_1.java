package demowedbdriver;


import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/table.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
		System.out.println(tablerows.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> tablecolomn=table1.findElements(By.tagName("td"));
		System.out.println(tablecolomn.size());
		driver.findElement(By.id("text1")).sendKeys("123");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("text1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("text2")).sendKeys(Keys.CONTROL,"v");
		
		driver.quit();
		
		
		
	}

}
