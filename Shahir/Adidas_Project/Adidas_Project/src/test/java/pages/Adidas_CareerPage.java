package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adidas_CareerPage
{
	WebDriver driver;
	public Adidas_CareerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locater
	By career = By.xpath("//*[@id=\"footer\"]/div[3]/div[1]/div/ul[4]/li[8]/a");
	By what = By.id("filterKeyword");
	By where = By.id("filterLocation");
	By find_jobs = By.xpath("//*[@id=\"content__section-search__form\"]/button");
	By senior = By.xpath("//*[@id=\"jobs\"]/li[1]/a");
	By searchjobs = By.xpath("//a[@title='Search Jobs']");
	By moreoptions = By.xpath("//*[@id=\"options-search\"]");
	By team = By.name("optionsFacetsDD_dept");
	By brand = By.name("optionsFacetsDD_brand");
	By type = By.name("optionsFacetsDD_shifttype");
	By search_jobs = By.xpath("//input[@type='submit']");
	By senior_engineer = By.xpath("//a[@class='jobTitle-link']");
	
	public void select_career() throws InterruptedException
	{
		driver.findElement(career).click();
		TimeUnit.SECONDS.sleep(2);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.close();
	    driver.switchTo().window(tabs2.get(1));
	    TimeUnit.SECONDS.sleep(2);
	    
	    driver.manage().deleteAllCookies();
		
		driver.findElement(what).sendKeys("software");
		TimeUnit.SECONDS.sleep(2);
		
		driver.findElement(where).sendKeys("india");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.DOWN).build().perform();
		TimeUnit.SECONDS.sleep(2);
		act.sendKeys(Keys.ENTER).build().perform();
		TimeUnit.SECONDS.sleep(2);
		
		driver.findElement(find_jobs).click();
		TimeUnit.SECONDS.sleep(2);
		
		driver.findElement(senior).click();
		TimeUnit.SECONDS.sleep(2);
		
		ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(0));
		driver.close();
	    driver.switchTo().window(tabs3.get(1));
	    TimeUnit.SECONDS.sleep(2);
	    
	   
	   
		driver.findElements(searchjobs).get(0).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		
		driver.findElement(moreoptions).click();
		TimeUnit.SECONDS.sleep(2);
		
		Select product1 = new Select(driver.findElement(team));
		product1.selectByVisibleText("Engineering");
		TimeUnit.SECONDS.sleep(2);
		
		
		Select product2 = new Select(driver.findElement(brand));
		product2.selectByVisibleText("adidas");
		TimeUnit.SECONDS.sleep(2);
		
		
		Select product3 = new Select(driver.findElement(type));
		product3.selectByVisibleText("Full time");
		TimeUnit.SECONDS.sleep(4);
		

		driver.findElements(search_jobs).get(1).click();
		//should take screenshot
		
		driver.findElements(senior_engineer).get(0).click();
		TimeUnit.SECONDS.sleep(4);
		//should take screenshot
	}
}
