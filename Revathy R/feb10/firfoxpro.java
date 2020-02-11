package demoWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firfoxpro {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
