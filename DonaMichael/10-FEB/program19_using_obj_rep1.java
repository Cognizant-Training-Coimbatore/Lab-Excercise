import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program19_using_obj_rep1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(2000);
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream("C:\\Users\\Admin\\Desktop\\Batch1 programs\\DemoWebDriver\\src\\obj.properties");
		obj.load(objfile);
		driver.findElement(By.linkText(obj.getProperty("login"))).click();
		driver.findElement(By.name(obj.getProperty("username"))).sendKeys("assd123");
		driver.findElement(By.name(obj.getProperty("password"))).sendKeys("sample123$");
		Thread.sleep(2000);
		driver.quit();
	}

}
