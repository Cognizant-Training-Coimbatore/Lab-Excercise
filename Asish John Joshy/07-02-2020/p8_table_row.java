import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8_table_row {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Asish/table.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
		System.out.println(tablerows.size());
		Thread.sleep(1500);
		driver.quit();
	}

}
