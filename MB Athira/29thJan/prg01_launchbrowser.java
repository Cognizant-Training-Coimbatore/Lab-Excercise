import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg01_launchbrowser 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com");
			String s = driver.getTitle();
			System.out.println(s);
			driver.quit();
		}

	}


