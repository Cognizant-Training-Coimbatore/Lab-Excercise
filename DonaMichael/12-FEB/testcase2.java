import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
		Select drpCountry=new Select(driver.findElement(By.id("country")));
		List<WebElement> listOption=drpCountry.getOptions();/*Get all the option from
		 the dropdown list and assign into list*/
		
		int dropdownCount=listOption.size();/*count the dropdown list and assign into 
		integer variable*/
		String s=Integer.toString(dropdownCount);
		//print the count of dropdown using dropdowncount
		System.out.println("Total number of dropdownlist: "+dropdownCount);
		WebElement text=driver.findElement(By.id("t1"));
		text.sendKeys(s);

	}

}
