package demoWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		Thread.sleep(5000);
		driver.quit();
	}

}
