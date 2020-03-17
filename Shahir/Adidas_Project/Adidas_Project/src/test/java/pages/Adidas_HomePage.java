package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Adidas_HomePage
{
	WebDriver driver;
	public Adidas_HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//Locators
	By adidasLogo = By.xpath("//a[@title='Home']");
	By shop = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/div[1]"); 
	By sports = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-Sports']");
	By brands = By.xpath("//a[@manual_cm_sp='header-_-Brands-_-Brands']");
	By customise = By.xpath("//div[contains(text(),'Customise')]");
	
	By search = By.id("searchInputRedesign");
	
	By mens = By.xpath("//a[@href='https://shop.adidas.co.in/adidas/#category/Pag-50/No-0/0/All/_facet_.GENDER_ss:%28%22MEN%22%29']");
	By womens = By.xpath("//a[@href='https://shop.adidas.co.in/adidas/#category/Pag-50/No-0/0/All/_facet_.GENDER_ss:%28%22WOMEN%22%29']");
	By kids = By.xpath("//a[@href='https://shop.adidas.co.in/adidas/#category/Pag-50/No-0/0/All/_facet_.GENDER_ss:%28%22KIDS%22%29']");
	
	By football = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-football' and contains(text(),'football')]");
	By running = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-running' and contains(text(),'running')]");
	By basketball = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-basketball' and contains(text(),'basketball')]");
	By training = By.xpath("//a[@manual_cm_sp='header-_-Sports-_-training' and contains(text(),'training')]");
	
	By originals = By.xpath("//img[@alt='originals']");
	By neo = By.xpath("//a[@manual_cm_sp='header-_-Brands-_-adidas neo']");
	By stella = By.xpath("//a[@manual_cm_sp='header-_-Brands-_-adidas by stella mccartney']");
	By porsche = By.xpath("//a[@manual_cm_sp='header-_-Brands-_-porsche design sport by adidas']");
	
	By newsLetterSignUp = By.xpath("//a[@title='Newsletter Signup']");
	By account = By.xpath("//a[@title='Account']");
	
	By shopNow = By.xpath("//*[@id=\"parent-to-show\"]/div[1]/div/div[3]/div/div[2]/div/div/div/div[3]/div[1]/a");
	By discover = By.xpath("//*[@id=\"parent-to-show\"]/div[1]/div/div[3]/div/div[2]/div/div/div/div[3]/div[2]/a");
	
	By storeFinder = By.xpath("//a[@href='/storefinder']");
	By accountService = By.xpath("//a[@manual_cm_sp='footer-_-servicecompany info-_-account']");
	By contactUs = By.xpath("//a[@manual_cm_sp='footer-_-servicecompany info-_-contact us']");
	
	By partners = By.xpath("//a[@manual_cm_sp='footer-_-servicecompany info-_-partners']");
	By careers = By.xpath("//a[@manual_cm_sp='footer-_-servicecompany info-_-careers']");
	By press = By.xpath("//a[@manual_cm_sp='footer-_-servicecompany info-_-press']");
	By coorporateInfo = By.xpath("//a[@manual_cm_sp=\"footer-_-servicecompany info-_-corporate information\"]");
	
	//to click on adidas
	public void select_adidas_logo() throws InterruptedException
	{
		driver.findElement(adidasLogo).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select shop
	public void select_shop() throws InterruptedException
	{
		driver.findElement(shop).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select sports
	public void select_sports() throws InterruptedException
	{
		driver.findElement(sports).click();
		TimeUnit.SECONDS.sleep(2);
		
	}
	//to select brands
	public void select_brands() throws InterruptedException
	{
		driver.findElement(brands).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select customise
	public void select_cutomise() throws InterruptedException
	{
		driver.findElement(customise).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select men's section from shop
	public void select_mens() throws InterruptedException
	{
		select_shop();
		driver.findElement(mens).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select women's section from shop
	public void select_womens() throws InterruptedException
	{
		select_shop();
		driver.findElement(womens).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select kid's section from shop
	public void select_kids() throws InterruptedException 
	{
		select_shop();
		driver.findElement(kids).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select football section from sports
	public void select_football() throws InterruptedException 
	{
		select_sports();
		driver.findElement(football).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select running section from sports
	public void select_running() throws InterruptedException 
	{
		select_sports();
		driver.findElement(running).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select basketball from sports
	public void select_basketball() throws InterruptedException 
	{
		select_sports();
		driver.findElement(basketball).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select training from sports
	public void select_training() throws InterruptedException 
	{
		select_sports();
		driver.findElement(training).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select originals from sports
	public void select_originals() throws InterruptedException 
	{
		select_brands();
		driver.findElement(originals).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select neo from sports
	public void select_neo() throws InterruptedException 
	{
		select_brands();
		driver.findElement(neo).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select stella from brands
	public void select_stella() throws InterruptedException 
	{
		select_brands();
		driver.findElement(stella).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select porsche from brands
	public void select_porsche() throws InterruptedException 
	{
		select_brands();
		driver.findElement(porsche).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select shop now option
	public void select_shopNow() throws InterruptedException
	{
		driver.findElement(shopNow).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select discover option
	public void select_discover() throws InterruptedException
	{
		driver.findElement(discover).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select newsletter signup
	public void select_signUp() throws InterruptedException
	{
		driver.findElement(newsLetterSignUp).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select account option
	public void select_account() throws InterruptedException
	{
		driver.findElement(account).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select store finder option
	public void select_storeFinder() throws InterruptedException
	{
		driver.findElement(storeFinder).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select account service from service
	public void select_accountService() throws InterruptedException
	{
		driver.findElement(accountService).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select contact us option
	public void select_contactUs() throws InterruptedException
	{
		driver.findElement(contactUs).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select partners option
	public void select_partners() throws InterruptedException
	{
		driver.findElement(partners).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select careers option
	public void select_careers() throws InterruptedException
	{
		driver.findElement(careers).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select press option
	public void select_press() throws InterruptedException
	{
		driver.findElement(press).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to select corporate information
	public void select_corporateInformation() throws InterruptedException
	{
		driver.findElement(coorporateInfo).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//to search for a product
	public void select_search(String data) throws InterruptedException
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys(data);
		driver.findElement(search).sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(2);
	}
}
