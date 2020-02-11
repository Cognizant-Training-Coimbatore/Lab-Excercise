import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prg22_firefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.getTitle();
		System.out.println(s);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
