import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_object_rep1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Properties obj=new Properties();
		FileInputStream objfile=new
		FileInputStream("C:\\Users\\Admin\\Desktop\\batch 1 prgms\\demowebdriver\\obj.properties");
		obj.load(objfile);
		driver.findElement(By.linkText(obj.getProperty("login"))).click();
		driver.findElement(By.name(obj.getProperty("username"))).sendKeys("sample user name");
		driver.findElement(By.name(obj.getProperty("password"))).sendKeys("sample123@");
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		

	}

}
