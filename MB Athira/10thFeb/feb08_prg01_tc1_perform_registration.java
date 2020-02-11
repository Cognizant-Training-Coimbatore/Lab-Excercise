import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb08_prg01_tc1_perform_registration 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		feb08_prg01_home_page home=new feb08_prg01_home_page(driver);
		home.clickRegisterLinks();
		feb08_prg01_registeration_page register2=new feb08_prg01_registeration_page(driver);
		Thread.sleep(2000);
		register2.selectgender();
		register2.enterFirstname("Ellen");
		register2.enterLastname("John");
		register2.enterUname("ella123@gmail.com");
		register2.enterPword("ellam123");
		register2.enterConfirmPassword("ellam123");
		register2.clickregisterbutton();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
