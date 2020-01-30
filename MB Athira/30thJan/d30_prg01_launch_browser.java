import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class d30_prg01_launch_browser
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://jpetstore.cfapps.io/");
			WebElement store = driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
			store.click();
			String t = driver.getTitle();
			System.out.println(t);
			driver.quit();
		}

}
