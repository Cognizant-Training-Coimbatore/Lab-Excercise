package demoWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage 
{
	WebDrive driver driver;
	WebElement registerlink;
	
	homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void clickRegsterlink()
	{
		registerlink = driver.findElement(By.linkText("Register"));
		registerlink.click();
	}

}
