package demoWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb10_pageobjectfactory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		pgobjects obj=new pgobjects(driver);
		obj.clickLogin();
		obj.setUserName("revathy");
		obj.setPassword("revathy");

	}

}
