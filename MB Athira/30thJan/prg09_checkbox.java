import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg09_checkbox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement rememberme = driver.findElement(By.name("RememberMe"));
		boolean res = rememberme.isSelected();
		if(res==true)
		{
			System.out.println("Already selected");
		}
		else
		{
			System.out.println("Not Selected..Selecting now");
			rememberme.click();
			Thread.sleep(3000);
		}
		
		driver.quit();
		
	}

}
