package excersice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table"));
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
		int i=tablerows.size();
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> tablecols=table1.findElements(By.tagName("td"));
		int j=tablecols.size();
		WebElement op=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]/input"));
		op.click();
		
		if(i==4)
		{
			System.out.println("number of rows is 4");
		}
		if(j==4)
		{
			System.out.println("number of coloumns is 4");
		}
		

	}

}
