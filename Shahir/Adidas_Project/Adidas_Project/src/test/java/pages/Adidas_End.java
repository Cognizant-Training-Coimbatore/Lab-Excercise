package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import excelUtility.excelReadWrite;

public class Adidas_End
{
	WebDriver driver;
	excelReadWrite excel;
	
	By newslettersignup = By.xpath("//a[@class='selfservice-link-suas sign-up-and-save-external']");
	By signinuser = By.id("usrName");
	By signinpassword = By.id("password");
	By clicklogin = By.xpath("//input[@class='signInButton doLogin']");
	By text = By.id("searchTextBox");
	By jersey = By.xpath("//*[@id=\"productSearchTab_CG0040\"]/a/img");
	By ball = By.xpath("//*[@id=\"productSearchTab_DY2571\"]/a/img");
	By jerseysize = By.xpath("//*[@id=\"facetSizeDetails\"]/label[5]");
	By ballsize = By.xpath("//*[@id=\"facetSizeDetails\"]/label[2]");
	By addtobag = By.id("addToBagBtn");
	By checkout = By.id("checkForRedirectLink");
	By logout = By.id("logout_Link");
	
	public Adidas_End(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fullscript() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		driver.findElement(newslettersignup).click();		
	    TimeUnit.SECONDS.sleep(2);
	    String a = excel.excelRead("Login", 4, 1);
    	String b = excel.excelRead("Login", 4, 2);
    	String c = excel.excelRead("Search", 1, 1);
		driver.findElement(signinuser).sendKeys(a);
		driver.findElement(signinpassword).sendKeys(b);
		driver.findElement(clicklogin).click();
		TimeUnit.SECONDS.sleep(7);
		driver.findElement(text).sendKeys(c);
		driver.findElement(text).sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(text).sendKeys(Keys.ESCAPE);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(jersey).click();
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(0));
		driver.close();
		driver.switchTo().window(newtab.get(1));
		driver.findElement(jerseysize).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(addtobag).click();
		TimeUnit.SECONDS.sleep(3);
		//driver.findElement(checkout).click();
	}
	
	public void logout() throws InterruptedException
	{
		driver.findElement(logout).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void fullscript2() throws InterruptedException, IOException
	{
		excel = new excelReadWrite();
		driver.navigate().to("https://www.adidas.co.in");
		driver.findElement(newslettersignup).click();		
	    TimeUnit.SECONDS.sleep(2);
	    String a = excel.excelRead("Login", 4, 1);
    	String b = excel.excelRead("Login", 4, 2);
    	String c = excel.excelRead("Search", 2, 1);
		driver.findElement(signinuser).sendKeys(a);
		driver.findElement(signinpassword).sendKeys(b);
		driver.findElement(clicklogin).click();
		TimeUnit.SECONDS.sleep(7);
		driver.findElement(text).sendKeys(c);
		driver.findElement(text).sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(text).sendKeys(Keys.ESCAPE);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(ball).click();
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(0));
		driver.close();
		driver.switchTo().window(newtab.get(1));
		driver.findElement(ballsize).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(addtobag).click();
		TimeUnit.SECONDS.sleep(3);
		//driver.findElement(checkout).click();
	}
	
	public void logout2() throws InterruptedException
	{
		driver.findElement(logout).click();
		TimeUnit.SECONDS.sleep(2);
	}
}