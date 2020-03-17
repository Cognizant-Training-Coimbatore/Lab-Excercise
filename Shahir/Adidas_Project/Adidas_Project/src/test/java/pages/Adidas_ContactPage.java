package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Adidas_ContactPage
{
	WebDriver driver;
	ChromeOptions options;
	Actions action;
	
	By contactus = By.xpath("//*[@id=\"footer\"]/div[3]/div[1]/div/ul[4]/li[4]/a");
	By language = By.id("langDropdown");
	By name = By.id("name");
	By lastname = By.id("lastname");
	By email = By.id("email");
	By subject = By.id("subject");
	By telephone = By.id("telephone");
	By comment = By.id("comment");
	By captcha = By.xpath("//*[@id=\"recaptcha-anchor\"]");
	By submit = By.xpath("//*[@id=\"contactForm\"]/div[3]/div/button/span");
	
	public Adidas_ContactPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void contactus() throws InterruptedException
	{
		//Select ContactUs menu
		driver.findElement(contactus).click();
		TimeUnit.SECONDS.sleep(1);
	}
	public void lanuage() throws InterruptedException
	{
		action = new Actions(driver);
		//Select Language Drop down
		driver.findElement(language).click();
		TimeUnit.SECONDS.sleep(1);
		action.sendKeys(Keys.DOWN).build().perform();
		TimeUnit.SECONDS.sleep(2);
		action.sendKeys(Keys.ENTER).build().perform();
		TimeUnit.SECONDS.sleep(1);
	}
	
	public void firstname(String value)
	{
		driver.findElement(name).sendKeys(value);
	}
	
	public void lastname(String value)
	{
		driver.findElement(lastname).sendKeys(value);
	}
	
	public void email(String value)
	{
		driver.findElement(email).sendKeys(value);
	}
	
	public void subject(String value)
	{
		driver.findElement(subject).sendKeys(value);
	}
	
	public void telephone(String value)
	{
		driver.findElement(telephone).sendKeys(value);
	}
	
	public void comment(String value)
	{
		driver.findElement(comment).sendKeys(value);
	}
	
	public void captcha()
	{
		driver.switchTo().defaultContent();
		driver.findElement(captcha).click();
	}
	
	public void submit()
	{
		driver.switchTo().defaultContent();
		driver.findElement(submit).click();
	}
}