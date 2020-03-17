package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import excelUtility.excelReadWrite;

public class Adidas_NewsLetterPage
{
	WebDriver driver;
	Actions action;
	excelReadWrite excel;
	
	By newslettersignup = By.xpath("//a[@class='selfservice-link-suas sign-up-and-save-external']");
	By firstname = By.xpath("//input[@id='userName']");
	By lastname = By.xpath("//input[@id='surName']");
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	By confirmpassword = By.xpath("//input[@id='confirmPwd']");
    By signupbutton = By.xpath("//input[@id='registerButton']");
	By signinuser = By.id("usrName");
	By signinpassword = By.id("password");
	By signinbutton = By.xpath("//input[@class='signInButton doLogin']");
	By clicklogin = By.xpath("//input[@class='signInButton doLogin']");
	By guestclick = By.id("guestCheck");
	By guestemail = By.id("email");
	By guestsignupbutton = By.id("guestRegisterButton");
	
	public Adidas_NewsLetterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sign_in() throws InterruptedException, IOException
	{
		action = new Actions(driver);
		driver.findElement(newslettersignup).click();		
	    TimeUnit.SECONDS.sleep(2);
	    excel = new excelReadWrite();
    	
	    for(int i=1;i<5;i++)
	    {
	    	String a = excel.excelRead("Login", i, 1);
	    	String b = excel.excelRead("Login", i, 2);
	    	driver.findElement(signinuser).clear();
	    	driver.findElement(signinpassword).clear();
	    	TimeUnit.SECONDS.sleep(1);
		    driver.findElement(signinuser).sendKeys(a);
			TimeUnit.SECONDS.sleep(1);
		    driver.findElement(signinpassword).sendKeys(b);
			TimeUnit.SECONDS.sleep(1);
			action.moveToElement(driver.findElement(signinbutton));
			driver.findElement(clicklogin).click();
			TimeUnit.SECONDS.sleep(1);
	    }
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.id("logout_Link")).click();
			TimeUnit.SECONDS.sleep(2); 	
	}
	
	//for guest user
	public void click_continue_as_guest() throws InterruptedException, IOException
	{
		driver.get("https://www.adidas.co.in/");
		TimeUnit.SECONDS.sleep(2);
	    driver.findElement(newslettersignup).click();
		for(int i=1;i<4;i++)
		{
			String c = excel.excelRead("GuestLogin", i, 1);
		    TimeUnit.SECONDS.sleep(2);
			driver.findElement(guestclick).click();
			TimeUnit.SECONDS.sleep(1);
			driver.findElement(guestemail).clear();
			TimeUnit.SECONDS.sleep(1);
			driver.findElement(guestemail).sendKeys(c);
			TimeUnit.SECONDS.sleep(1);
			driver.findElement(guestsignupbutton).click();
			TimeUnit.SECONDS.sleep(2);
		}
	}	
	
	//for registration
	public void new_customer() throws InterruptedException, IOException
	{
		driver.get("https://www.adidas.co.in/");
		TimeUnit.SECONDS.sleep(2);
	    driver.findElement(newslettersignup).click();
	    TimeUnit.SECONDS.sleep(2);
	    driver.findElement(By.id("gender4")).click();
	    
	    TimeUnit.SECONDS.sleep(4);
	    for(int i=1;i<8;i++)
	    {
	    	String d = excel.excelRead("RegisterUser", i, 1);
	    	String e = excel.excelRead("RegisterUser", i, 2);
	    	String f = excel.excelRead("RegisterUser", i, 3);
	    	String g = excel.excelRead("RegisterUser", i, 4);
	    	String h = excel.excelRead("RegisterUser", i, 5);
	    	
	    	driver.findElements(firstname).get(1).clear();
	    	driver.findElements(lastname).get(1).clear();
	    	driver.findElements(email).get(1).clear();
	    	driver.findElements(password).get(2).clear();
	    	driver.findElements(confirmpassword).get(1).clear();
	    	TimeUnit.SECONDS.sleep(2);
	    	
	    	driver.findElements(firstname).get(1).sendKeys(d);
		    driver.findElements(lastname).get(1).sendKeys(e);
		    driver.findElements(email).get(1).sendKeys(f);
		    driver.findElements(password).get(2).sendKeys(g);
		    driver.findElements(confirmpassword).get(1).sendKeys(h);
		    driver.findElement(signupbutton).click();
		    TimeUnit.SECONDS.sleep(2);
	    }
	}
}