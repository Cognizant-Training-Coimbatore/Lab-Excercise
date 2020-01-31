package demowebdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class prog8_checkbox {
 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(2000);
	WebElement login=driver.findElement(By.linkText("Log in"));
	login.click();
	WebElement rememberme=driver.findElement(By.name("RememberMe"));
	boolean res=rememberme.isSelected();
	if(res==true)
	{
		System.out.println("Already selected");
	}
	else
	{
		System.out.println("not selected, selecting now....");
		rememberme.click();
		Thread.sleep(5000);
		
	}
	driver.quit();}
}