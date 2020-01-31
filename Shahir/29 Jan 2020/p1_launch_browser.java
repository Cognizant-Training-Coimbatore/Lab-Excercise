import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_launch_browser
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.drivr", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
