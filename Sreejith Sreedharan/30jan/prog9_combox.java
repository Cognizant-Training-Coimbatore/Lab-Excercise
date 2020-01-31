package demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog9_combox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Thread.sleep(2000);
		Select product=new Select(driver.findElement(By.name("category_id")));
		int total=product.getOptions().size();
		System.out.println(total);
		driver.quit();

	}

}
