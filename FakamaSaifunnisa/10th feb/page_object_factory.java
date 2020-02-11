import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_object_factory {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		pgobjects obj=new pgobjects(driver);
		obj.clicklogin();
		obj.setUserName("della");
		obj.setPassword("della123@");
		
	}

}
