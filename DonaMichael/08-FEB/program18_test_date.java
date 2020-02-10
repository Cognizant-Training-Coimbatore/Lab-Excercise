
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program18_test_date {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Batch1%20programs/DemoWebDriver/webdriver.html");
		Date d=new Date();
		SimpleDateFormat format=new SimpleDateFormat("MMM dd, yyyy");
		String exp_output=format.format(d);
		WebElement datefield=driver.findElement(By.xpath("/html/body/b"));
		String act_output=datefield.getText();
		if(exp_output.equals(act_output))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		driver.quit();

	}

}
