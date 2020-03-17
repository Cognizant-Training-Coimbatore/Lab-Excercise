package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adidas_MensPage
{
	WebDriver driver;

	public Adidas_MensPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//locators
	By men = By.xpath("//a[@id='MEN']");
	By sweatshirt = By.xpath("//a[@manual_cm_sp=\"global_header-_-men-_-clothing-_-sweatshirts\"]");
	By hoodie = By.xpath("//img[@title=\"men's ADIDAS TRAINING FZ HOODED TRACK TOP \"]");
	By addToCart = By.xpath("//button[@id=\"addToBagBtn\"]");
	By size = By.xpath("//label[@data-size-val=\"XL\"]");
	By checkout = By.id("checkForRedirectLink");
	By shop = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/div[1]");
	By mens = By.xpath("//a[@href='https://shop.adidas.co.in/adidas/#category/Pag-50/No-0/0/All/_facet_.GENDER_ss:%28%22MEN%22%29']");

	
	public void select_shop() throws InterruptedException
	{
		//driver.navigate().to("https://www.google.com");
		driver.findElement(shop).click();
		TimeUnit.SECONDS.sleep(2);
	}
	public void select_mens() throws InterruptedException
	{
		driver.findElement(mens).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to click on men section
	public void select_men() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(3);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(0));
		driver.close();
		driver.switchTo().window((String) newtab.get(1));
		driver.findElement(men).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select sweatshirt options
	public void select_SweatShirt() throws InterruptedException
	{
		driver.findElement(sweatshirt).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select an item
	public void select_hoodie() throws InterruptedException
	{
		
		driver.findElement(hoodie).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select size
	public void select_size() throws InterruptedException
	{
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(0));
		driver.close();
		driver.switchTo().window(newtab.get(1));
		driver.findElement(size).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to add the item to the cart
	public void select_addToCart() throws InterruptedException
	{
		driver.findElement(addToCart).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to procced to checkout
	public void select_chechkOut() throws InterruptedException
	{
		driver.findElement(checkout).click();
		TimeUnit.SECONDS.sleep(2);
	}
}
