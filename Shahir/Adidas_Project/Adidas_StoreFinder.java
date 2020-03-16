package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import excelUtility.excelReadWrite;

public class Adidas_StoreFinder
{
	WebDriver driver;
	Actions act;
	excelReadWrite excel;
	
	By store = By.xpath("//a[@href='/storefinder']");
	By search = By.id("searchInput");
	By store1 = By.xpath("//*[@id=\"IN474918\"]/div[2]");
	By direction = By.xpath("//a[@href='#directions']");
	
	public Adidas_StoreFinder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click_storefinder() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		String a = excel.excelRead("/Users/shahir/eclipse-workspace/Adidas_Project/search.xlsx", 2, 0);
		act = new Actions(driver);
		driver.findElement(store).click();
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(search).sendKeys(a);
		act.sendKeys(Keys.DOWN).build().perform();
		TimeUnit.SECONDS.sleep(3);
		act.sendKeys(Keys.ENTER).build().perform();
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(store1).click();
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(direction).click();;
		TimeUnit.SECONDS.sleep(4);
	}
}