package demoWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm_7_select_fromcombo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product =new Select(driver.findElement(By.name("categoty_id")));
product.selectByVisibleText("Databases");
Thread.sleep(5000);
driver.quit();

	}

}
