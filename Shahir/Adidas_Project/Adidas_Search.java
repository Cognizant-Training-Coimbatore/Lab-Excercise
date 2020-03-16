package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import excelUtility.excelReadWrite;

public class Adidas_Search
{
	WebDriver driver;
	excelReadWrite excel;
	
	By text = By.id("searchInputRedesign");
	
	public Adidas_Search(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click_search() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		String a = excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/search.xlsx", 0, 0);
		driver.findElement(text).sendKeys(a);
		driver.findElement(text).sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(2);
	}	
}