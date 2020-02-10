import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_performLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		Registration reg=new Registration(driver);
		reg.LoginPage();
		homepage home=new homepage(driver);
		home.clickRegisterLink();
		loginPage login=new loginPage(driver);
		login.EnterUsername("ash123");
		login.EnterPassword("pass123$");
		Thread.sleep(2000);
		driver.quit();
	}

}
