import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg19_object_repositary 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("C:\\Users\\Admin\\Desktop\\Batch_1 Programs\\DemoWebdriver1\\src\\obj.properties");
		obj.load(objfile);
		driver.findElement(By.linkText(obj.getProperty("login"))).click();
		driver.findElement(By.name(obj.getProperty("username"))).sendKeys("sample user");
		driver.findElement(By.name(obj.getProperty("password"))).sendKeys("sample123$");
		Thread.sleep(3000);
		driver.quit();
	}

}
