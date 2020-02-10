package demoWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage 
{
WebDriver driver;
WebElement username, password;
loginpage(WebDriver driver)
{
	this.driver = driver;
}
void enterusername(String s)
{
	username = driver.findElement(By.className("Emali"));
	username.sendKeys("zenith123");
}
void enterpassword(String s)
{
	password = driver.findElement(By.className("Password"));
	password.sendKeys("zenith123");
}
}
