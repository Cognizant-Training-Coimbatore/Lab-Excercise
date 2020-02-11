package demoWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Revathy/table.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table"));
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
		System.out.println(tablerows.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> tablecols=table1.findElements(By.tagName("td"));
		System.out.println(tablecols.size());
		driver.quit();

	}

}
