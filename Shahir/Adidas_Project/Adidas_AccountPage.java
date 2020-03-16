package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Adidas_AccountPage
{
	WebDriver driver;
	
	//Locators
	By home=By.xpath("//a[@alt='Home']");
	By text=By.id("searchInputRedesign");
	By email=By.id("dwfrm_login_username");
	By password=By.id("dwfrm_login_password");
	By login=By.name("dwfrm_login_login");
	By register=By.name("dwfrm_createaccount_register");
	By create_email=By.name("dwfrm_createaccount_email");
	By forgetpass=By.id("PasswordReset");
	By email_for_forgetpass=By.id("dwfrm_requestpassword_email");
	By cont=By.id("sendBtn");
	By close=By.id("confirmBtn");
	
	public  Adidas_AccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//To navigate to homepage
	public void Click_home() throws InterruptedException
	{
		driver.findElement(home).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	//searching
	public void search() throws InterruptedException
	{
	driver.findElement(text).sendKeys("jersey");
	driver.findElement(text).sendKeys(Keys.ENTER);
	TimeUnit.SECONDS.sleep(2);


	}
	//To Login
	public void Login(String mail,String pass) throws InterruptedException
	{
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		TimeUnit.SECONDS.sleep(2);
		
	}
	//To Register
	public void Register(String mail) throws InterruptedException
	{
		driver.findElement(create_email).sendKeys(mail);
		driver.findElement(register).click();
		TimeUnit.SECONDS.sleep(2);
	}
	//Forget password
	public void Forget_password(String value) throws InterruptedException
	{
		driver.findElement(email).sendKeys(value);
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(forgetpass).click();
		TimeUnit.SECONDS.sleep(5);
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(cont)).click().build().perform();
		TimeUnit.SECONDS.sleep(5);
		action.moveToElement(driver.findElement(close)).click().build().perform();
		TimeUnit.SECONDS.sleep(2);
	}
}
