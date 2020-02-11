import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc2_performlogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		home_page home=new home_page(driver);
		home.clickRegisterLink();
		registration_page register=new registration_page(driver);
		register.selectgender(1);
		register.enterfirstname("della");
		register.enterlastname("paul");
		register.enterusername("della123@gmail.com");
		register.enterPassword("della123");
		register.ConfirmPassword("della123");
		String em=register.getvalues();
		String ps=register.getPass();
		register.clickRegister();
		Thread.sleep(3000);
		register.logout();
		Thread.sleep(3000);
		register.login();
		Thread.sleep(2000);
		register.enterusername(em);
		register.enterPassword(ps);
		register.login();
		Thread.sleep(5000);
		driver.quit();
		


	}

}
