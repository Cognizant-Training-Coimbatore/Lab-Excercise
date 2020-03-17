package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import excelUtility.excelReadWrite;

public class Adidas_SearchPage
{
	WebDriver driver;
	excelReadWrite excel;
	
	By text = By.id("searchInputRedesign");
	By text2 = By.id("searchTextBox");
	
	public Adidas_SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click_valid_search() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		String a = excel.excelRead("Search", 1, 1);
		driver.findElement(text).sendKeys(a);
		driver.findElement(text).sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(2);
	}
	public void click_invalid_search() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		String a = excel.excelRead("Search", 3, 1);
		driver.findElement(text2).sendKeys(a);
		driver.findElement(text2).sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(2);
	}
}