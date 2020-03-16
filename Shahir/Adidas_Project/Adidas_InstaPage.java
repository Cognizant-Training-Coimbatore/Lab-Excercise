package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Adidas_InstaPage
{
	WebDriver driver;
	
	By instagramicon=By.xpath("//img[@alt='Instagram']");
	By button = By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div/div/button");
	By igtv = By.xpath("//a[@href=\"/adidasoriginals/channel/\"]");
	By item = By.xpath("//a[@href=\"/tv/B54tZaroSt7/\"]");
	By play = By.xpath("//video[@class]");
	
	public Adidas_InstaPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click_On_insta() throws InterruptedException
	{
		driver.findElement(instagramicon).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void click_igtv() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) newtab.get(1));
		driver.findElement(button).click();
		driver.findElement(igtv).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void video_play() throws InterruptedException
	{
		System.out.println("hello");
		TimeUnit.SECONDS.sleep(2);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(item)).click().build().perform();
		driver.findElement(item).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void click_play() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(play).click();
		TimeUnit.SECONDS.sleep(10);
	}
}