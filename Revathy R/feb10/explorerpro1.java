package demoWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class explorerpro1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(5000);
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
