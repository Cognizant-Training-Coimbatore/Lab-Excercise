package excersice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
		Select selectDropdown = new Select(driver.findElement(By.id("country")));
	       
        //Get all the option from dropdown list and assign into List
        List<WebElement> listOptionDropdown = selectDropdown.getOptions();
       
        // Count the item dropdown list and assign into integer variable
        int dropdownCount = listOptionDropdown.size();
       String s=Integer.toString(dropdownCount);
        //Print the total count of dropdown list using integer variable
        System.out.println("Total Number of item count in dropdown list = "  + dropdownCount);
        WebElement text=driver.findElement(By.id("t1"));
		text.sendKeys(s);
	}

}
