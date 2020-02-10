package demoWebdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screen_shot {
static WebDriver driver;
static int i=1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		takescreenshot();
		driver.findElement(By.linkText("Log in")).click();
		takescreenshot();
		driver.findElement(By.name("Email")).sendKeys("zenith123");
		takescreenshot();
		driver.quit();
	}
	static void takescreenshot() throws IOException
	{
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("E:\\screenshot" +i+".png"));
		i++;
		
	}
}

	


