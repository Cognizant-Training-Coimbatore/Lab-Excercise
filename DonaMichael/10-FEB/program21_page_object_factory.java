import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program21_page_object_factory {
//page object model
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		pgobjects obj=new pgobjects(driver);
		obj.clickLogin();
		obj.setUserName("Dona");
		obj.setPassword("Dona");
	}

}
