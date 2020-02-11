import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_performlogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		home_page home=new home_page(driver);
		home.clickRegisterLink();
		loginpage login=new loginpage(driver);
		login.enterusername("della123");
		login.enterPassword("della123");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
