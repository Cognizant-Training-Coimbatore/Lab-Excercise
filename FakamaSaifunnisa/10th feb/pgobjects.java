import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pgobjects
{
	WebDriver driver;
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(name="Email")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;

	public pgobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String strUserName)
	{
		username.sendKeys(strUserName);
	}
	public void setPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	public void clicklogin()
	{
		login.click();
	}
	
}
