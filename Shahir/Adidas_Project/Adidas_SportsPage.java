package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adidas_SportsPage
{
	WebDriver driver;
	ChromeOptions options;
	//ArrayList<String> newtab;
	
	By sports = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-Sports']");
	By football = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-football' and contains(text(),'football')]");
	By allshoe = By.xpath("//*[@id=\"headlines\"]/div[2]/a[5]/strong"); 
	By ballmodel = By.id("productSearchTab_FH7340");
	By ballsize = By.xpath("//*[@id=\"facetSizeDetails\"]/label[2]");
	By addtobag = By.id("addToBagBtn");
	By checkout = By.id("checkForRedirectLink");
	
	public Adidas_SportsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void select_sports() throws InterruptedException
	{
		driver.findElement(sports).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void select_football() throws InterruptedException 
	{
		driver.findElement(football).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void select_allshoe()
	{
		
		driver.findElement(allshoe).click();
		//still in Tab 0
	}
	
	public void select_shoemodel() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		TimeUnit.SECONDS.sleep(2);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(ballmodel).click();
	}
	
	public void select_shoesize() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(2));
		driver.findElement(ballsize).click();
	}
	
	public void select_addtobag()
	{
		driver.findElement(addtobag).click();
	}
	
	public void select_checkout()
	{
		driver.findElement(checkout).click();
	}
}