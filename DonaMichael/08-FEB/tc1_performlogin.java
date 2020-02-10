import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_performlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homepage home=new homepage(driver);
		home.clickRegisterLink();
		loginpage login=new loginpage(driver);
		login.enterUsername("asd12!@gmail.com");
		login.enterPassword("pas12$");
		Thread.sleep(7000);
		driver.quit();
	}

}
