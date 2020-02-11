import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_row {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("file:///D:/Della/table2.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
		System.out.println(tablerows.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]"));
		List<WebElement> tablecols=table1.findElements(By.tagName("td"));
		System.out.println(tablecols.size());
		driver.quit();
		

	}

}
