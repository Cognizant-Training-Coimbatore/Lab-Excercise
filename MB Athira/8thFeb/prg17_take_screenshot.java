import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class prg17_take_screenshot 
{
	static WebDriver driver;
	static int i=1;
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		takeScreenshot();
		driver.findElement(By.linkText("Log in")).click();
		takeScreenshot();
		driver.findElement(By.name("Email")).sendKeys("athi123");
		takeScreenshot();
		
	}

	static void takeScreenshot() throws IOException 
	{
		// TODO Auto-generated method stub
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("D:\\screenshot"+i+".png"));
		i++;
	}

}
