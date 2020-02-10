import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class p13_screenshot {
	static WebDriver driver;
	static int i=1;

	public static void main(String[] args) throws IOException{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");	// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Log in")).click();
		takeScreenshot();
		driver.findElement(By.id("Email")).sendKeys("mail@gmail.com");
		takeScreenshot();
	}
	static void takeScreenshot() throws IOException
	{
		File scrfile;
		scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrfile, new File("E:\\p13_screenshot"+i+".png"));
		i++;
	}
}
